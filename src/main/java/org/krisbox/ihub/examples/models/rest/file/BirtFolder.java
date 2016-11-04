package org.krisbox.ihub.examples.models.rest.file;

import org.krisbox.ihub.examples.models.rest.fields.ItemList;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtFolder {
    private String totalCount;

    private ItemList itemList;

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

    @Override
    public String toString()
    {
        return "ClassPojo [totalCount = "+totalCount+", itemList = "+itemList+"]";
    }
}
