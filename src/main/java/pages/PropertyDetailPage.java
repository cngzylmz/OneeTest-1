package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import jsonHelper.ReadJson;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class PropertyDetailPage extends OneeWebElements implements OneeMethods, ReadJson {
    WebDriver driver;


    public PropertyDetailPage(WebDriver driver) {
        this.driver = driver;
    }


    public void propertyDetailPhotoCheck() {
        driver.get(testProperty);
        wait(driver).until(ExpectedConditions.visibilityOf(competitionModalClose));
        competitionModalClose.click();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        wait(driver).until(ExpectedConditions.visibilityOf(propertyDetailBannerPhoto));
        assertEquals(propertyDetailBannerPhoto.getAttribute("src"), bannerURL);
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailAsidePhotoList));
        assertEquals(propertyDetailAsidePhotoList.size(), 4);
    }

    public void photoListCheck(int propertyDetailPhotoListCount) {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailBannerPhoto));
        propertyDetailBannerPhoto.click();
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailGalleryShow));
//        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailPhotoList));
//        assertEquals(propertyDetailPhotoList.size(), propertyDetailPhotoListCount);
        propertyDetailGalleryClose.click();
    }

    public void propertyDetailRequestButton() {
        propertyDetailRequestButton.click();
        if (driver.getCurrentUrl().equalsIgnoreCase((testUrl + "/login"))) {
            wait(driver).until(ExpectedConditions.visibilityOf(userPassword));
            driver.navigate().back();
        }
    }

    public void propertyDetailAskQuestion() {
        wait(driver).until(ExpectedConditions.visibilityOf(propertyDetailAskQuestion));
        propertyDetailAskQuestion.click();
        try {
            if (driver.getCurrentUrl().equalsIgnoreCase((testUrl + "/login"))) {
                wait(driver).until(ExpectedConditions.visibilityOf(userPassword));
                driver.navigate().back();
            }
        } catch (Exception e) {

        }
    }

    public void propertyDetailNameCheck(String propertyOneeName) {
        wait(driver).until(ExpectedConditions.visibilityOf(propertyDetailOneeName));
        assertEquals(propertyDetailOneeName.getText(), propertyOneeName);
    }

    public void propertyDetailRoomCheck(String propertyRoom) {
        wait(driver).until(ExpectedConditions.visibilityOf(propertyDetailOneeName));
        assertEquals(propertyDetailRoomsCount.getText(), propertyRoom);
    }

    public void propertyDetailContentTitleCheck() {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailContentTitles));
        for (WebElement e : propertyDetailContentTitles) {
            try {
                sAssert().assertTrue(e.isDisplayed());
            } catch (ElementNotVisibleException err) {
                err.printStackTrace();
            }
            sAssert().assertAll();
        }
    }

    public void propertyDetailFeaturedAmenitiesCheck() {
        scrollToElement(driver, propertyDetailContentTitles.get(0));
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailFeaturedAmenities));
        assertEquals(propertyDetailFeaturedAmenities.size(), 5);
    }

    public void propertyDetailDescription(String description) {
        scrollToElement(driver, propertyDetailContentTitles.get(1));
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailDescription));
        assertEquals(propertyDetailDescription.getText(), description);
    }

    public void propertyDetailAbout(String about) {
        scrollToElement(driver, propertyDetailContentTitles.get(2));
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailAbout));
        assertEquals(propertyDetailAbout.getText(), about);
    }

    public void propertyDetailServices(String includedServices, String optionalServices) {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailIncludedServices));
        scrollToElement(driver, propertyDetailIncludedServices);
        assertEquals(propertyDetailIncludedServices.getText(), includedServices);
        assertEquals(propertyDetailOptionalServices.getText(), optionalServices);
    }

    public void propertyDetailHouseRulesStay(String stay) {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailHouseRules));
        scrollToElement(driver, propertyDetailHouseRules.get(0));
        assertEquals(propertyDetailHouseRulesStayTitle.getText(), "Min-Max Stay");
        assertEquals(propertyDetailHouseRulesStayValue.getText(), stay);
    }

    public void propertyDetailHouseRulesCheckDates(String checkDates) {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailHouseRules));
        scrollToElement(driver, propertyDetailHouseRules.get(0));
        assertEquals(propertyDetailHouseRulesCheckDatesTitle.getText(), "Check-in/Check-out");
        assertEquals(propertyDetailHouseRulesCheckDatesValue.getText(), checkDates);
    }

    public void propertyDetailHouseRulesArrivalDates(String arrivalDates) {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailHouseRules));
        scrollToElement(driver, propertyDetailHouseRules.get(0));
        assertEquals(propertyDetailHouseRulesArrivalDatesTitle.getText(), "Arrival Day(s)");
        assertEquals(propertyDetailHouseRulesArrivalDatesValue.getText(), arrivalDates);
    }

    public void propertyDetailHouseRulesChildren(String childrenRule) {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailHouseRules));
        scrollToElement(driver, propertyDetailHouseRules.get(0));
        assertEquals(propertyDetailHouseRulesChildrenRuleTitle.getText(), "Children Welcome");
        assertEquals(propertyDetailHouseRulesChildrenRuleValue.getText(), childrenRule);
    }

    public void propertyDetailHouseRulesSmoking(String childrenRule) {
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(propertyDetailHouseRules));
        scrollToElement(driver, propertyDetailHouseRules.get(0));
        assertEquals(propertyDetailHouseRulesSmokingTitle.getText(), "Smoking");
        assertEquals(propertyDetailHouseRulesSmokingValue.getText(), childrenRule);
    }

}
