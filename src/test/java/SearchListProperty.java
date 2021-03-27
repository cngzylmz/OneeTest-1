import helper.*;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({AllureListener.class})
public class SearchListProperty extends TestBase implements OneeMethods, TestParameters, ReadJson {

    @Description("Search List Open")
    @Test(priority = 1)
    public void searchListOpen() throws InterruptedException {
        driver.get(testUrl);
        handler(driver).closeCompetitionModal();
        handler(driver).closeCookies();
        scrollToElement(driver, search(driver).searchInput);
        search(driver).searchButton(expectedResponseCode);
    }

    @Description("Search List Property Detail Check")
    @Test(priority = 2, dataProvider = "SearchCardDetails", dataProviderClass = DataProviderClass.class)
    public void searchListPropertyDetailCheck(String propertyName, String location, String guestCount, String bedRoomCount, String bathRoomCount, String photo) {
        System.out.println("Check " + propertyName + " details !!!");
        search(driver).searchLocationInput(propertyName);
        search(driver).searchButton(expectedResponseCode);
        search(driver).searchPropertyPhoto(photo);
        search(driver).searchPropertyName(propertyName);
        search(driver).searchPropertyLocation(location);
        search(driver).searchPropertyGuestCount(guestCount);
        search(driver).searchPropertyBedCount(bedRoomCount);
        search(driver).searchPropertyBathCount(bathRoomCount);
        driver.navigate().refresh();
    }
}
