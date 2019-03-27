package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int modelId;

    private String modelName;
    private int makeId;

    public int getModelId()
    {
        return modelId;
    }

    public String getModelName()
    {
        return modelName;
    }

    public int getMakeId()
    {
        return makeId;
    }
}
