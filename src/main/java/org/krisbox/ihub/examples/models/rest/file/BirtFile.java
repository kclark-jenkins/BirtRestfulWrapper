package org.krisbox.ihub.examples.models.rest.file;

import org.krisbox.ihub.examples.models.rest.fields.ItemList;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtFile {
    private String id;
    private String pageCount;
    private String fileType;
    private String timeStamp;
    private String description;
    private String name;
    private String size;
    private String totalCount;
    private ItemList itemList;
    private String fetchHandle;
    private String folder;
    private String owner;
    private String version;

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

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    public String getTotalCount ()
    {
        return totalCount;
    }

    public void setTotalCount (String totalCount)
    {
        this.totalCount = totalCount;
    }

    public ItemList getItemList ()
    {
        return itemList;
    }

    public void setItemList (ItemList itemList)
    {
        this.itemList = itemList;
    }

    public String getFetchHandle ()
    {
        return fetchHandle;
    }

    public void setFetchHandle (String fetchHandle)
    {
        this.fetchHandle = fetchHandle;
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


    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", pageCount = "+pageCount+", fileType = "+fileType+", timeStamp = "+timeStamp+", description = "+description+", name = "+name+", size = "+size+ "totalCount = "+totalCount+", itemList = "+itemList+", fetchHandle = "+fetchHandle+"owner = "+owner+", version = "+version+"]";
    }
}
