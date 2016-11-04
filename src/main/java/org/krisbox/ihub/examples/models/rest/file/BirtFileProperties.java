package org.krisbox.ihub.examples.models.rest.file;

import org.krisbox.ihub.examples.models.rest.fields.Acl;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtFileProperties {
    private Acl acl;

    private BirtFile file;

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
        return "ClassPojo [acl = "+acl+", file = "+file+"]";
    }
}
