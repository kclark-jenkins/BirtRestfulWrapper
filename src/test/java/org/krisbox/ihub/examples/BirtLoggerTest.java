package org.krisbox.ihub.examples;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtLoggerTest {
    private TestAppender testAppender;
    private BirtExecutor birtExecutor;

    @Before
    public void setup() {
        testAppender = new TestAppender();
        birtExecutor = new BirtExecutor();
        birtExecutor.getRootLogger().addAppender(testAppender);
    }

    @Test
    public void testDebug() {
        birtExecutor.debug(BirtLoggerTest.class, "JUnit Debug Message");
        assertEquals("class org.krisbox.ihub.examples.BirtLoggerTest: JUnit Debug Message", testAppender.events.get(0).getMessage());
    }

    @Test
    public void testInfo() {
        birtExecutor.debug(BirtLoggerTest.class, "JUnit Info Message");
        assertEquals("class org.krisbox.ihub.examples.BirtLoggerTest: JUnit Info Message", testAppender.events.get(0).getMessage());
    }

    @Test
    public void testWarning() {
        birtExecutor.warn(BirtLoggerTest.class, "JUnit Warn Message");
        assertEquals("class org.krisbox.ihub.examples.BirtLoggerTest: JUnit Warn Message", testAppender.events.get(0).getMessage());
    }

    @Test
    public void testError() {
        birtExecutor.error(BirtLoggerTest.class, "JUnit Error Message");
        assertEquals("class org.krisbox.ihub.examples.BirtLoggerTest: JUnit Error Message", testAppender.events.get(0).getMessage());
    }

    @Test
    public void testFatal() {
        birtExecutor.fatal(BirtLoggerTest.class, "JUnit Fatal Message");
        assertEquals("class org.krisbox.ihub.examples.BirtLoggerTest: JUnit Fatal Message", testAppender.events.get(0).getMessage());
    }

    public class TestAppender extends AppenderSkeleton{
        public List<LoggingEvent> events = new ArrayList<LoggingEvent>();
        public void close() {}
        public boolean requiresLayout() {return false;}
        @Override
        protected void append(LoggingEvent event) {
            events.add(event);
        }
    }
}