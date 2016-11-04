package org.krisbox.ihub.examples;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kclark on 11/4/16.
 */
public class BirtRestTest {
    private BirtExecutor birtExecutor;

    @Before
    public void setup() {
        birtExecutor = new BirtExecutor();

        birtExecutor.setHostname("http://ihub.demoimage.com:8000");
        birtExecutor.setUsername("Administrator");
        birtExecutor.setPassword("");
        birtExecutor.setVolume("Default Volume");
    }

    @Test
    public void testLogin() {
        birtExecutor.login(birtExecutor.getBirtProperties());
    }

    @Test
    public void testGetFolderItems() {
        birtExecutor.debug(this.getClass(), "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        birtExecutor.login(birtExecutor.getBirtProperties());
        birtExecutor.getFolderItems(birtExecutor.getBirtProperties());
        birtExecutor.debug(this.getClass(), "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
