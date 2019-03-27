package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Make
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int makeId;

    private String makeName;

    public int getMakeId()
    {
        return makeId;
    }

    public String getMakeName()
    {
        return makeName;
    }
}
