package pages;

import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDenemeler1 extends TestBase implements TestParameters, ReadJson {

@Test
    public void openHomePage(){
    driver.get(testUrl);
    assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
}
}
