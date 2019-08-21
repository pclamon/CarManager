package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.DropDown;
import models.*;

import models.VINDecoder.VINDecode;
import play.Logger;
import play.libs.Json;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class VehicleController extends Controller
{
    private JPAApi db;
    private FormFactory formFactory;

    @Inject
    public VehicleController(JPAApi db, FormFactory formFactory)
    {
        this.db = db;
        this.formFactory = formFactory;
    }

    @Transactional(readOnly = true)
    public Result getVehicle(int vehicleId)
    {
        //int vehicleId, String VIN, int vehicleYear, String nickname, int makeId, String makeName, int modelId, String modelName, Integer submodelId, String submodelName, Integer tradedForVehicleId, String tradedForNickname, String tradedForSubmodelName, Integer tradedForVehicleYear, String tradedForModelName
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeId, m.makeName, mo.modelId, mo.modelName, s.submodelId, s.submodelName, v.tradedForVehicleId, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                        "LEFT JOIN Submodel s ON v.submodelId = s.submodelId " +
                        "JOIN Make m ON m.makeId = mo.makeId " +
                        "LEFT JOIN Vehicle v2 ON v.tradedForVehicleId = v2.vehicleId " +
                        "LEFT JOIN Model mo2 ON v2.modelId = mo2.modelId " +
                        "LEFT JOIN Submodel s2 ON v2.submodelId = s2.submodelId " +
                        "LEFT JOIN Make m2 ON m2.makeId = mo2.makeId " +
                        "WHERE v.vehicleId = :vehicleId", VehicleDetail.class);
        query.setParameter("vehicleId", vehicleId);
        VehicleDetail vehicle = query.getSingleResult();

        return ok(views.html.vehicle.render(vehicle));
    }

    @Transactional(readOnly = true)
    public Result getVehicles()
    {
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeId, m.makeName, mo.modelId, mo.modelName, s.submodelId, s.submodelName, v.tradedForVehicleId, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                        "LEFT JOIN Submodel s ON v.submodelId = s.submodelId " +
                        "JOIN Make m ON m.makeId = mo.makeId " +
                        "LEFT JOIN Vehicle v2 ON v.tradedForVehicleId = v2.vehicleId " +
                        "LEFT JOIN Model mo2 ON v2.modelId = mo2.modelId " +
                        "LEFT JOIN Submodel s2 ON v2.submodelId = s2.submodelId " +
                        "LEFT JOIN Make m2 ON m2.makeId = mo2.makeId", VehicleDetail.class);
        List<VehicleDetail> vehicles = query.getResultList();

        return ok(views.html.vehicles.render(vehicles));
    }

    @Transactional
    public Result getVehicleAdd()
    {
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeId, m.makeName, mo.modelId, mo.modelName, s.submodelId, s.submodelName, v.tradedForVehicleId, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                        "LEFT JOIN Submodel s ON v.submodelId = s.submodelId " +
                        "JOIN Make m ON m.makeId = mo.makeId " +
                        "LEFT JOIN Vehicle v2 ON v.tradedForVehicleId = v2.vehicleId " +
                        "LEFT JOIN Model mo2 ON v2.modelId = mo2.modelId " +
                        "LEFT JOIN Submodel s2 ON v2.submodelId = s2.submodelId " +
                        "LEFT JOIN Make m2 ON m2.makeId = mo2.makeId", VehicleDetail.class);
        List<VehicleDetail> vehicles = query.getResultList();

        TypedQuery<Make> makeQuery = db.em().
                createQuery("SELECT m FROM Make m", Make.class);
        List<Make> makes = makeQuery.getResultList();

        return ok(views.html.vehicleadd.render(vehicles, makes));
    }

    @Transactional
    public Result getModels()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String makeId = form.get("make");

        TypedQuery<Model> query = db.em().
                createQuery("SELECT mo FROM Model mo WHERE MakeId = " + makeId, Model.class);
        List<Model> modelsList = query.getResultList();

        DropDown.Menu[] models = new DropDown.Menu[modelsList.size()];

        for (int i = 0; i < modelsList.size(); i++)
        {
            models[i] = new DropDown.Menu(modelsList.get(i).getModelName(), modelsList.get(i).getModelId());
        }

        DropDown dropDown = new DropDown(true, "blah", models);
        return ok(Json.toJson(dropDown));
    }

    @Transactional
    public Result getSubmodels()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String modelId = form.get("model");

        TypedQuery<Submodel> query = db.em().
                createQuery("SELECT s FROM Submodel s WHERE ModelId = " + modelId, Submodel.class);
        List<Submodel> submodelsList = query.getResultList();

        DropDown.Menu[] submodels = new DropDown.Menu[submodelsList.size()];

        for (int i = 0; i < submodelsList.size(); i++)
        {
            submodels[i] = new DropDown.Menu(submodelsList.get(i).getSubmodelName(), submodelsList.get(i).getSubmodelId());
        }

        DropDown dropDown = new DropDown(true, "blah", submodels);
        return ok(Json.toJson(dropDown));
    }

    @Transactional
    public Result postVehicleAdd()
    {
        Vehicle vehicle = new Vehicle();

        DynamicForm form = formFactory.form().bindFromRequest();

        String VIN = form.get("VIN");
        String vehicleYear = form.get("vehicleYear");
        String nickname = form.get("nickname");

        if (nickname.length() == 0 || nickname.equals(" "))
        {
            nickname = null;
        }
        String modelId = form.get("model");
        String submodel = form.get("submodelId");
        Integer submodelId = null;

        if (submodel != null && submodel.length() > 0)
        {
            submodelId = Integer.parseInt(submodel);
        }

        String tradedForVehicle = form.get("tradedForVehicleId");
        Integer tradedForVehicleId = null;

        if (tradedForVehicle != null && tradedForVehicle.length() > 0)
        {
            if (!tradedForVehicle.equals("0"))
            {
                tradedForVehicleId = Integer.parseInt(tradedForVehicle);
            }
        }

        vehicle.setVIN(VIN);
        vehicle.setVehicleYear(Integer.parseInt(vehicleYear));
        vehicle.setNickname(nickname);
        vehicle.setModelId(Integer.parseInt(modelId));
        vehicle.setTradedForVehicleId(tradedForVehicleId);
        vehicle.setSubmodelId(submodelId);

        db.em().persist(vehicle);

        return redirect("/vehicle/" + vehicle.getVehicleId());
    }

    @Transactional(readOnly = true)
    public Result getVehicleEdit(int vehicleId)
    {
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeId, m.makeName, mo.modelId, mo.modelName, s.submodelId, s.submodelName, v.tradedForVehicleId, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                        "LEFT JOIN Submodel s ON v.submodelId = s.submodelId " +
                        "JOIN Make m ON m.makeId = mo.makeId " +
                        "LEFT JOIN Vehicle v2 ON v.tradedForVehicleId = v2.vehicleId " +
                        "LEFT JOIN Model mo2 ON v2.modelId = mo2.modelId " +
                        "LEFT JOIN Submodel s2 ON v2.submodelId = s2.submodelId " +
                        "LEFT JOIN Make m2 ON m2.makeId = mo2.makeId " +
                        "WHERE v.vehicleId = :vehicleId", VehicleDetail.class);
        query.setParameter("vehicleId", vehicleId);
        VehicleDetail vehicle = query.getSingleResult();

        TypedQuery<VehicleDetail> vehiclesQuery = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeId, m.makeName, mo.modelId, mo.modelName, s.submodelId, s.submodelName, v.tradedForVehicleId, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                        "LEFT JOIN Submodel s ON v.submodelId = s.submodelId " +
                        "JOIN Make m ON m.makeId = mo.makeId " +
                        "LEFT JOIN Vehicle v2 ON v.tradedForVehicleId = v2.vehicleId " +
                        "LEFT JOIN Model mo2 ON v2.modelId = mo2.modelId " +
                        "LEFT JOIN Submodel s2 ON v2.submodelId = s2.submodelId " +
                        "LEFT JOIN Make m2 ON m2.makeId = mo2.makeId", VehicleDetail.class);
        List<VehicleDetail> vehicles = vehiclesQuery.getResultList();

        TypedQuery<Make> makeQuery = db.em().
                createQuery("SELECT m FROM Make m", Make.class);
        List<Make> makes = makeQuery.getResultList();

        return ok(views.html.vehicleedit.render(vehicle, vehicles, makes));
    }

    @Transactional
    public Result postVehicleEdit(int vehicleId)
    {
        TypedQuery<Vehicle> query = db.em().createQuery("SELECT v FROM Vehicle v WHERE vehicleId = :vehicleId", Vehicle.class);
        query.setParameter("vehicleId", vehicleId);
        Vehicle vehicle = query.getSingleResult();

        DynamicForm form = formFactory.form().bindFromRequest();
        String nickname = form.get("nickname");

        if (nickname.length() == 0 || nickname.equals(" "))
        {
            nickname = null;
        }

        String vehicleYear = form.get("vehicleYear");
        String modelId = form.get("model");
        String submodel = form.get("submodel");
        Integer submodelId = null;

        if (submodel != null && submodel.length() > 0)
        {
            submodelId = Integer.parseInt(submodel);
        }

        String VIN = form.get("VIN");
        String tradedForVehicle = form.get("tradedForVehicleId");
        Integer tradedForVehicleId = null;

        if (tradedForVehicle != null && tradedForVehicle.length() > 0)
        {
            if (!tradedForVehicle.equals("0"))
            {
                tradedForVehicleId = Integer.parseInt(tradedForVehicle);
            }
        }

        vehicle.setNickname(nickname);
        vehicle.setVehicleYear(Integer.parseInt(vehicleYear));
        vehicle.setModelId(Integer.parseInt(modelId));
        vehicle.setSubmodelId(submodelId);
        vehicle.setVIN(VIN);
        vehicle.setTradedForVehicleId(tradedForVehicleId);
        db.em().persist(vehicle);

        return redirect("/vehicle/" + vehicleId);
    }

    @Transactional
    public Result getVehicleDelete(int vehicleId)
    {
        Vehicle vehicle = db.em().find(Vehicle.class, vehicleId);
        db.em().remove(vehicle);

        return redirect("/vehicles");
    }

    @Transactional
    public Result getVINDecode()
    {
        return ok(views.html.vindecode.render());
    }

    @Transactional
    public Result postVINDecode()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        VINDecode VINDecode = null;
        String VIN = form.get("VIN");
        String vehicleYear = form.get("vehicleYear");

        try
        {
            URL url = new URL("https://vpic.nhtsa.dot.gov/api/vehicles/decodevinvalues/" + VIN + "?format=json&modelyear=" + vehicleYear);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            Logger.debug("VIN API status: " + request.getResponseCode());
            Logger.debug("URL: " + url.toString());

            ObjectMapper objectMapper = new ObjectMapper();
            VINDecode = objectMapper.readValue(url, VINDecode.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Logger.error(e.getMessage());
        }

        return ok(VINDecode.getResults().get(0).getMake());
    }
}