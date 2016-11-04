package org.krisbox.ihub.examples.utils.rptdesign.impl;

import org.krisbox.ihub.examples.utils.logging.impl.BirtExecutorLoggerImpl;
import org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants;
import org.krisbox.ihub.examples.utils.rptdesign.BirtReportProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtReportPropertiesImpl extends BirtExecutorLoggerImpl implements BirtReportProperties {
    private Map<String, String> reportParameters;
    private Map<String, String> reportParametersDef;
    private String              reportDesign;
    private RestConstants.OUTPUT_TYPE outputType;
    private String hostname;
    private String username;
    private String password;
    private String volume;

    public BirtReportPropertiesImpl() {
        super();
        debug(this.getClass(), "BirtReportProperties()");
    }

    public String getReportDesign() {
        return reportDesign;
    }

    public Map<String, String> getReportParameters() {
        debug(this.getClass(), "getReportParameters()");
        debug(this.getClass(), reportParameters.toString());
        return reportParameters;
    }

    public RestConstants.OUTPUT_TYPE getOutputType() {
        debug(this.getClass(), "getOutputType()");
        debug(this.getClass(), "Output type: " + outputType);
        return outputType;
    }

    public void setReportParameters(Map<String, String> reportParameters) {
        debug(this.getClass(), "setReportParameters()");
        debug(this.getClass(), reportParameters.toString());
        this.reportParameters = reportParameters;
    }

    public void setReoprtDesign(String reportDesign) {
        debug(this.getClass(), "setReportDesign()");
        debug(this.getClass(), "Report Design: " + reportDesign);
        this.reportDesign = reportDesign;
    }

    public void setOutputType(RestConstants.OUTPUT_TYPE outputType) {
        debug(this.getClass(), "setOutputType()");
        debug(this.getClass(), "Output type: " + outputType);
        this.outputType = outputType;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostname(){ return hostname; }
    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public String getVolume(){ return volume; }

    public void setReportParametersDef(Map<String, String> reportParametersDef) {
        debug(this.getClass(), "setReportParametersDef()");
        debug(this.getClass(), reportParametersDef.toString());
        this.reportParametersDef = reportParametersDef;
    }

    public Map<String, String> getReportParametersDef(){
        debug(this.getClass(), "getReportParametersDef()");
        debug(this.getClass(), reportParametersDef.toString());
        return reportParametersDef;
    }

    public void setVolume(String volume){ this.volume = volume; }

    public Map<String, String> getLoginParameters() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", username);
        map.put("password", password);
        map.put("volume",   volume);

        return map;
    }
}
