package org.krisbox.ihub.examples.models.rest.jobs;

public class Links
{
    private Status status;

    private Delete delete;

    public Status getStatus ()
    {
        return status;
    }

    public void setStatus (Status status)
    {
        this.status = status;
    }

    public Delete getDelete ()
    {
        return delete;
    }

    public void setDelete (Delete delete)
    {
        this.delete = delete;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [status = "+status+", delete = "+delete+"]";
    }
}
