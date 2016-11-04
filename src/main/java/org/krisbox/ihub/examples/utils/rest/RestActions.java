package org.krisbox.ihub.examples.utils.rest;

import org.krisbox.ihub.examples.utils.rptdesign.BirtReportProperties;

/**
 * Created by kclark on 11/4/16.
 */
public interface RestActions {
    void login(BirtReportProperties birtReportProperties);
    void getFolderItems(BirtReportProperties birtReportProperties);
}
