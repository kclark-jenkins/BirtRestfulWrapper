package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtBookmarks {
    private String bookmarkValue;

    private String bookmarkType;

    private String elementType;

    public String getBookmarkValue ()
    {
        return bookmarkValue;
    }

    public void setBookmarkValue (String bookmarkValue)
    {
        this.bookmarkValue = bookmarkValue;
    }

    public String getBookmarkType ()
    {
        return bookmarkType;
    }

    public void setBookmarkType (String bookmarkType)
    {
        this.bookmarkType = bookmarkType;
    }

    public String getElementType ()
    {
        return elementType;
    }

    public void setElementType (String elementType)
    {
        this.elementType = elementType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [bookmarkValue = "+bookmarkValue+", bookmarkType = "+bookmarkType+", elementType = "+elementType+"]";
    }
}
