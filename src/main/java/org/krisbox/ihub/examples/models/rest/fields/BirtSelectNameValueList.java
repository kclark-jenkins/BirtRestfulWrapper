package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtSelectNameValueList {
    private BirtSelectNameValue[] selectNameValue;

    public BirtSelectNameValue[] getBirtSelectNameValue ()
    {
        return selectNameValue;
    }

    public void setBirtSelectNameValue (BirtSelectNameValue[] selectNameValue)
    {
        this.selectNameValue = selectNameValue;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [selectNameValue = "+selectNameValue+"]";
    }
}
