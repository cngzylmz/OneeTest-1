import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class HomePageCheck extends TestBase implements TestParameters, OneeMethods, ReadJson {
    @Parameters("testUrl")
    @Test(priority = 1)
    public void logoCheck() {
        driver.get(testUrl);
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        homePage(driver).logoCheck();
    }

//    @Test(priority = 2)
//    public void registerButtonCheck() {
//        homePage(driver).registerButtonCheck();
//    }

    @Test(priority = 3)
    public void loginButtonCheck() {
        homePage(driver).loginButtonCheck();
    }

    @Test(priority = 4)
    public void searchButtonCheck() {
        homePage(driver).searchButtonCheck();
    }

    @Test(priority = 5)
    public void travelInspirationCheck() {
        homePage(driver).travelInspirationCheck();
    }

    @Test(priority = 6)
    public void trendingDestinationCheck() {
        homePage(driver).trendingDestinationCheck();
    }

    @Test(priority = 7)
    public void newestCheck() {
        homePage(driver).newestCheck();
    }

    @Test(priority = 8)
    public void mostPopularCheck() {
        homePage(driver).mostPopularCheck();
    }

    @Test(priority = 9)
    public void subscribeCheck() {
        homePage(driver).subscribeHomeCheck();

    }

}
