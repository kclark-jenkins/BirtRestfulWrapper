package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class FileList {
    private String folder;
    private String id;
    private String pageCount;
    private String fileType;
    private String timeStamp;
    private String description;
    private String name;
    private String owner;
    private String version;
    private String size;

    public String getFolder ()
    {
        return folder;
    }

    public void setFolder (String folder)
    {
        this.folder = folder;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getPageCount ()
    {
        return pageCount;
    }

    public void setPageCount (String pageCount)
    {
        this.pageCount = pageCount;
    }

    public String getFileType ()
    {
        return fileType;
    }

    public void setFileType (String fileType)
    {
        this.fileType = fileType;
    }

    public String getTimeStamp ()
    {
        return timeStamp;
    }

    public void setTimeStamp (String timeStamp)
    {
        this.timeStamp = timeStamp;
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

    public String getOwner ()
    {
        return owner;
    }

    public void setOwner (String owner)
    {
        this.owner = owner;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [folder = "+folder+", id = "+id+", pageCount = "+pageCount+", fileType = "+fileType+", timeStamp = "+timeStamp+", description = "+description+", name = "+name+", owner = "+owner+", version = "+version+", size = "+size+"]";
    }
}
