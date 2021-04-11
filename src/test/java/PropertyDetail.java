import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import io.qameta.allure.Description;
import jsonHelper.ReadJson;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class PropertyDetail extends TestBase implements TestParameters, OneeMethods, ReadJson {

    @Description("Property detail visible photos ")
    @Test(priority = 1)
    public void propertyDetailPhotoCheck() {
        driver.get(testProperty);
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        propertyDetailPage(driver).propertyDetailPhotoCheck();
    }

    @Description("Property detail gallery photo count  ")
    @Test(priority = 2)
    public void propertyDetailPhotoList() {
        propertyDetailPage(driver).photoListCheck(propertyDetailPhotoListCount);
    }

    @Description("Property detail aside check  ")
    @Test(priority = 3)
    public void propertyDetailAsideCheck() {
        propertyDetailPage(driver).propertyDetailRequestButton();
        propertyDetailPage(driver).propertyDetailAskQuestion();
    }

//    @Description("Property detail calendar  ")
//    @Test(priority = 4)
//    public void propertyDetailCalendarCheck() {
//        propertyDetailPage(driver)
//    }

    @Description("Property detail check  ")
    @Test(priority = 5)
    public void propertyDetailInfoCheck() {
        propertyDetailPage(driver).propertyDetailNameCheck(villaOneeName);
        propertyDetailPage(driver).propertyDetailRoomCheck(villaRooms);

    }

    @Description("Property detail content title check  ")
    @Test(priority = 6)
    public void propertyDetailContentTitleCheck() {
        propertyDetailPage(driver).propertyDetailContentTitleCheck();
    }

    @Description("Property detail Featured Amenities check  ")
    @Test(priority = 7)
    public void propertyDetailContentFeaturedAmenitiesCheck() {
        propertyDetailPage(driver).propertyDetailFeaturedAmenitiesCheck();
    }

    @Description("Property detail Description check  ")
    @Test(priority = 8)
    public void propertyDetailContentDescriptionCheck() {
        propertyDetailPage(driver).propertyDetailDescription(villaDescription);
    }

    @Description("Property detail About check  ")
    @Test(priority = 9)
    public void propertyDetailContentAboutCheck() {
        propertyDetailPage(driver).propertyDetailAbout(villaAbout);
    }

    @Description("Property detail Services check  ")
    @Test(priority = 10)
    public void propertyDetailContentServicesCheck() {
        propertyDetailPage(driver).propertyDetailServices(includedServices, optionalServices);
    }

    @Description("Property detail Rules check  ")
    @Test(priority = 11)
    public void propertyDetailContentHouseRulesCheck() {
        propertyDetailPage(driver).propertyDetailHouseRulesStay(houseRulesStay);
        propertyDetailPage(driver).propertyDetailHouseRulesCheckDates(checkDates);
        propertyDetailPage(driver).propertyDetailHouseRulesArrivalDates(arrivalDates);
        propertyDetailPage(driver).propertyDetailHouseRulesChildren(childrenRule);
        propertyDetailPage(driver).propertyDetailHouseRulesSmoking(smokingRule);
    }
}
