package org.unidal.cat.core.alert;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.unidal.cat.core.alert.engine.AlertEngineTest;
import org.unidal.cat.core.alert.service.AlertReportServiceTest;

@RunWith(Suite.class)
@SuiteClasses({

AlertReportServiceTest.class,

AlertEngineTest.class,

})
public class AllTests {

}
