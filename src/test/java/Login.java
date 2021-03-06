import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Login extends TestBase implements OneeMethods, TestParameters, ReadJson {

    @Test
    public void loginCheck() {
        driver.get(testUrl);
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        loginPage(driver).loginButton();
        loginPage(driver).userInfo(userEmail, password);
        loginPage(driver).submitButton();
        loginPage(driver).checkName(profileName);
    }
}
