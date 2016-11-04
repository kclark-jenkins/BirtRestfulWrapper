package org.krisbox.ihub.examples.models.rest.version;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtVersionApi {
    private String version;

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [version = "+version+"]";
    }
}
