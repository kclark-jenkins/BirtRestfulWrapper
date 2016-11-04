package org.krisbox.ihub.examples.models.rest.visuals;

import org.krisbox.ihub.examples.models.rest.fields.BirtParameters;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtGetReportParameters {
    private BirtParameters[] parameters;

    public BirtParameters[] getBirtParameters ()
    {
        return parameters;
    }

    public void setBirtParameters (BirtParameters[] parameters)
    {
        this.parameters = parameters;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [parameters = "+parameters+"]";
    }
}
