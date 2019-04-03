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

    public void setVehicleId(int vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getVIN()
    {
        return VIN;
    }

    public void setVIN(String VIN)
    {
        this.VIN = VIN;
    }

    public int getVehicleYear()
    {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear)
    {
        this.vehicleYear = vehicleYear;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public int getModelId()
    {
        return modelId;
    }

    public void setModelId(int modelId)
    {
        this.modelId = modelId;
    }

    public Integer getSubmodelId()
    {
        return submodelId;
    }

    public void setSubmodelId(Integer submodelId)
    {
        this.submodelId = submodelId;
    }

    public Integer getTradedForVehicleId()
    {
        return tradedForVehicleId;
    }

    public void setTradedForVehicleId(Integer tradedForVehicleId)
    {
        this.tradedForVehicleId = tradedForVehicleId;
    }
}
