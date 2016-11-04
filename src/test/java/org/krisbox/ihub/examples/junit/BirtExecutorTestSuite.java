package org.krisbox.ihub.examples.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.krisbox.ihub.examples.BirtLoggerTest;
import org.krisbox.ihub.examples.BirtPropertiesTest;
import org.krisbox.ihub.examples.BirtRestTest;

@RunWith(value=Suite.class)
@Suite.SuiteClasses(value={BirtLoggerTest.class, BirtPropertiesTest.class, BirtRestTest.class})
public class BirtExecutorTestSuite {

}
