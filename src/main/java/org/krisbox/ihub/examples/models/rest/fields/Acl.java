package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class Acl {
    private String[] permissions;

    public String[] getPermissions ()
    {
        return permissions;
    }

    public void setPermissions (String[] permissions)
    {
        this.permissions = permissions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [permissions = "+permissions+"]";
    }
}
