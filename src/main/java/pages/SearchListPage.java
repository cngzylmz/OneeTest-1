package pages;

import helper.*;
import jsonHelper.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchListPage extends OneeWebElements implements TestParameters, OneeMethods, ReadJson {
    WebDriver driver;

    public void SearchListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchListCheck(String testProperty06, int expectedResponseCode) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 300);");
            wait(driver).until(ExpectedConditions.visibilityOf(searchButtonHome));
            searchButtonHome.click();
            assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
            List<WebElement> villas = wait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
                    xpath(searchList)));
            assertTrue(villas.size() == 24);
            for (WebElement e : villas) {
                if (e.getAttribute("href").equalsIgnoreCase(testProperty06)) {
                    e.click();
                    assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
                    break;
                }
            }
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    public void searchProperty(String propertyName, int expectedResponseCode) {
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        searchInputHome.sendKeys(propertyName);
        wait(driver).until(ExpectedConditions.visibilityOf(searchButtonHome));
        searchButtonHome.click();
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);


    }
}
