package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleDetail
{
    @Id
    private int vehicleId;

    private String VIN;
    private int vehicleYear;
    private String nickname;
    private String makeName;
    private String modelName;
    private String submodelName;
    private String tradedForNickname;
    private String tradedForSubmodelName;
    private Integer tradedForVehicleYear;
    private String tradedForModelName;

    public VehicleDetail(int vehicleId, String VIN, int vehicleYear, String nickname, String makeName, String modelName, String submodelName, String tradedForNickname, String tradedForSubmodelName, Integer tradedForVehicleYear, String tradedForModelName)
    {
        this.vehicleId = vehicleId;
        this.VIN = VIN;
        this.vehicleYear = vehicleYear;
        this.nickname = nickname;
        this.makeName = makeName;
        this.modelName = modelName;
        this.submodelName = submodelName;
        this.tradedForNickname = tradedForNickname;
        this.tradedForSubmodelName = tradedForSubmodelName;
        this.tradedForVehicleYear = tradedForVehicleYear;
        this.tradedForModelName = tradedForModelName;
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

    public String getTradedForNickname()
    {
        return tradedForNickname;
    }

    public String getTradedForSubmodelName()
    {
        return tradedForSubmodelName;
    }

    public Integer getTradedForVehicleYear()
    {
        return tradedForVehicleYear;
    }

    public String getTradedForModelName()
    {
        return tradedForModelName;
    }

    public String getTradedForTitle()
    {

        if (this.tradedForModelName == null)
        {
            return "";
        }
        else if (this.tradedForNickname == null && this.tradedForSubmodelName == null)
        {
            return this.tradedForVehicleYear + " " + this.tradedForModelName;
        }
        else if (this.tradedForNickname == null)
        {
            return this.tradedForVehicleYear + " " + this.tradedForModelName + " " + this.tradedForSubmodelName;
        }
        else
        {
            return this.tradedForNickname;
        }
    }

    public String getVehicleTitle()
    {
        if (this.nickname == null && this.submodelName == null)
        {
            return this.vehicleYear + " " + this.modelName;
        }
        else if (this.nickname == null)
        {
            return this.vehicleYear + " " + this.modelName + " " + this.submodelName;
        }
        else
        {
            return this.nickname;
        }
    }
}
