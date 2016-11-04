package org.krisbox.ihub.examples.models.rest.jobs;

public class BirtJobStatus {
    private String status;

    private BirtJob job;

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public BirtJob getJob ()
    {
        return job;
    }

    public void setJob (BirtJob job)
    {
        this.job = job;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [status = "+status+", job = "+job+"]";
    }
}
