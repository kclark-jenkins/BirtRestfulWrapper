package org.krisbox.ihub.examples.models.rest.groups;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtUserGroups {
    private GroupList[] groupList;

    private String totalCount;

    private String fetchHandle;

    public GroupList[] getGroupList ()
    {
        return groupList;
    }

    public void setGroupList (GroupList[] groupList)
    {
        this.groupList = groupList;
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
        return "ClassPojo [groupList = "+groupList+", totalCount = "+totalCount+", fetchHandle = "+fetchHandle+"]";
    }
}
