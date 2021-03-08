import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OpenHomePage extends TestBase implements TestParameters, ReadJson, OneeMethods {

@Test
    public void openHomePage(){
    System.out.println("open home page");
    driver.get(testUrl);
    competition(driver).closeModal();
    wait(driver).until(ExpectedConditions.visibilityOf(loginPage(driver).logo));
    assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
}
}
