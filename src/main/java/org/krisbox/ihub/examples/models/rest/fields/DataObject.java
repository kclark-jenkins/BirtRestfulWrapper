package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class DataObject {
    private String resultSetDisplayName;
    private ColumnSchema[] columnSchema;
    private String resultSetName;
    private Data[] data;

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public String getResultSetDisplayName ()
    {
        return resultSetDisplayName;
    }

    public void setResultSetDisplayName (String resultSetDisplayName)
    {
        this.resultSetDisplayName = resultSetDisplayName;
    }

    public ColumnSchema[] getColumnSchema ()
    {
        return columnSchema;
    }

    public void setColumnSchema (ColumnSchema[] columnSchema)
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
        return "ClassPojo [resultSetDisplayName = "+resultSetDisplayName+", columnSchema = "+columnSchema+", resultSetName = "+resultSetName+", [data = "+data+"]]";
    }
}
