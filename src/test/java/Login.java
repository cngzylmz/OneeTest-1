import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Login extends TestBase implements OneeMethods, TestParameters, ReadJson {

    @Test
    public void loginCheck() {
        System.out.println("login check");
        driver.get(testUrl);
        handler(driver).closeModal();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        loginPage(driver).loginButton(expectedResponseCode);
        loginPage(driver).userInfo(userEmail, password);
        loginPage(driver).submitButton(expectedResponseCode);
        handler(driver).stripePopupClose();
//        loginPage(driver).checkName(profileName);
    }
}
