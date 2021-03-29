import helper.*;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


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
    public void searchListPropertyDetailCheck(String propertyName, String location, String guestCount, String bedRoomCount, String bathRoomCount, String photo) throws InterruptedException {
        System.out.println("Check " + propertyName + " details !!!");
        search(driver).searchLocationInput(propertyName);
        search(driver).searchButton(expectedResponseCode);
        wait(driver).until(ExpectedConditions.visibilityOf(search(driver).searchListCount));
        System.out.println(search(driver).searchListCount);
        assertEquals(splitTextToInt(search(driver).searchListCount.getText(),0),1);
        search(driver).searchPropertyCardPhoto(photo);
        search(driver).searchPropertyCardName(propertyName);
        search(driver).searchPropertyCardLocation(location);
        search(driver).searchPropertyCardGuestCount(guestCount);
        search(driver).searchPropertyCardBedCount(bedRoomCount);
        search(driver).searchPropertyCardBathCount(bathRoomCount);
        driver.navigate().refresh();
    }
}
