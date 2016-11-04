package org.krisbox.ihub.examples.models.rest.users;

import org.krisbox.ihub.examples.models.rest.fields.BirtUser;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtRemoveGroupMember {
    private BirtUser[] users;

    private String totalCount;

    private String fetchHandle;

    public BirtUser[] getBirtUser ()
    {
        return users;
    }

    public void setBirtUser (BirtUser[] users)
    {
        this.users = users;
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
        return "ClassPojo [users = "+users+", totalCount = "+totalCount+", fetchHandle = "+fetchHandle+"]";
    }
}
