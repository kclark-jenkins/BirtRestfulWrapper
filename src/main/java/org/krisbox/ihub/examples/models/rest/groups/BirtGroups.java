package org.krisbox.ihub.examples.models.rest.groups;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtGroups {
    private String id;
    private String email;
    private String description;
    private String name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
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

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", email = "+email+", description = "+description+", name = "+name+"]";
    }
}
