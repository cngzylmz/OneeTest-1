import helper.*;
import jsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Register extends TestBase implements ReadJson, OneeMethods, TestParameters {
    @Parameters({"responseCode", "testUrl"})
    @Test
    public void RegisterPage() throws InterruptedException {
        driver.get(testUrl);
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
        register(driver).registerButton();
        register(driver).registerInputs();
        register(driver).profilePolicyCheck();
        register(driver).sendRegisterForm();
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
    }

}
