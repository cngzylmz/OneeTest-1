import helper.*;
import jsonHelper.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Login extends TestBase implements OneeMethods, TestParameters, ReadJson {

    @Parameters({"userName", "password", "profileName", "responseCode", "testUrl"})
//    String userName, String password, String profileName, int responseCode, String testUrl
    @Test
    public void loginCheck() {
        driver.get(testUrl);
       assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode) ;
        loginPage(driver).loginButton();
        loginPage(driver).userInfo(userName, password);
        loginPage(driver).submitButton();
        loginPage(driver).checkName(profileName);
    }
}
