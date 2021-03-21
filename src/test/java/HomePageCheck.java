import helper.AllureListener;
import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners({AllureListener.class})
public class HomePageCheck extends TestBase implements TestParameters, OneeMethods, ReadJson {
    @Description("Onee Logo is displayed home page")
    @Parameters("testUrl")
    @Test(priority = 1)
    public void logoCheck() throws InterruptedException {
        System.out.println("homepage check");
        driver.get(testUrl);
        handler(driver).closeCompetitionModal();
        handler(driver).closeCookies();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        homePage(driver).logoCheck();
    }

    @Description("Register button is displayed home page")
    @Test(priority = 2)
    public void registerButtonCheck() {
        homePage(driver).registerButtonCheck();
    }

    @Description("Login button is displayed home page")
    @Test(priority = 3)
    public void loginButtonCheck() {
        homePage(driver).loginButtonCheck();
    }

    @Description("Search button is displayed home page")
    @Test(priority = 4)
    public void searchButtonCheck() {
        homePage(driver).searchButtonCheck();
    }

    @Description("Travel Inspiration properties are displayed home page")
    @Test(priority = 5)
    public void travelInspirationCheck() {
        homePage(driver).travelInspirationCheck();
    }

    @Description("Trending Destination properties are displayed home page")
    @Test(priority = 6)
    public void trendingDestinationCheck() {
        homePage(driver).trendingDestinationCheck();
    }

    @Description("Newest properties are displayed home page")
    @Test(priority = 7)
    public void newestCheck() {
        homePage(driver).newestCheck();
    }

    @Description("Most popular properties are displayed home page")
    @Test(priority = 8)
    public void mostPopularCheck() {
        homePage(driver).mostPopularCheck();
    }

    @Description("Subscribe is displayed home page")
    @Test(priority = 9)
    public void subscribeCheck() {
        homePage(driver).subscribeHomeCheck();

    }

}
