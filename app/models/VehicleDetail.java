package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleDetail
{
    @Id
    private int vehicleId;

    //vehicleId, VIN, vehicleYear, nickname, makeName, modelName, submodelName
    private String VIN;
    private int vehicleYear;
    private String nickname;
    private String makeName;
    private String modelName;
    private String submodelName;

    public VehicleDetail(int vehicleId, String VIN, int vehicleYear, String nickname, String makeName, String modelName, String submodelName)
    {
        this.vehicleId = vehicleId;
        this.VIN = VIN;
        this.vehicleYear = vehicleYear;
        this.nickname = nickname;
        this.makeName = makeName;
        this.modelName = modelName;
        this.submodelName = submodelName;
    }

    public int getVehicleId()
    {
        return vehicleId;
    }

    public String getVIN()
    {
        return VIN;
    }

    public int getVehicleYear()
    {
        return vehicleYear;
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getMakeName()
    {
        return makeName;
    }

    public String getModelName()
    {
        return modelName;
    }

    public String getSubmodelName()
    {
        return submodelName;
    }
}