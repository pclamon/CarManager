package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Submodel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int submodelId;

    private String submodelName;
    private int modelId;

    public int getSubmodelId()
    {
        return submodelId;
    }

    public String getSubmodelName()
    {
        return submodelName;
    }

    public int getModelId()
    {
        return modelId;
    }
}
