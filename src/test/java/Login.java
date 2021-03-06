import helper.AllureListener;
import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
@Listeners({AllureListener.class})
public class Login extends TestBase implements OneeMethods, TestParameters, ReadJson {

    @Description("User portal login control")
    @Test
    public void loginCheck() throws InterruptedException {
        System.out.println("login check");
        driver.get(testUrl);
        handler(driver).closeCompetitionModal();
        handler(driver).closeCookies();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        loginPage(driver).loginButton(expectedResponseCode);
        loginPage(driver).userInfo(userDevVrpm[0], userDevVrpm[1]);
        loginPage(driver).submitButton(expectedResponseCode);
        handler(driver).stripePopupClose();
        loginPage(driver).checkLogin();
    }
}
