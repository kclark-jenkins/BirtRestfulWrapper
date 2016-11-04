package org.krisbox.ihub.examples.utils.logging;

import org.apache.log4j.Logger;

/**
 * Created by kclark on 11/4/16.
 */
public interface BirtExecutorLogger {
    void info(Class className,  Object message);
    void warn(Class className,  Object message);
    void debug(Class className, Object message);
    void error(Class className, Object message);
    void fatal(Class className, Object message);
    Logger getRootLogger();
}
