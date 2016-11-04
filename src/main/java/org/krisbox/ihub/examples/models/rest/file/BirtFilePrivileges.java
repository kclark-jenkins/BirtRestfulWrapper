package org.krisbox.ihub.examples.models.rest.file;

import org.krisbox.ihub.examples.models.rest.fields.Acl;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtFilePrivileges {
    private String id;
    private String description;
    private String name;
    private Acl acl;
    private BirtFile file;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Acl getAcl ()
    {
        return acl;
    }

    public void setAcl (Acl acl)
    {
        this.acl = acl;
    }

    public BirtFile getFile ()
    {
        return file;
    }

    public void setFile (BirtFile file)
    {
        this.file = file;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", description = "+description+", name = "+name+"acl = "+acl+", file = "+file+"]";
    }
}
