package org.krisbox.ihub.examples.models.rest.fields;

import org.krisbox.ihub.examples.models.rest.file.BirtFile;

/**
 * Created by kclark on 11/4/16.
 */
public class ItemList {
    private BirtFile[] file;

    public BirtFile[] getFile ()
    {
        return file;
    }

    public void setFile (BirtFile[] file)
    {
        this.file = file;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [file = "+file+"]";
    }
}
