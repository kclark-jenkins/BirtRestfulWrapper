package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class ColumnSchema {
    private String typeName;

    private String dataType;

    private String visibility;

    private String alias;

    private String name;

    private String allowExport;

    private String label;

    public String getTypeName ()
    {
        return typeName;
    }

    public void setTypeName (String typeName)
    {
        this.typeName = typeName;
    }

    public String getDataType ()
    {
        return dataType;
    }

    public void setDataType (String dataType)
    {
        this.dataType = dataType;
    }

    public String getVisibility ()
    {
        return visibility;
    }

    public void setVisibility (String visibility)
    {
        this.visibility = visibility;
    }

    public String getAlias ()
    {
        return alias;
    }

    public void setAlias (String alias)
    {
        this.alias = alias;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAllowExport ()
    {
        return allowExport;
    }

    public void setAllowExport (String allowExport)
    {
        this.allowExport = allowExport;
    }

    public String getLabel ()
    {
        return label;
    }

    public void setLabel (String label)
    {
        this.label = label;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [typeName = "+typeName+", dataType = "+dataType+", visibility = "+visibility+", alias = "+alias+", name = "+name+", allowExport = "+allowExport+", label = "+label+"]";
    }
}
