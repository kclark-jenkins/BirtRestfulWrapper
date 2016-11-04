package org.krisbox.ihub.examples;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.Before;
import org.junit.Test;
import org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BirtPropertiesTest {
    private BirtLoggerTest.TestAppender testAppender;
    private BirtExecutor birtExecutor;
    private Map<String, String> params;
    private Map<String, String> paramsDef;

    @Before
    public void setup() {
        birtExecutor = new BirtExecutor();
        birtExecutor.getRootLogger().addAppender(testAppender);

        params = new HashMap<String, String>();
        params.put("Param1", "Value1");
        params.put("Param2", "Value2");

        paramsDef = new HashMap<String, String>();
        paramsDef.put("Param1", "String");
        paramsDef.put("Param2", "Integer");
        paramsDef.put("Param3", "Float");

        birtExecutor.setReportParameters(params);
        birtExecutor.setReportParametersDef(paramsDef);
    }

    @Test
    public void setReportDesign() {
        birtExecutor.setReoprtDesign("Test");
        assertEquals("Test", birtExecutor.getReportDesign());
    }

    @Test
    public void setReportParameters() {
        Map<String, String> bParams = birtExecutor.getReportParameters();

        assertEquals(params.size(), bParams.size());

        params.forEach((key, value) -> {
            assertEquals(params.get(key), bParams.get(key));
        });
    }

    @Test
    public void setReportParametersDef() {
        Map<String, String> bParamsDef = birtExecutor.getReportParametersDef();

        assertEquals(paramsDef.size(), bParamsDef.size());

        paramsDef.forEach((key, value) -> {
            assertEquals(paramsDef.get(key), bParamsDef.get(key));
        });
    }

    @Test
    public void setOutputType() {
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.DOC);
        assertEquals(RestConstants.OUTPUT_TYPE.DOC, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.DOCX);
        assertEquals(RestConstants.OUTPUT_TYPE.DOCX, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.XLS);
        assertEquals(RestConstants.OUTPUT_TYPE.XLS, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.XLSX);
        assertEquals(RestConstants.OUTPUT_TYPE.XLSX, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.PPT);
        assertEquals(RestConstants.OUTPUT_TYPE.PPT, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.PPTX);
        assertEquals(RestConstants.OUTPUT_TYPE.PPTX, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.PDF);
        assertEquals(RestConstants.OUTPUT_TYPE.PDF, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.PS);
        assertEquals(RestConstants.OUTPUT_TYPE.PS, birtExecutor.getOutputType());
        birtExecutor.setOutputType(RestConstants.OUTPUT_TYPE.XHTML);
        assertEquals(RestConstants.OUTPUT_TYPE.XHTML, birtExecutor.getOutputType());
    }

    @Test
    public void setCredentials() {
        birtExecutor.setHostname("http://localhost:8700/iportal");
        birtExecutor.setUsername("Administrator");
        birtExecutor.setPassword("");
        birtExecutor.setVolume("Default Volume");

        assertEquals("http://localhost:8700/iportal", birtExecutor.getHostname());
        assertEquals("Administrator", birtExecutor.getUsername());
        assertEquals("", birtExecutor.getPassword());
        assertEquals("Default Volume", birtExecutor.getVolume());
    }

    @Test
    public void getLoginParameters() {
        birtExecutor.setHostname("http://localhost:8700/iportal");
        birtExecutor.setUsername("Administrator");
        birtExecutor.setPassword("");
        birtExecutor.setVolume("Default Volume");

        Map<String, String> lParams = new HashMap<String, String>();
        lParams.put("username", "Administrator");
        lParams.put("password", "");
        lParams.put("volume", "Default Volume");

        assertEquals(lParams.size(), birtExecutor.getLoginParameters().size());

        birtExecutor.getLoginParameters().forEach((key, value) -> {
            assertEquals(lParams.get(key), value);
        });
    }

    public class TestAppender extends AppenderSkeleton {
        public List<LoggingEvent> events = new ArrayList<LoggingEvent>();
        public void close() {}
        public boolean requiresLayout() {return false;}
        @Override
        protected void append(LoggingEvent event) {
            events.add(event);
        }
    }
}
