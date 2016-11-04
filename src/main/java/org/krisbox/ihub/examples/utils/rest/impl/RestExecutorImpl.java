package org.krisbox.ihub.examples.utils.rest.impl;

import org.krisbox.ihub.examples.utils.logging.impl.BirtExecutorLoggerImpl;
import org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants;

public abstract class RestExecutorImpl extends BirtExecutorLoggerImpl {
    public void executeReport() {
        debug(this.getClass(), "executeReport()");
    }

    public void executeReport(RestConstants.OUTPUT_TYPE outputType) {
        debug(this.getClass(), "executeReport(OUTPUT_TYPE outputType)");
    }

    public void executeReport(String rptdesign) {
        debug(this.getClass(), "executeReport(String rptdesign)");
    }

    public void executeReport(String rptdesign, RestConstants.OUTPUT_TYPE outputType) {
        debug(this.getClass(), "executeReport(String rptdesign, OUTPUT_TYPE outputType)");

    }
}
