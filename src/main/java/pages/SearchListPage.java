package pages;

import helper.*;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchListPage extends OneeWebElements implements TestParameters, OneeMethods, ReadJson, AmenitiesElements {
    WebDriver driver;
    String firstCount;
    String secondCount;


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
        assertTrue(driver.getCurrentUrl().equalsIgnoreCase(testUrl + "/detail/" + propertyId), "Test Property Card Photo Broken");
    }

    public void searchLocationInput(String location) {
        searchInput.sendKeys(location);
        assertEquals(expectedResponseCode, responseCode(driver.getCurrentUrl()));
    }

    public void searchDatesInput(String checkInDates, String checkOutDates) {
        searchBarCheckInDate.sendKeys(checkInDates);
        searchBarCheckOutDate.sendKeys(checkOutDates);
    }

    public void searchButton(int expectedResponseCode) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchButton));
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        searchButton.click();
    }

    public void searchListSizeCheck(int count) {
        List<WebElement> searchList = wait(driver).until(ExpectedConditions.
                visibilityOfAllElementsLocatedBy(By.xpath(search(driver).searchList)));
        assertTrue(searchList.size() >= count);
    }

    public void searchListDateInputCheck(String checkInDates, String checkOutDates) {
        assertEquals(searchBarCheckInDate.getAttribute("value"), checkInDates);
        assertEquals(searchBarCheckOutDate.getAttribute("value"), checkOutDates);
    }

    public void searchListLocationInputCheck(String location) {
        assertEquals(searchInput.getAttribute("value"), location);
    }

    public void adultCount(int count, String addORemove) {
        searchFilterAddRemoveCount(count, addORemove, searchBarGuestAdultsAdd, searchBarGuestAdultsRemove, searchBarGuestAdultsCount);
    }

    public void childrenCount(int count, String addORemove) {
        searchFilterAddRemoveCount(count, addORemove, searchBarGuestChildrenAdd, searchBarGuestChildrenRemove, searchBarGuestChildrenCount);
    }

    public void petCount(int count, String addORemove) {
        searchFilterAddRemoveCount(count, addORemove, searchBarGuestPetAdd, searchBarGuestPetRemove, searchBarGuestPetCount);
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
        assertEquals(searchBarGuestAdultsCount.getText(), c);
    }

    public void guestChildrenCountCheck(int count) {
        String c = String.valueOf(count);
        assertEquals(searchBarGuestChildrenCount.getText(), c);
    }

    public void guestPetCountCheck(int count) {
        String c = String.valueOf(count);
        assertEquals(searchBarGuestPetCount.getText(), c);
    }

    public void searchPropertyCardPhoto(String photo) throws InterruptedException {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardPhoto));
        Thread.sleep(3000);
        assertEquals(searchCardPhoto.getAttribute("style"), photo);
    }

    public void searchPropertyCardName(String propertyName) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardPropertyName));
        assertEquals(searchCardPropertyName.getText(), propertyName);
    }

    public void searchPropertyCardLocation(String location) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardPropertyLocation));
        assertEquals(searchCardPropertyLocation.getText(), location);
    }

    public void searchPropertyCardGuestCount(String guestCount) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardGuestCount));
        assertEquals(searchCardGuestCount.getText(), guestCount);
    }

    public void searchPropertyCardBedCount(String bedRoomCount) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardBedCount));
        assertEquals(searchCardBedCount.getText(), bedRoomCount);
    }

    public void searchPropertyCardBathCount(String bathRoomCount) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchCardBathCount));
        assertEquals(searchCardBathCount.getText(), bathRoomCount);
    }

    public void searchListPropertyTotalCountCheck(int searchListPropertyTotalCount) {
        wait(driver).until(ExpectedConditions.visibilityOf(searchListCount));
        String propertyCount = searchListCount.getText();
        assertTrue(searchListPropertyCount == splitTextToInt(propertyCount, 0));
        assertTrue(splitTextToInt(propertyCount, 3) >= searchListPropertyTotalCount);
    }

    public void searchListFilterPropertyTypeButton() {
        searchListFilterPropertyTypeButton.click();
        wait(driver).until(ExpectedConditions.attributeToBe(searchListFilterPropertyTypeButton, "class", "obtn obtn-borderless ant-popover-open"));
    }

    public void searchListFilterSelectYacht() {
        searchListFilterPropertyTypeButton();
        searchListFilterPropertyTypeYacht.click();
        wait(driver).until(ExpectedConditions.visibilityOf(searchListCount));
        String propertyCount = search(driver).searchListCount.getText();
        assertTrue(splitTextToInt(propertyCount, 3) <= searchListYachtTotalCount + 10);
    }

    public void searchListFilterSelectVilla() {
        searchListFilterPropertyTypeButton();
        try {
            Actions actions = new Actions(driver);
            actions.click(searchListFilterPropertyTypeVilla);
        } catch (Exception e) {

        }
        try {
            searchListFilterPropertyTypeVilla.click();
        } catch (Exception e) {

        }
        wait(driver).until(ExpectedConditions.visibilityOf(searchListCount));
        String propertyCount = search(driver).searchListCount.getText();
        assertTrue(splitTextToInt(propertyCount, 3) <= searchListVillaTotalCount + 10);
    }

    public void searchListFilterBedRoomsButton() {
        wait(driver).until(ExpectedConditions.visibilityOf(searchListFilterBedRoomsButton));
        searchListFilterBedRoomsButton.click();
        wait(driver).until(ExpectedConditions.attributeToBe(searchListFilterBedRoomsButton, "class", "obtn obtn-borderless ant-popover-open"));

    }

    public void searchListFilterBedRoomsSleeps(int count, String addORemove) {
        searchFilterAddRemoveCount(count, addORemove, searchListFilterBedRoomsAddSleep, searchListFilterBedRoomsRemoveSleep, searchListFilterBedRoomsSleepCount);

    }

    public void searchListFilterBedRoomsBedRooms(int count, String addORemove) {
        searchFilterAddRemoveCount(count, addORemove, searchListFilterBedRoomsAddBedRooms, searchListFilterBedRoomsRemoveBathRooms, searchListFilterBedRoomsBathRoomsCount);
    }

    public void searchListFilterBedRoomsBathRooms(int count, String addORemove) {
        searchFilterAddRemoveCount(count, addORemove, searchListFilterBedRoomsAddBathRooms, searchListFilterBedRoomsRemoveBathRooms, searchListFilterBedRoomsBathRoomsCount);
    }

    public void searchListFilterBedRoomsApply(int expectedPropertyCount) {
        searchListFilterBedRoomsApply.click();
        wait(driver).until(ExpectedConditions.visibilityOf(searchListCount));
        assertTrue(splitTextToInt(searchListCount.getText(), 3) <= expectedPropertyCount + 10);
    }

    public void searchFilterAddRemoveCount(int count, String addORemove, WebElement add, WebElement remove, WebElement countCheck) {
        wait(driver).until(ExpectedConditions.visibilityOf(add));
        firstCount = countCheck.getText();
        if (addORemove.equalsIgnoreCase("add")) {
            for (int i = 1; i <= count; i++) {
                add.click();
            }
        }
        if (addORemove.equalsIgnoreCase("remove")) {
            for (int i = 1; i <= count; i++) {
                remove.click();
            }
        }
        secondCount = countCheck.getText();

        assertTrue(firstCount != secondCount);
    }

    public void searchListFilterInstantBookingButton() {
        wait(driver).until(ExpectedConditions.visibilityOf(searchListFilterInstantBookingButton));
        searchListFilterInstantBookingButton.click();
        wait(driver).until(ExpectedConditions.attributeToBe(searchListFilterInstantBookingButton, "class", "obtn obtn-borderless ant-popover-open"));
    }

    public void searchListFilterInstantBookingApply(String searchInstantBookingText) {
//        assertEquals(searchListFilterInstantBookingText.getText(), searchInstantBookingText);
        searchListFilterInstantBookingCheckBox.click();
        searchListFilterInstantBookingApply.click();
    }

    public void searchListFilterMoreFiltersButton() {
        wait(driver).until(ExpectedConditions.visibilityOf(searchListFilterMoreFilterButton));
        searchListFilterMoreFilterButton.click();
    }

    public void searchListFilterMoreFiltersTabsCheck() {
        getWebElement(driver, getAmenitiesElement(Amenities.MOSQUITO_NET)).click();
    }

    public void searchListFilterMoreFilterApply(int expectedPropertyCount) {
        searchListFilterMoreFilterApply.click();
        Actions action = new Actions(driver);
        action.click(searchListFilterMoreFilterApply);
        assertTrue(splitTextToInt(searchListCount.getText(), 0) == expectedPropertyCount);
    }

    public void searchListFilterMap() {
        searchListFilterMapButton.click();
        assertEquals(searchListFilterMapButton.getText(), "Hide Map");
        assertEquals(searchListMap.getAttribute("class"), "map-container is-open");
    }

    public void searchListFilterClear(int expectedPropertyCount) {
        searchListFilterClearButton.click();
        wait(driver).until(ExpectedConditions.visibilityOf(searchListCount));
        assertTrue(splitTextToInt(searchListCount.getText(), 3) >= expectedPropertyCount);
    }
}


