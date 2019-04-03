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
        //int vehicleId, String VIN, int vehicleYear, String nickname, String makeName, String modelName, String submodelName, String tradedForNickname, String tradedForSubmodelName, int tradedForVehicleYear, String tradedForModelName
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeName, mo.modelName, s.submodelName, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
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
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeName, mo.modelName, s.submodelName, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
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
        TypedQuery<Make> query = db.em().
                createQuery("SELECT m FROM Make m", Make.class);
        List<Make> makes = query.getResultList();

        return ok(views.html.vehicleadd.render(makes));
    }

    @Transactional
    public Result getModels()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String makeId = form.get("make");

        TypedQuery<Model> query = db.em().
                createQuery("SELECT m FROM Model m WHERE MakeId = " + makeId, Model.class);
        List<Model> modelsList = query.getResultList();

        DropDown.Menu[] models = new DropDown.Menu[modelsList.size()];

        for (int i =0; i < modelsList.size(); i++)
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

        for (int i =0; i < submodelsList.size(); i++)
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
        String modelId = form.get("modelId");
        String tradedForVehicleId = form.get("tradedForVehicleId");
        String submodelId = form.get("submodelId");

        vehicle.setVIN(VIN);
        //vehicle.setVehicleYear(vehicleYear);
        vehicle.setNickname(nickname);
        //vehicle.setModelId(modelId);
        //vehicle.setTradedForVehicleId(tradedForVehicleId);
        //vehicle.setSubmodelId(submodelId);

        db.em().persist(vehicle);

        return ok("saved");
    }

    @Transactional(readOnly = true)
    public Result getVehicleEdit(int vehicleId)
    {
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeName, mo.modelName, s.submodelName, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
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
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeName, mo.modelName, s.submodelName, v2.nickname, s2.submodelName, v2.vehicleYear, mo2.modelName) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                        "LEFT JOIN Submodel s ON v.submodelId = s.submodelId " +
                             "JOIN Make m ON m.makeId = mo.makeId " +
                        "LEFT JOIN Vehicle v2 ON v.tradedForVehicleId = v2.vehicleId " +
                        "LEFT JOIN Model mo2 ON v2.modelId = mo2.modelId " +
                        "LEFT JOIN Submodel s2 ON v2.submodelId = s2.submodelId " +
                        "LEFT JOIN Make m2 ON m2.makeId = mo2.makeId", VehicleDetail.class);
        List<VehicleDetail> vehicles = vehiclesQuery.getResultList();

        return ok(views.html.vehicleedit.render(vehicle, vehicles));
    }

    @Transactional
    public Result postVehicleEdit(int vehicleId)
    {
        return ok("saved");
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
