package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;

    private String VIN;
    private int vehicleYear;
    private String nickname;
    private int modelId;
    private Integer submodelId;
    private Integer tradedForVehicleId;

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

    public int getModelId()
    {
        return modelId;
    }

    public Integer getSubmodelId()
    {
        return submodelId;
    }

    public Integer getTradedForVehicleId()
    {
        return tradedForVehicleId;
    }
}
