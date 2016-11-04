package org.krisbox.ihub.examples.models.rest.visuals;

import org.krisbox.ihub.examples.models.rest.fields.Data;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtReportDocData {
    private Data[] data;

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+"]";
    }
}
