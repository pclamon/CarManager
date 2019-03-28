package controllers;

import models.*;

import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
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
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeName, mo.modelName, s.submodelName, v2.nickname) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                                       "JOIN Submodel s ON v.submodelId = s.submodelId " +
                                       "JOIN Make m ON m.makeId = mo.makeId " +
                                       "JOIN Vehicle v2 ON v.tradedForVehicleId = v2.vehicleId " +
                        "WHERE v.vehicleId = :vehicleId", VehicleDetail.class);
        query.setParameter("vehicleId", vehicleId);
        VehicleDetail vehicle = query.getSingleResult();

        return ok(views.html.vehicle.render(vehicle));
    }

    @Transactional(readOnly = true)
    public Result getVehicles()
    {
        //vehicleId, VIN, vehicleYear, nickname, makeName, modelName, submodelName, tradedForVehicleId
        TypedQuery<VehicleDetail> query = db.em().
                createQuery("SELECT NEW VehicleDetail(v.vehicleId, v.VIN, v.vehicleYear, v.nickname, m.makeName, mo.modelName, s.submodelName, v.tradedForVehicleId) " +
                        "FROM Vehicle v JOIN Model mo ON v.modelId = mo.modelId " +
                                       "JOIN Submodel s ON v.submodelId = s.submodelId " +
                                       "JOIN Make m ON m.makeId = mo.makeId", VehicleDetail.class);
        List<VehicleDetail> vehicles = query.getResultList();

        return ok(views.html.vehicles.render(vehicles));
    }
}
