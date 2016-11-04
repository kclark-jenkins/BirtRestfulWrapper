package org.krisbox.ihub.examples.utils;

import org.krisbox.ihub.examples.utils.logging.BirtExecutorLogger;
import org.krisbox.ihub.examples.utils.logging.impl.BirtExecutorLoggerImpl;
import org.krisbox.ihub.examples.utils.rest.RestActions;
import org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants;
import org.krisbox.ihub.examples.utils.rest.impl.RestActionsImpl;
import org.krisbox.ihub.examples.utils.rptdesign.BirtReportProperties;
import org.krisbox.ihub.examples.utils.rptdesign.impl.BirtReportPropertiesImpl;

import java.util.Map;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtUtils extends BirtExecutorLoggerImpl
        implements BirtReportProperties, BirtExecutorLogger, RestActions {
    BirtReportProperties props = new BirtReportPropertiesImpl();
    RestActions restActions = new RestActionsImpl();

    public BirtUtils() {
        super();
    }

    public Map<String, String> getReportParameters() {
        return props.getReportParameters();
    }

    public RestConstants.OUTPUT_TYPE getOutputType() {
        return props.getOutputType();
    }

    public void setReportParameters(Map<String, String> reportParameters) {
        props.setReportParameters(reportParameters);
    }

    public void setReoprtDesign(String rptdesign) {
        props.setReoprtDesign(rptdesign);
    }

    public String getReportDesign() { return props.getReportDesign(); };

    public void setOutputType(RestConstants.OUTPUT_TYPE outputType) {
        props.setOutputType(outputType);
    }

    public void setHostname(String hostname){
        props.setHostname(hostname);
    }

    public void setUsername(String username){
        props.setUsername(username);
    }

    public void setPassword(String password){
        props.setPassword(password);
    }

    public void setReportParametersDef(Map<String, String> reportParametersDef) {
        props.setReportParametersDef(reportParametersDef);
    }

    public Map<String, String> getReportParametersDef() {
        return props.getReportParametersDef();
    }

    public String getHostname(){return props.getHostname();}
    public String getUsername(){return props.getUsername();}
    public String getPassword(){return props.getPassword();}
    public String getVolume(){return props.getVolume();}

    public void setVolume(String volume){ props.setVolume(volume);}

    public Map<String, String> getLoginParameters() { return props.getLoginParameters(); }

    public void login(BirtReportProperties birtReportProperties) {
        restActions.login(birtReportProperties);
    }

    public BirtReportProperties getBirtProperties() {
        return props;
    }

    public void getFolderItems(BirtReportProperties birtReportProperties) {
        restActions.getFolderItems(props);
    }
}
