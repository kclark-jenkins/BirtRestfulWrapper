package org.krisbox.ihub.examples.models.rest.jobs;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtJobExecute {
    private String connectionHandle;

    private String status;

    private String objectId;

    private String outputFileType;

    public String getConnectionHandle ()
    {
        return connectionHandle;
    }

    public void setConnectionHandle (String connectionHandle)
    {
        this.connectionHandle = connectionHandle;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getObjectId ()
    {
        return objectId;
    }

    public void setObjectId (String objectId)
    {
        this.objectId = objectId;
    }

    public String getOutputFileType ()
    {
        return outputFileType;
    }

    public void setOutputFileType (String outputFileType)
    {
        this.outputFileType = outputFileType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [connectionHandle = "+connectionHandle+", status = "+status+", objectId = "+objectId+", outputFileType = "+outputFileType+"]";
    }
}
