package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePage extends OneeWebElements implements OneeMethods, ReadJson {
    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void logoCheck() {
//        wait(driver).until(ExpectedConditions.invisibilityOf( loading...))
        assertTrue(logo.isDisplayed());
    }

    public void registerButtonCheck() {
        assertTrue(registerButtonHome.isDisplayed());
    }

    public void loginButtonCheck() {
        assertTrue(loginButtonHome.isDisplayed());
    }

    public void searchButtonCheck() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        assertTrue(searchButtonHome.isDisplayed());
    }

    public void travelInspirationCheck() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        List<WebElement> travelInspiration = driver.findElements(By.xpath(travelInspirationList));
        assertEquals(travelInspiration.size(), 2);
    }

    public void trendingDestinationCheck() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600);");
        wait(driver).until(ExpectedConditions.visibilityOf(trendingDestinations));
        List<WebElement> destination = driver.findElements(By.xpath(trendingDestinationList));
        assertEquals(destination.size(), 2);
    }

    public void newestCheck() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        List<WebElement> newestList = driver.findElements(By.
                xpath(newestPropertyList));
        assertEquals(newestList.size(), 8);
    }

    public void mostPopularCheck() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        wait(driver).until(ExpectedConditions.visibilityOf(mostPopular));
        mostPopular.click();
        assertEquals(mostPopular.getAttribute("aria-selected"), "true");
        List<WebElement> villas = driver.findElements(By.
                xpath(mostPopularList));
        assertEquals(villas.size(), 8);
    }


    public void subscribeHomeCheck() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        wait(driver).until(ExpectedConditions.visibilityOf(subscribeTextHome));
        assertEquals(subscribeTextHome.getText(), "SUBSCRIBE TO OUR NEWSLETTER");
        subscribeSubscribeHome.click();
        wait(driver).until(ExpectedConditions.textToBePresentInElement(subscribeMailAlertHome, "Please write a valid email"));
        assertEquals(subscribeMailAlertHome.getText(), "Please write a valid email");
        assertEquals(subscribeCheckBoxAlertHome.getText(), "Please accept the terms and conditions");
        subscribeEmailHome.sendKeys("test@onee.com");
        subscribeCheckBoxHome.click();
        subscribeSubscribeHome.click();
        wait(driver).until(ExpectedConditions.visibilityOf(subscribeSuccessAlertHome));
//        wait(driver).until(ExpectedConditions.visibilityOfAllElements(subscribeSuccessAlertHome));
        assertEquals(subscribeSuccessAlertHome, "Success");
    }
}
