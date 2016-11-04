package org.krisbox.ihub.examples.models.rest.version;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtVersion {
    private String minor;

    private String patch;

    private String major;

    public String getMinor ()
    {
        return minor;
    }

    public void setMinor (String minor)
    {
        this.minor = minor;
    }

    public String getPatch ()
    {
        return patch;
    }

    public void setPatch (String patch)
    {
        this.patch = patch;
    }

    public String getMajor ()
    {
        return major;
    }

    public void setMajor (String major)
    {
        this.major = major;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [minor = "+minor+", patch = "+patch+", major = "+major+"]";
    }
}
