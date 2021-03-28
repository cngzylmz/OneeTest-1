package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public interface OneeMethods extends AmenitiesElements {

    default SoftAssert sAssert() {
        return new SoftAssert();
    }

    default WebDriverWait wait(WebDriver d) {
        return new WebDriverWait(d, 30);
    }

    default HomePage homePage(WebDriver d) {
        return PageFactory.initElements(d, HomePage.class);
    }

    default PropertyDetailPage propertyDetailPage(WebDriver d) {
        return PageFactory.initElements(d, PropertyDetailPage.class);
    }

    default LoginPage loginPage(WebDriver d) {
        return PageFactory.initElements(d, LoginPage.class);
    }

    default PmPages pmPage(WebDriver d) {
        return PageFactory.initElements(d, PmPages.class);
    }

    default RegisterPages register(WebDriver d) {
        return PageFactory.initElements(d, RegisterPages.class);
    }

    default SearchListPage search(WebDriver d) {
        return PageFactory.initElements(d, SearchListPage.class);
    }

    default Handler handler(WebDriver d) {
        return PageFactory.initElements(d, Handler.class);
    }

    default void scrollToElement(WebDriver d, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("arguments[0].scrollIntoView();",
                element);
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    default String getDateToCalendar(int plusDate) {
        Instant now = Instant.now();
        Instant after = now.plus(Duration.ofDays(plusDate));
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dateAfter = Date.from(after);
        return formatter.format(dateAfter);
    }

    default void doubleClick(WebDriver d, WebElement e) {
        Actions actions = new Actions(d);
        actions.doubleClick(e).perform();
    }

    default void rightClick(WebDriver d, WebElement e) {
        Actions actions = new Actions(d);
        actions.contextClick(e).perform();
    }

    default int splitTextToInt(String split, int i) {
        String[] parts = split.split(" ");
        String parse = parts[i];
        int parsed = Integer.parseInt(parse);
        return parsed;
    }

    default String getByCode(String code) {
        for (Amenities amenitiesElement : Amenities.values()) {
            if (amenitiesElement.toString().equals(code)) {
                return getAmenitiesElement(amenitiesElement);
            }
        }
        return null;
    }

    default WebElement getWebElement(WebDriver d, String path) {
        WebElement element = d.findElement(By.xpath(path));
        return element;
    }
}
