import helper.AllureListener;
import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners({AllureListener.class})
public class OpenHomePage extends TestBase implements TestParameters, ReadJson, OneeMethods {

    @Description("Just open home page.")
    @Test
    public void openHomePage() {
        System.out.println("open home page");
        driver.get(testUrl);
        handler(driver).closeModal();
        handler(driver).closeCookies();
        wait(driver).until(ExpectedConditions.visibilityOf(homePage(driver).logo));
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);

    }
}
