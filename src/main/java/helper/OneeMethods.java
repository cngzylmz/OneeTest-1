package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public interface OneeMethods {

    default SoftAssert sAssert() {
        return new SoftAssert();
    }

    default WebDriverWait wait(WebDriver driver) {
        return new WebDriverWait(driver, 10);
    }

    default HomePage homePage(WebDriver driver) {
        return PageFactory.initElements(driver, HomePage.class);
    }

    default PropertyDetailPage propertyDetailPage(WebDriver driver) {
        return PageFactory.initElements(driver, PropertyDetailPage.class);
    }

    default LoginPage loginPage(WebDriver driver) {
        return PageFactory.initElements(driver, LoginPage.class);
    }

    default PmPages pmPage(WebDriver driver) {
        return PageFactory.initElements(driver, PmPages.class);
    }

    default RegisterPages register(WebDriver driver) {
        return PageFactory.initElements(driver, RegisterPages.class);
    }

    default SearchListPage search(WebDriver driver) {
        return PageFactory.initElements(driver, SearchListPage.class);
    }

    default Handler handler(WebDriver driver) {
        return PageFactory.initElements(driver, Handler.class);
    }

    default void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",
                element);
        js.executeScript("window.scrollBy(0,-350)", "");
    }
    default String getDateToCalendar(int plusDate){
        Instant now = Instant.now();
        Instant after = now.plus(Duration.ofDays(plusDate));
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Date dateAfter = Date.from(after);
        return formatter.format(dateAfter);
    }
}
