import helper.*;
import jsonHelper.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PmDashboard extends TestBase implements OneeMethods, TestParameters, ReadJson {
    @Parameters({"responseCode", "testUrl"})
    //    int responseCode, String testUrl
    @Test
    public void Dashboard() throws InterruptedException {
        driver.get(testUrl);
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
        pmPage(driver).dashboard();
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
        pmPage(driver).viewUpcoming();
        Thread.sleep(3000);
        pmPage(driver).viewProperty();


    }

}
