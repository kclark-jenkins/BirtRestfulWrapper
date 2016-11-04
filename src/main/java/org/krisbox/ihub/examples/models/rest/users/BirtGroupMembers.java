package org.krisbox.ihub.examples.models.rest.users;

import org.krisbox.ihub.examples.models.rest.fields.BirtUser;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtGroupMembers {
    private BirtUser[] BirtUser;

    private String totalCount;

    private String fetchHandle;

    public BirtUser[] getBirtUser ()
    {
        return BirtUser;
    }

    public void setBirtUser (BirtUser[] BirtUser)
    {
        this.BirtUser = BirtUser;
    }

    public String getTotalCount ()
    {
        return totalCount;
    }

    public void setTotalCount (String totalCount)
    {
        this.totalCount = totalCount;
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
        return "ClassPojo [BirtUser = "+BirtUser+", totalCount = "+totalCount+", fetchHandle = "+fetchHandle+"]";
    }
}
