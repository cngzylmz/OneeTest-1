package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

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

    public void userInfo(String userEmail, String password) {
        userMail.sendKeys(userEmail);
        userPassword.sendKeys(password);
    }

    public void submitButton(int expectedResponseCode) {
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);
        loginSubmitButtonLogin.click();
    }

    public void checkName(String profileName) {
        wait(driver).until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
        assertEquals(profilePhoto.getText(), profileName);
    }

    public void login(String userName, String password, int expectedResponseCode) {
        loginButton(expectedResponseCode);
        userInfo(userName, password);
        submitButton(expectedResponseCode);
    }
}
