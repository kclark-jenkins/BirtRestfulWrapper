package org.krisbox.ihub.examples.utils.rest;

import org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants;

/**
 * Created by kclark on 11/4/16.
 */
public interface RestExecutor {
    void executeReport();
    void executeReport(RestConstants.OUTPUT_TYPE outputType);
    void executeReport(String rptdesign);
    void executeReport(String rptdesign, RestConstants.OUTPUT_TYPE outputType);
}
