import helper.AllureListener;
import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({AllureListener.class})
public class SearchList extends TestBase implements OneeMethods, TestParameters, ReadJson {
    String checkInDates = getDateToCalendar(1);
    String checkOutDates = getDateToCalendar(2);

    @Description("Fill the Search Inputs")
    @Test(priority = 1)
    public void searchInput() throws InterruptedException {
        driver.get(testUrl);
        handler(driver).closeCompetitionModal();
        handler(driver).closeCookies();
        scrollToElement(driver, search(driver).searchInput);
        search(driver).searchLocationInput(country);
        search(driver).searchDatesInput(checkInDates, checkOutDates);
    }

    @Description("Search add guest")
    @Test(priority = 2)
    public void searchListGuest() {
        search(driver).guestSearchBar.click();
        search(driver).adultCount(adultCount, "add");
        search(driver).childrenCount(childrenCount, "add");
        search(driver).petCount(petCount,"add");
    }

    @Test(priority = 3, dependsOnMethods = "searchInput")
    public void submit() {
        search(driver).searchButton(expectedResponseCode);
    }

    @Description("Search Inputs value Check ")
    @Test(priority = 4, dependsOnMethods = "submit")
    public void searchListInputCheck() {
        search(driver).searchListDateInputCheck(checkInDates, checkOutDates);
        search(driver).searchListLocationInputCheck(country);
    }

    @Description("Search guest")
    @Test(priority = 5, dependsOnMethods = "submit")
    public void searchListGuestCheck() {
        search(driver).guestSearchBar.click();
        search(driver).childrenAgeListCheck(childrenCount);
        search(driver).guestAdultsCountCheck(adultCount);
        search(driver).guestChildrenCountCheck(childrenCount);
        search(driver).guestPetCountCheck(petCount);
    }

    @Description("Search List Property Check ")
    @Test(priority = 6, dependsOnMethods = "submit")
    public void searchListPropertyCheck() {
        search(driver).searchListSizeCheck();
        search(driver).searchListPropertyCheck(propertyId, expectedResponseCode);
    }
}
