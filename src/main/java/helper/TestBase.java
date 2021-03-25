package helper;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase implements TestParameters {
    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @BeforeSuite
    public void beforeSuite() {
        try{
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\cngz\\Desktop\\workspace\\OneeTest\\libs\\chromedriverwin.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.setProperty("webdriver.chrome.driver","/Users/cengizyilmaz/IdeaProjects/OneeTest-1/libs/chromedriver-mac");
        }catch (Exception e){
            e.printStackTrace();
        }

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
//        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1500,1500));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    /*
     * @Test(dataProvider = "dp") public void f(Integer n, String s) {
     *
     * }
     */
    /*
     * @DataProvider public Object[][] dp() {
     * return new Object[][] {
     * {1, "a" },
     * { 2, "b" },
     * };
     * }
     */
}

