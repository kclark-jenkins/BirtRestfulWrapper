package org.krisbox.ihub.examples.models.rest.visuals;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtResultSet {
    private String resultSetDisplayName;

    private BirtColumnSchema[] columnSchema;

    private String resultSetName;

    public String getResultSetDisplayName ()
    {
        return resultSetDisplayName;
    }

    public void setResultSetDisplayName (String resultSetDisplayName)
    {
        this.resultSetDisplayName = resultSetDisplayName;
    }

    public BirtColumnSchema[] getBirtColumnSchema ()
    {
        return columnSchema;
    }

    public void setBirtColumnSchema (BirtColumnSchema[] columnSchema)
    {
        this.columnSchema = columnSchema;
    }

    public String getResultSetName ()
    {
        return resultSetName;
    }

    public void setResultSetName (String resultSetName)
    {
        this.resultSetName = resultSetName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [resultSetDisplayName = "+resultSetDisplayName+", columnSchema = "+columnSchema+", resultSetName = "+resultSetName+"]";
    }
}
