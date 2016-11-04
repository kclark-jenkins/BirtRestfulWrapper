package org.krisbox.ihub.examples.models.rest.jobs;

public class BirtJobRecurring {
    private String jobId;

    private Links links;

    public String getJobId ()
    {
        return jobId;
    }

    public void setJobId (String jobId)
    {
        this.jobId = jobId;
    }

    public Links getLinks ()
    {
        return links;
    }

    public void setLinks (Links links)
    {
        this.links = links;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [jobId = "+jobId+", links = "+links+"]";
    }
}
