package org.krisbox.ihub.examples.models.rest.fields;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtParameters {
    private String position;

    private String isDynamicSelectionList;

    private String isViewParameter;

    private String isGroupPromptText;

    private String[] selectValueList;

    private String isPassword;

    private String helpText;

    private String controlType;

    private String isHidden;

    private String autoSuggestThreshold;

    private String cascadingParentName;

    private String isStartExpanded;

    private String isAdHoc;

    private String dataType;

    private String isRequired;

    private String name;

    private String value;

    private BirtSelectNameValueList selectNameValueList;

    private String isDefaultValueIsNull;

    private String group;

    private String defaultValue;

    private String displayName;

    private String dataSourceType;

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public String getIsDynamicSelectionList ()
    {
        return isDynamicSelectionList;
    }

    public void setIsDynamicSelectionList (String isDynamicSelectionList)
    {
        this.isDynamicSelectionList = isDynamicSelectionList;
    }

    public String getIsViewParameter ()
    {
        return isViewParameter;
    }

    public void setIsViewParameter (String isViewParameter)
    {
        this.isViewParameter = isViewParameter;
    }

    public String getIsGroupPromptText ()
    {
        return isGroupPromptText;
    }

    public void setIsGroupPromptText (String isGroupPromptText)
    {
        this.isGroupPromptText = isGroupPromptText;
    }

    public String[] getSelectValueList ()
    {
        return selectValueList;
    }

    public void setSelectValueList (String[] selectValueList)
    {
        this.selectValueList = selectValueList;
    }

    public String getIsPassword ()
    {
        return isPassword;
    }

    public void setIsPassword (String isPassword)
    {
        this.isPassword = isPassword;
    }

    public String getHelpText ()
    {
        return helpText;
    }

    public void setHelpText (String helpText)
    {
        this.helpText = helpText;
    }

    public String getControlType ()
    {
        return controlType;
    }

    public void setControlType (String controlType)
    {
        this.controlType = controlType;
    }

    public String getIsHidden ()
    {
        return isHidden;
    }

    public void setIsHidden (String isHidden)
    {
        this.isHidden = isHidden;
    }

    public String getAutoSuggestThreshold ()
    {
        return autoSuggestThreshold;
    }

    public void setAutoSuggestThreshold (String autoSuggestThreshold)
    {
        this.autoSuggestThreshold = autoSuggestThreshold;
    }

    public String getCascadingParentName ()
    {
        return cascadingParentName;
    }

    public void setCascadingParentName (String cascadingParentName)
    {
        this.cascadingParentName = cascadingParentName;
    }

    public String getIsStartExpanded ()
    {
        return isStartExpanded;
    }

    public void setIsStartExpanded (String isStartExpanded)
    {
        this.isStartExpanded = isStartExpanded;
    }

    public String getIsAdHoc ()
    {
        return isAdHoc;
    }

    public void setIsAdHoc (String isAdHoc)
    {
        this.isAdHoc = isAdHoc;
    }

    public String getDataType ()
    {
        return dataType;
    }

    public void setDataType (String dataType)
    {
        this.dataType = dataType;
    }

    public String getIsRequired ()
    {
        return isRequired;
    }

    public void setIsRequired (String isRequired)
    {
        this.isRequired = isRequired;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public BirtSelectNameValueList getSelectNameValueList ()
    {
        return selectNameValueList;
    }

    public void setSelectNameValueList (BirtSelectNameValueList selectNameValueList)
    {
        this.selectNameValueList = selectNameValueList;
    }

    public String getIsDefaultValueIsNull ()
    {
        return isDefaultValueIsNull;
    }

    public void setIsDefaultValueIsNull (String isDefaultValueIsNull)
    {
        this.isDefaultValueIsNull = isDefaultValueIsNull;
    }

    public String getGroup ()
    {
        return group;
    }

    public void setGroup (String group)
    {
        this.group = group;
    }

    public String getDefaultValue ()
    {
        return defaultValue;
    }

    public void setDefaultValue (String defaultValue)
    {
        this.defaultValue = defaultValue;
    }

    public String getDisplayName ()
    {
        return displayName;
    }

    public void setDisplayName (String displayName)
    {
        this.displayName = displayName;
    }

    public String getDataSourceType ()
    {
        return dataSourceType;
    }

    public void setDataSourceType (String dataSourceType)
    {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [position = "+position+", isDynamicSelectionList = "+isDynamicSelectionList+", isViewParameter = "+isViewParameter+", isGroupPromptText = "+isGroupPromptText+", selectValueList = "+selectValueList+", isPassword = "+isPassword+", helpText = "+helpText+", controlType = "+controlType+", isHidden = "+isHidden+", autoSuggestThreshold = "+autoSuggestThreshold+", cascadingParentName = "+cascadingParentName+", isStartExpanded = "+isStartExpanded+", isAdHoc = "+isAdHoc+", dataType = "+dataType+", isRequired = "+isRequired+", name = "+name+", value = "+value+", selectNameValueList = "+selectNameValueList+", isDefaultValueIsNull = "+isDefaultValueIsNull+", group = "+group+", defaultValue = "+defaultValue+", displayName = "+displayName+", dataSourceType = "+dataSourceType+"]";
    }
}
