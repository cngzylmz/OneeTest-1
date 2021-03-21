package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SearchListPage extends OneeWebElements implements TestParameters, OneeMethods, ReadJson {
    WebDriver driver;

    public SearchListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchListPropertyCheck(String testProperty06, int expectedResponseCode) {
        scrollToElement(driver, searchButton);
        searchButton.click();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        List<WebElement> villas = wait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
                xpath(searchList)));
        assertEquals(villas.size(), 24);
        for (WebElement e : villas) {
            if (e.getAttribute("href").equalsIgnoreCase(testProperty06)) {
                e.click();
                assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
                break;
            }
        }
    }

    public void searchLocationInput(String location) {
        searchInput.sendKeys(location);
        assertEquals(expectedResponseCode, responseCode(driver.getCurrentUrl()));
    }

    public void searchDatesInput(String checkInDates, String checkOutDates) {
        checkInDate.sendKeys(checkInDates);
        checkOutDate.sendKeys(checkOutDates);
        videoHomePage.click();/*saçma ama gerekiyor*/
    }

    public void searchButton(int expectedResponseCode) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchButton));
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        searchButton.click();
    }

    public void searchListSizeCheck() {
        List<WebElement> searchList = wait(driver).until(ExpectedConditions.
                visibilityOfAllElementsLocatedBy(By.xpath(search(driver).searchList)));
        assertEquals(searchList.size(), 14);
    }

    public void searchListDateInputCheck(String checkInDates, String checkOutDates) {
        assertEquals(checkInDate.getAttribute("value"), checkInDates);
        assertEquals(checkOutDate.getAttribute("value"), checkOutDates);
    }

    public void searchListLocationInputCheck(String location) {
        assertEquals(searchInput.getAttribute("value"), location);
    }
}
