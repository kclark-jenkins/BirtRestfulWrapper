package org.krisbox.ihub.examples.utils.logging.impl;

import org.apache.log4j.Logger;
import org.krisbox.ihub.examples.utils.logging.BirtExecutorLogger;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtExecutorLoggerImpl implements BirtExecutorLogger {
    private final Logger LOGGER;

    public BirtExecutorLoggerImpl() {
        LOGGER = Logger.getLogger(this.getClass());
    }

    public void info(Class className, Object message) {
        LOGGER.info(className.toString() + ": " + message);
    }

    public void warn(Class className, Object message) {
        LOGGER.warn(className.toString() + ": " + message);
    }

    public void debug(Class className, Object message) {
        LOGGER.debug(className.toString() + ": " + message);
    }

    public void error(Class className, Object message) {
        LOGGER.error(className.toString() + ": " + message);
    }

    public void fatal(Class className, Object message) {
        LOGGER.fatal(className.toString() + ": " + message);
    }

    public Logger getRootLogger() {
        return LOGGER.getRootLogger();
    }
}
