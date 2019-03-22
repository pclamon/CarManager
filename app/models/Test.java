package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test
{
    @Id
    private int testId;
    private String testName;

    public String getTestName()
    {
        return testName;
    }

    public void setTestName(String testName)
    {
        this.testName = testName;
    }
}
