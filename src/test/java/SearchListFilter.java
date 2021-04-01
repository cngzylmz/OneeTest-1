import helper.AllureListener;
import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class SearchListFilter extends TestBase implements OneeMethods, TestParameters {
    @Description("Search List Open")
    @Test(priority = 1)
    public void searchListFilterOpen() throws InterruptedException {
        driver.get(testUrl);
        loginPage(driver).login(userDemoTa[0], userDemoTa[1], expectedResponseCode);
        scrollToElement(driver, search(driver).searchInput);
        search(driver).searchButton(expectedResponseCode);
        search(driver).searchListPropertyTotalCountCheck();
    }

    @Description("Search List Filter Property Type Check")
    @Test(priority = 2)
    public void searchListFilterPropertyType() {
        search(driver).searchListFilterSelectYacht();
        search(driver).searchListFilterSelectVilla();
    }

    @Description("Search List Filter Bedroom - Sleeps Check")
    @Test(priority = 3)
    public void searchListFilterSleeps() throws InterruptedException {
        search(driver).searchListFilterBedRoomsButton();
        search(driver).searchListFilterBedRoomsSleeps(15, "add");
        search(driver).searchListFilterBedRoomsApply(43);
    }

    @Description("Search List Filter Bedroom - BedRoom Check")
    @Test(priority = 4, dependsOnMethods = "searchListFilterSleeps")
    public void searchListFilterBedRooms() throws InterruptedException {
        search(driver).searchListFilterBedRoomsButton();
        search(driver).searchListFilterBedRoomsBedRooms(15, "add");
        search(driver).searchListFilterBedRoomsApply(5);
    }

    @Description("Search List Filter Bedroom - BathRoom Check")
    @Test(priority = 5, dependsOnMethods = "searchListFilterSleeps")
    public void searchListFilterBathRooms() throws InterruptedException {
        search(driver).searchListFilterBedRoomsButton();
        search(driver).searchListFilterBedRoomsBathRooms(26, "add");
        search(driver).searchListFilterBedRoomsApply(1);
    }
//
//    @Description("Search List Filter Instant Booking Check")
//    @Test(priority = 6)
//    public void searchListFilterInstantBooking() {
//        search(driver).searchListFilterInstantBookingButton();
//        search(driver).searchListFilterInstantBookingApply(searchInstantBookingText);
//    }

    @Description("Search List Filter MoreFilters Check")
    @Test(priority = 7)
    public void searchListFilterMoreFilters() throws InterruptedException {
        search(driver).searchListFilterMoreFiltersButton();
        search(driver).searchListFilterMoreFiltersTabsCheck();
        search(driver).searchListFilterMoreFilterApply();
    }

    @Test(priority = 8)
    public void searchListFilterShowMap() {
        search(driver).searchListFilterMap();
    }

    @Test(priority = 9)
    public void searchListFilterClear() {
        search(driver).searchListFilterClear(searchListPropertyTotalCount);
    }
}
