package org.krisbox.ihub.examples.models.rest.visuals;

import org.krisbox.ihub.examples.models.rest.fields.BirtNameValuePair;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtParametersPickList {
    private BirtNameValuePair[] nameValuePair;

    public BirtNameValuePair[] getBirtNameValuePair ()
    {
        return nameValuePair;
    }

    public void setBirtNameValuePair (BirtNameValuePair[] nameValuePair)
    {
        this.nameValuePair = nameValuePair;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nameValuePair = "+nameValuePair+"]";
    }
}
