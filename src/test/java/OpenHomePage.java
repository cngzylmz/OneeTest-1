import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OpenHomePage extends TestBase implements TestParameters, ReadJson, OneeMethods {

    @Test
    public void openHomePage() throws InterruptedException {
        System.out.println("open home page");
        driver.get(testUrl);
        handler(driver).closeModal();
        handler(driver).cookiesClose();
        wait(driver).until(ExpectedConditions.visibilityOf(homePage(driver).logo));
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
    }
}
