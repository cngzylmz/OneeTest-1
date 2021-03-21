import helper.AllureListener;
import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners({AllureListener.class})
public class SearchList extends TestBase implements OneeMethods, TestParameters, ReadJson {
    String country = "France";
    String checkInDates = getDateToCalendar(1);
    String checkOutDates = getDateToCalendar(2);


    @Test(priority = 1)
    public void searchInput() throws InterruptedException {
        driver.get(testUrl);
        handler(driver).closeCompetitionModal();
        handler(driver).closeCookies();
        scrollToElement(driver,search(driver).searchInput);
        search(driver).searchLocationInput(country);
        search(driver).searchDatesInput(checkInDates, checkOutDates);
        search(driver).searchButton(expectedResponseCode);
    }

    @Test(priority = 2, dependsOnMethods = "searchInput")
    public void searchListInputCheck() {
        search(driver).searchListSizeCheck();
        search(driver).searchListDateInputCheck(checkInDates, checkOutDates);
        search(driver).searchListLocationInputCheck(country);
    }
}
