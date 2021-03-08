package helper;

import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public interface OneeMethods {

     default SoftAssert sAssert() {
        SoftAssert softAssert = new SoftAssert();
        return softAssert;
    }

     default WebDriverWait wait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait;
    }
    default HomePage homePage(WebDriver driver){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        return homePage;
    }
    default PropertyDetailPage propertyDetailPage(WebDriver driver){
        PropertyDetailPage propertyDetailPage = PageFactory.initElements(driver, PropertyDetailPage.class);
        return propertyDetailPage;
    }
    default LoginPage loginPage(WebDriver driver){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        return loginPage;
    }
    default PmPages pmPage(WebDriver driver){
        PmPages pmPage = PageFactory.initElements(driver, PmPages.class);
        return pmPage;
    }
    default RegisterPages register(WebDriver driver){
        RegisterPages register = PageFactory.initElements(driver, RegisterPages.class);
        return register;
    }
    default SearchListPage search(WebDriver driver){
        SearchListPage search = PageFactory.initElements(driver, SearchListPage.class);
        return search;
    }
    default CompetitionModal competition(WebDriver driver){
        CompetitionModal competition = PageFactory.initElements(driver, CompetitionModal.class);
        return competition;
    }
}
