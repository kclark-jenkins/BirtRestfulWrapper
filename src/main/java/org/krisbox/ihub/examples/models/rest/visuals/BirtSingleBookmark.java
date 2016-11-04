package org.krisbox.ihub.examples.models.rest.visuals;

import org.krisbox.ihub.examples.models.rest.fields.BirtBookmarks;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtSingleBookmark {
    private BirtBookmarks[] bookmarks;

    public BirtBookmarks[] getBirtBookmarks ()
    {
        return bookmarks;
    }

    public void setBirtBookmarks (BirtBookmarks[] bookmarks)
    {
        this.bookmarks = bookmarks;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [bookmarks = "+bookmarks+"]";
    }
}
