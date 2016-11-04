package org.krisbox.ihub.examples.utils.rptdesign;

import org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants;

import java.util.Map;

/**
 * Created by kclark on 11/4/16.
 */
public interface BirtReportProperties {
    Map<String, String> getReportParameters();
    RestConstants.OUTPUT_TYPE getOutputType();

    void setHostname(String hostname);
    void setUsername(String username);
    void setPassword(String password);
    String getHostname();
    String getUsername();
    String getPassword();
    void setReportParametersDef(Map<String, String> reportParametersDef);
    Map<String, String> getReportParametersDef();
    void setVolume(String volume);
    String getVolume();
    Map<String, String> getLoginParameters();
    void setReportParameters(Map<String, String> reportParameters);
    void setReoprtDesign(String rptdesign);
    void setOutputType(RestConstants.OUTPUT_TYPE outputType);
    String getReportDesign();
}
