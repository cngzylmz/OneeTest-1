package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class LoginPage extends OneeWebElements implements ReadJson, OneeMethods {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginButton(int expectedResponseCode) {
        loginButtonHome.click();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        wait(driver).until(ExpectedConditions.visibilityOf(loginHeader));
        assertEquals(loginHeader.getText(), "LOGIN");
    }

    public void emailAlertCheck() {
        loginButtonHome.click();
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(emailAlertLogin));
        assertEquals(emailAlertLogin.getText(), "You need to enter your email address");
    }

    public void passwordAlertCheck() {
        loginButtonHome.click();
        wait(driver).until(ExpectedConditions.visibilityOfAllElements(passwordAlertLogin));
        assertEquals(emailAlertLogin.getText(), "Password required");
    }

    public void userInfo(String userEmail, String password) {
        userMail.sendKeys(userEmail);
        userPassword.sendKeys(password);
    }

    public void submitButton(int expectedResponseCode) {
        loginSubmitLogin.click();
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
    }

    public void forgotPasswordButtonCheck() {
        wait(driver).until(ExpectedConditions.elementToBeClickable(forgotPasswordLogin));
    }

    public void registerButtonCheck() {
        wait(driver).until(ExpectedConditions.elementToBeClickable(registerButtonLogin));
    }

    public void checkLogin() {
        wait(driver).until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
        assertFalse(profilePhoto.getAttribute("src").isEmpty());
    }

    public void login(String userName, String password, int expectedResponseCode) throws InterruptedException {
        handler(driver).closeCompetitionModal();
        handler(driver).stripePopupClose();
        handler(driver).closeCookies();
        loginButton(expectedResponseCode);
        userInfo(userName, password);
        submitButton(expectedResponseCode);
    }
}
