package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtUser {
    private String id;
    private String username;
    private String email;
    private String homeFolder;
    private String password;
    private String description;

    public void setId() { this.id = id; }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getHomeFolder ()
    {
        return homeFolder;
    }

    public void setHomeFolder (String homeFolder)
    {
        this.homeFolder = homeFolder;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }


    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", username = "+username+", email = "+email+", homeFolder = "+homeFolder+", description = "+description+", password = "+password+"]";
    }
}
