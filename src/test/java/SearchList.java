import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SearchList extends TestBase implements OneeMethods, TestParameters, ReadJson {
    String country = "France";
    String user = "cengiz.yilmaz@onee.com";
    String password = "123456eE!";
    String checkInDate = "01-04-2021";
    String checkOutDate = "02-04-2021";

    @Test
    public void login() {
        driver.get(testUrl);
        loginPage(driver).login(user, password, expectedResponseCode);
    }

    @Test
    public void searchInput() {
        search(driver).searchInput.sendKeys(country);
        search(driver).checkInDate.sendKeys(checkInDate);
        search(driver).checkoutDate.sendKeys(checkOutDate);
        search(driver).searchButton.click();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
    }

    @Test
    public void searchListCheck() {
        List<WebElement> searchList = wait(driver).until(ExpectedConditions.
                visibilityOfAllElementsLocatedBy(By.xpath(search(driver).searchList)));
        assertEquals(searchList.size(), 24);

        assertEquals(search(driver).checkInDate.getAttribute("value"), checkInDate);
        assertEquals(search(driver).checkoutDate.getAttribute("value"), checkOutDate);
        assertEquals(search(driver).searchInput.getAttribute("value"), country);
    }
}
