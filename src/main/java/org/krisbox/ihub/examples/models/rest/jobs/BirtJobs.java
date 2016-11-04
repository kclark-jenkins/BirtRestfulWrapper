package org.krisbox.ihub.examples.models.rest.jobs;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtJobs {
    private String totalCount;

    private JobList[] jobList;

    private String fetchHandle;

    public String getTotalCount ()
    {
        return totalCount;
    }

    public void setTotalCount (String totalCount)
    {
        this.totalCount = totalCount;
    }

    public JobList[] getJobList ()
    {
        return jobList;
    }

    public void setJobList (JobList[] jobList)
    {
        this.jobList = jobList;
    }

    public String getFetchHandle ()
    {
        return fetchHandle;
    }

    public void setFetchHandle (String fetchHandle)
    {
        this.fetchHandle = fetchHandle;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [totalCount = "+totalCount+", jobList = "+jobList+", fetchHandle = "+fetchHandle+"]";
    }
}
