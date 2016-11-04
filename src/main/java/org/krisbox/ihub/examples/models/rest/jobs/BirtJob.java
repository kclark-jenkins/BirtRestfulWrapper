package org.krisbox.ihub.examples.models.rest.jobs;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtJob {
    private String pageCount;

    private String jobType;

    private String nextStartTime;

    private String completionTime;

    private String runLatestVersion;

    private String jobId;

    private String inputFileName;

    private String inputFileId;

    private String actualOutputFileName;

    private String parameterFileId;

    private String state;

    private String notifyCount;

    private String outputFileSize;

    private String parameterFileName;

    private String jobName;

    private String requestedOutputFileName;

    private String startTime;

    private String durationSeconds;

    private String routedtoNode;

    private String priority;

    private String submissionTime;

    private String owner;

    private String actualOutputFileId;

    public String getPageCount ()
    {
        return pageCount;
    }

    public void setPageCount (String pageCount)
    {
        this.pageCount = pageCount;
    }

    public String getJobType ()
    {
        return jobType;
    }

    public void setJobType (String jobType)
    {
        this.jobType = jobType;
    }

    public String getNextStartTime ()
    {
        return nextStartTime;
    }

    public void setNextStartTime (String nextStartTime)
    {
        this.nextStartTime = nextStartTime;
    }

    public String getCompletionTime ()
    {
        return completionTime;
    }

    public void setCompletionTime (String completionTime)
    {
        this.completionTime = completionTime;
    }

    public String getRunLatestVersion ()
    {
        return runLatestVersion;
    }

    public void setRunLatestVersion (String runLatestVersion)
    {
        this.runLatestVersion = runLatestVersion;
    }

    public String getJobId ()
    {
        return jobId;
    }

    public void setJobId (String jobId)
    {
        this.jobId = jobId;
    }

    public String getInputFileName ()
    {
        return inputFileName;
    }

    public void setInputFileName (String inputFileName)
    {
        this.inputFileName = inputFileName;
    }

    public String getInputFileId ()
    {
        return inputFileId;
    }

    public void setInputFileId (String inputFileId)
    {
        this.inputFileId = inputFileId;
    }

    public String getActualOutputFileName ()
    {
        return actualOutputFileName;
    }

    public void setActualOutputFileName (String actualOutputFileName)
    {
        this.actualOutputFileName = actualOutputFileName;
    }

    public String getParameterFileId ()
    {
        return parameterFileId;
    }

    public void setParameterFileId (String parameterFileId)
    {
        this.parameterFileId = parameterFileId;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getNotifyCount ()
    {
        return notifyCount;
    }

    public void setNotifyCount (String notifyCount)
    {
        this.notifyCount = notifyCount;
    }

    public String getOutputFileSize ()
    {
        return outputFileSize;
    }

    public void setOutputFileSize (String outputFileSize)
    {
        this.outputFileSize = outputFileSize;
    }

    public String getParameterFileName ()
    {
        return parameterFileName;
    }

    public void setParameterFileName (String parameterFileName)
    {
        this.parameterFileName = parameterFileName;
    }

    public String getJobName ()
    {
        return jobName;
    }

    public void setJobName (String jobName)
    {
        this.jobName = jobName;
    }

    public String getRequestedOutputFileName ()
    {
        return requestedOutputFileName;
    }

    public void setRequestedOutputFileName (String requestedOutputFileName)
    {
        this.requestedOutputFileName = requestedOutputFileName;
    }

    public String getStartTime ()
    {
        return startTime;
    }

    public void setStartTime (String startTime)
    {
        this.startTime = startTime;
    }

    public String getDurationSeconds ()
    {
        return durationSeconds;
    }

    public void setDurationSeconds (String durationSeconds)
    {
        this.durationSeconds = durationSeconds;
    }

    public String getRoutedtoNode ()
    {
        return routedtoNode;
    }

    public void setRoutedtoNode (String routedtoNode)
    {
        this.routedtoNode = routedtoNode;
    }

    public String getPriority ()
    {
        return priority;
    }

    public void setPriority (String priority)
    {
        this.priority = priority;
    }

    public String getSubmissionTime ()
    {
        return submissionTime;
    }

    public void setSubmissionTime (String submissionTime)
    {
        this.submissionTime = submissionTime;
    }

    public String getOwner ()
    {
        return owner;
    }

    public void setOwner (String owner)
    {
        this.owner = owner;
    }

    public String getActualOutputFileId ()
    {
        return actualOutputFileId;
    }

    public void setActualOutputFileId (String actualOutputFileId)
    {
        this.actualOutputFileId = actualOutputFileId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pageCount = "+pageCount+", jobType = "+jobType+", nextStartTime = "+nextStartTime+", completionTime = "+completionTime+", runLatestVersion = "+runLatestVersion+", jobId = "+jobId+", inputFileName = "+inputFileName+", inputFileId = "+inputFileId+", actualOutputFileName = "+actualOutputFileName+", parameterFileId = "+parameterFileId+", state = "+state+", notifyCount = "+notifyCount+", outputFileSize = "+outputFileSize+", parameterFileName = "+parameterFileName+", jobName = "+jobName+", requestedOutputFileName = "+requestedOutputFileName+", startTime = "+startTime+", durationSeconds = "+durationSeconds+", routedtoNode = "+routedtoNode+", priority = "+priority+", submissionTime = "+submissionTime+", owner = "+owner+", actualOutputFileId = "+actualOutputFileId+"]";
    }
}
