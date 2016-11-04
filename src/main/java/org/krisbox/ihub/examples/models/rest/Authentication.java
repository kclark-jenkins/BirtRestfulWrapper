package org.krisbox.ihub.examples.models.rest;

import org.krisbox.ihub.examples.models.rest.fields.BirtUser;

/**
 * Created by kclark on 11/4/16.
 */
public class Authentication {
    private String authToken;

    private BirtUser user;

    private String adminRights;

    public String getAuthToken ()
    {
        return authToken;
    }

    public void setAuthToken (String authToken)
    {
        this.authToken = authToken;
    }

    public BirtUser getUser ()
    {
        return user;
    }

    public void setUser (BirtUser user)
    {
        this.user = user;
    }

    public String getAdminRights ()
    {
        return adminRights;
    }

    public void setAdminRights (String adminRights)
    {
        this.adminRights = adminRights;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [authToken = "+authToken+", user = "+user+", adminRights = "+adminRights+"]";
    }
}
