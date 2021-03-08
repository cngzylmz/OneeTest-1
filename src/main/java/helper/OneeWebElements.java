package helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneeWebElements {
    /*************HOME PAGE*************/
    public String travelInspirationList = "//*[@id=\"root\"]/div/div/section[1]/div//a";
    public String trendingDestinationList = "//*[@id=\"root\"]/div/div/section[2]/div/div//a";
    public String newestPropertyList = "//*[@id=\"root\"]/div/div/section[3]/div/div[2]/div/div//a";
    public String mostPopularList = "//*[@id=\"root\"]/div/div/section[3]/div/div[2]/div/div[2]/div/div//a";
    public String searchList = "//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/div[2]//a";
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[2]/a/div")
    public WebElement logo;
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[3]/button[1]")
    public WebElement registerButtonHome;
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[3]/button[2]")
    public WebElement loginButtonHome;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/ul/li[4]/div/button")
    public WebElement searchButtonHome;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/section[1]/h1")
    public WebElement travelInspiration;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/section[2]/h1")
    public WebElement trendingDestinations;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/section[3]/div/div[1]/div[1]/div/div/div")
    public WebElement newestProperties;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/section[3]/div/div/div/div/div[2]/div")
    public WebElement mostPopularProperties;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/section[4]/div/div[1]/h1")
    public WebElement subscribeTextHome;
    @FindBy(id = "newsletter_email")
    public WebElement subscribeEmailHome;
    @FindBy(xpath = "//*[@id=\"newsletter\"]/div[1]/div[2]/button")
    public WebElement subscribeSubscribeHome;
    @FindBy(xpath = "//*[@id=\"newsletter\"]/div[2]/div/div/div/label/span[1]")
    public WebElement subscribeCheckBoxHome;
    @FindBy(xpath = "//*[@id=\"newsletter\"]/div[1]/div[1]/div/div/div[2]/div")
    public WebElement subscribeMailAlertHome;
    @FindBy(xpath = "//*[@id=\"newsletter\"]/div[2]/div/div[2]/div")
    public WebElement subscribeCheckBoxAlertHome;
    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[1]")
    public WebElement subscribeSuccessAlertHome;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/header/div/div[3]/div/div")
    public WebElement profilePhoto;
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/button")
    public WebElement stripeAlertClose;

    /*************LOG IN PAGE*************/
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/button/span")
    public WebElement competitionModalClose;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/button/span/svg")
    public WebElement cookiesClose;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/h2")
    public WebElement loginHeader;
    @FindBy(id = "login_email")
    public WebElement userMail;
    @FindBy(id = "login_password")
    public WebElement userPassword;
    @FindBy(xpath = "//*[@id=\"login\"]/div[2]/div[1]/button")
    public WebElement loginSubmitButtonLogin;

    /*************REGISTER PAGE*************/
    public String policyList = "//*[@id=\"register\"]/div[3]/div[2]/div/div/div/div/label/span[2]";
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/header/div/div[3]/div/div/button[1]")
    public WebElement registerButton;
    @FindBy(id = "register_profile")
    public WebElement selectProfile;
    @FindBy(id = "register_title")
    public WebElement selectTitle;
    @FindBy(id = "register_firstname")
    public WebElement registerFirstName;
    @FindBy(id = "register_lastName")
    public WebElement registerSecondName;
    @FindBy(xpath = "//input[@type='tel']")
    public WebElement pNumber;
    @FindBy(id = "register_email")
    public WebElement registerMail;
    @FindBy(id = "register_emailRepeat")
    public WebElement registerMailRepeat;
    @FindBy(id = "register_password")
    public WebElement password;
    @FindBy(id = "register_website")
    public WebElement webSite;
    @FindBy(id = "register_agencyName")
    public WebElement agencyName;
    @FindBy(id = "register_iataAbtaNumber")
    public WebElement IATANumber;
    @FindBy(id = "register_network")
    public WebElement network;
    @FindBy(id = "register_howDidYouHearUs")
    public WebElement howHearUs;
    @FindBy(id = "register_companyName")
    public WebElement companyName;
    @FindBy(id = "register_gdpr")
    public WebElement subscribeCheck;
    @FindBy(id = "register_terms")
    public WebElement policyCheck;
    @FindBy(xpath = "//*[@id=\"register\"]/div[4]/div[2]/button")
    public WebElement sendRegisterForm;
    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    public WebElement registerLoginButton;
    /************** Phone Verify **************/
    @FindBy(xpath = "//input[@type='text']")
    public WebElement phoneCode;
    @FindBy(xpath = "//span[contains(text(),'Resend Code')]")
    public WebElement resendCode;
    @FindBy(xpath = "//button[contains(text(),'Verify')]")
    public WebElement verify;
    /*************PM PAGES*************/

    /******************** Dashboard ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"Dashboard\")]")
    public WebElement dashboard;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/p/a")
    public WebElement viewBooking;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div[1]/div[3]/div/p/a")
    public WebElement viewProperty;
    /******************** Calendar ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"Calendar & Pricing\")]")
    public WebElement calPricing;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement cProperty;
    @FindBy(xpath = "//div[@class='row']/div[1]/div[1]/div[2]/button[@type='button']")
    public WebElement calShow;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/button")
    public WebElement calToday;
    @FindBy(xpath = "//span[@class='fc-icon fc-icon-chevron-left']")
    public WebElement calLeft;
    @FindBy(xpath = "//span[@class='fc-icon fc-icon-chevron-right']")
    public WebElement calRight;
    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[2]//div[@class='calendar-day-number']")
    public WebElement calDay;
    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[2]//a[@class='calendar-daily-price']")
    public WebElement calPrice;
    /******************** Nightly Price ********************/
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[1]//input[@id='start-date']")
    public WebElement calPriceDateStart;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[1]//input[@id='end-date']")
    public WebElement calPriceDateEnd;
    @FindBy(xpath = "//div[@class='col-md-4 mt-4 m-md-0']/div[1]/div/div[3]/div/span/input[@type='number']")
    public WebElement calNightlyPrice;
    @FindBy(xpath = "//div[@class='col-md-4 mt-4 m-md-0']/div[1]/div[1]/div[4]/div/button[@type='button']")
    public WebElement calNightlyPriceSave;
    /******************** Availability ********************/
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[2]//input[@id='start-date']")
    public WebElement calAvailabilityStart;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[2]//input[@id='end-date']")
    public WebElement calAvailabilityEnd;
    @FindBy(xpath = "//input[@value='AVAILABLE']")
    public WebElement calAvailabilityInstant;
    @FindBy(xpath = "//input[@value='PREAPPROVED']")
    public WebElement calAvailabilityEnquired;
    @FindBy(xpath = "//input[@value='Booked']")
    public WebElement calAvailabilityBooked;
    @FindBy(xpath = "/html/body/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[5]/div/button")
    public WebElement calAvailabilitySave;
    /******************** Travel Agent Commission ********************/
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[3]//input[@id='start-date']")
    public WebElement calComissionStartDate;
    @FindBy(xpath = "//*[@id=\\\"root\\\"]/div/div/div/div[2]/div/div/div[2]/div[3]//input[@id='end-date']")
    public WebElement calComissionEndDate;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[3]/div/div[3]/div/span/input")
    public WebElement calComissionRate;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[3]/div/div[4]/div/button")
    public WebElement calComissionSave;
    /******************** Import ********************/
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div[5]/div[1]/div/div[2]/div/button")
    public WebElement calImport;
    @FindBy(xpath = "//div[@class='modal-title h4']")
    public WebElement calImportTitle;
    @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']//div[@class='change-phone-modal-action-zone']/button[@type='button']")
    public WebElement calImportCancel;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement calImportFile;
    /******************** Export ********************/
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div[5]/div[2]/div/div[2]/div/button")
    public WebElement calExport;
    /******************** Promotions ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"Promotions\")]")
    public WebElement promotions;
    /******************** Reservations VRPM ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"Reservations\")]")
    public WebElement reservations;
    @FindBy(xpath = "//div[@id=\"rc-tabs-0-tab-requested\"]")
    public WebElement requested;
    @FindBy(id = "rc-tabs-1-tab-pending")
    public WebElement pending;
    @FindBy(id = "rc-tabs-1-tab-upcoming")
    public WebElement upcoming;
    @FindBy(id = "rc-tabs-1-tab-canceled")
    public WebElement cancelled;
    @FindBy(id = "rc-tabs-1-tab-reservationHistory")
    public WebElement history;
    @FindBy(id = "rc-tabs-1-tab-all")
    public WebElement all;
    @FindBy(id = "rc-tabs-1-tab-archive")
    public WebElement archive;
    /******************** Property List ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"Property List\")]")
    public WebElement propertyList;
    /******************** Inbox ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"Inbox\")]")
    public WebElement inbox;
    /******************** My Profile ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"My Profile\")]")
    public WebElement myProfile;
    /******************** Log Out ********************/
    @FindBy(xpath = "//div[@id=\"popover-container\"]//a[contains(text(),\"Log Out\")]")
    public WebElement logOut;
    /*************PROPERTY DETAIL PAGES*************/
    public String galleryList = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/ul";
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/img")
    public WebElement propertyBanner;
    @FindBy(xpath = "//button[contains(text(),'Ask a question')]")
    public WebElement askQuestion;



    @FindBy(id = "rc_select_0")
    public WebElement searchInputHome;


}
