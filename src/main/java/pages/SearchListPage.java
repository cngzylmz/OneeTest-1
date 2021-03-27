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
import static org.testng.Assert.assertTrue;

public class SearchListPage extends OneeWebElements implements TestParameters, OneeMethods, ReadJson {
    WebDriver driver;

    public SearchListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchListPropertyCheck(String propertyId, String testUrl) {
        List<WebElement> villas = wait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
                xpath(searchList)));
        for (WebElement e : villas) {
            if (e.getAttribute("href").equalsIgnoreCase(testUrl + "/detail/" + propertyId)) {
                e.click();
                break;
            }
        }
        assertTrue(driver.getCurrentUrl().equalsIgnoreCase(testUrl + "/detail/" + propertyId));
    }

    public void searchLocationInput(String location) {
        searchInput.sendKeys(location);
        assertEquals(expectedResponseCode, responseCode(driver.getCurrentUrl()));
    }

    public void searchDatesInput(String checkInDates, String checkOutDates) {
        checkInDate.sendKeys(checkInDates);
        checkOutDate.sendKeys(checkOutDates);
    }

    public void searchButton(int expectedResponseCode) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchButton));
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        searchButton.click();
    }

    public void searchListSizeCheck(int n) {
        List<WebElement> searchList = wait(driver).until(ExpectedConditions.
                visibilityOfAllElementsLocatedBy(By.xpath(search(driver).searchList)));
        assertTrue(searchList.size() >= n);
    }

    public void searchListDateInputCheck(String checkInDates, String checkOutDates) {
        assertEquals(checkInDate.getAttribute("value"), checkInDates);
        assertEquals(checkOutDate.getAttribute("value"), checkOutDates);
    }

    public void searchListLocationInputCheck(String location) {
        assertEquals(searchInput.getAttribute("value"), location);
    }

    public void adultCount(int n, String choose) {
        String firstCount = "";
        String secondCount = "";
        wait(driver).until(ExpectedConditions.visibilityOf(guestAdultsAdd));
        firstCount = guestAdultsCount.getText();
        if (choose.equalsIgnoreCase("add")) {
            for (int i = 1; i <= n; i++) {
                guestAdultsAdd.click();
            }
        }
        if (choose.equalsIgnoreCase("remove")) {
            for (int i = 1; i <= n; i++) {
                guestAdultsRemove.click();
            }
        }
        secondCount = guestAdultsCount.getText();

        assertTrue(firstCount != secondCount);
    }

    public void childrenCount(int n, String choose) {
        String firstCount = "";
        String secondCount = "";
        wait(driver).until(ExpectedConditions.visibilityOf(guestChildrenAdd));
        firstCount = guestChildrenCount.getText();
        if (choose.equalsIgnoreCase("add")) {
            for (int i = 1; i <= n; i++) {
                guestChildrenAdd.click();
            }
        }
        if (choose.equalsIgnoreCase("remove")) {
            for (int i = 1; i <= n; i++) {
                guestChildrenRemove.click();
            }
        }
        secondCount = guestChildrenCount.getText();

        assertTrue(firstCount != secondCount);
    }

    public void petCount(int n, String choose) {
        String firstCount = "";
        String secondCount = "";
        wait(driver).until(ExpectedConditions.visibilityOf(guestPetAdd));
        firstCount = guestPetCount.getText();
        if (choose.equalsIgnoreCase("add")) {
            for (int i = 1; i <= n; i++) {
                guestPetAdd.click();
            }
        }
        if (choose.equalsIgnoreCase("remove")) {
            for (int i = 1; i <= n; i++) {
                guestPetRemove.click();
            }
        }
        secondCount = guestPetCount.getText();

        assertTrue(firstCount != secondCount);
    }

    public void childrenAgeListCheck(int count) {
        List<WebElement> childrenAges = wait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
                xpath(childrenAgesList)));
        assertEquals(childrenAges.size(), count);
        for (WebElement e : childrenAges) {
            assertEquals(e.getText(), "12 years old");
        }
    }

    public void guestAdultsCountCheck(int count) {
        String c = String.valueOf(count);
        assertEquals(guestAdultsCount.getText(), c);
    }

    public void guestChildrenCountCheck(int count) {
        String c = String.valueOf(count);
        assertEquals(guestChildrenCount.getText(), c);
    }

    public void guestPetCountCheck(int count) {
        String c = String.valueOf(count);
        assertEquals(guestPetCount.getText(), c);
    }

    public void searchPropertyPhoto(String photo) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardPhoto));
        assertEquals(searchCardPhoto.getAttribute("style"), photo);
    }

    public void searchPropertyName(String propertyName) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardPropertyName));
        assertEquals(searchCardPropertyName.getText(), propertyName);
    }

    public void searchPropertyLocation(String location) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardPropertyLocation));
        assertEquals(searchCardPropertyLocation.getText(), location);
    }

    public void searchPropertyGuestCount(String guestCount) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardGuestCount));
        assertEquals(searchCardGuestCount.getText(), guestCount);
    }

    public void searchPropertyBedCount(String bedRoomCount) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardBedCount));
        assertEquals(searchCardBedCount.getText(), bedRoomCount);
    }

    public void searchPropertyBathCount(String bathRoomCount) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardBathCount));
        assertEquals(searchCardBathCount.getText(), bathRoomCount);
    }
}


