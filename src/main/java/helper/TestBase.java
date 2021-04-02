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

        String runningPlatform = "Linux";
        System.setProperty("webdriver.chrome.driver", "var/lib/jenkins/workspace/OneeTest/libs/chromedriver-linux");

//        String runningPlatform = "Windows";
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\cngz\\Desktop\\workspace\\OneeTest\\libs\\chromedriverwin.exe");
//        String runningPlatform = "MacOs";
//        System.setProperty("webdriver.chrome.driver", "/Users/cengizyilmaz/IdeaProjects/OneeTest-1/libs/chromedriver-mac");


        System.out.println(runningPlatform);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
//        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1500, 1500));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }



}

