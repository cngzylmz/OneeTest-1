import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class PropertyDetail extends TestBase implements TestParameters, OneeMethods, ReadJson {

    @Description("User portal login control")
    @Test(priority = 1)
    public void askQuestion() {
        driver.get(testProperty);
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);

    }




}
