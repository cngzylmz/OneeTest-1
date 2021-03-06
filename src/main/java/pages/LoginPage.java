package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertTrue;

public class LoginPage extends OneeWebElements implements ReadJson, OneeMethods {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginButton() {
        loginButton.click();
        wait(driver).until(ExpectedConditions.visibilityOf(loginHeader));
        assertTrue(loginHeader.getText().equalsIgnoreCase("LOGIN"));
    }

    public void userInfo(String userName, String password) {
        uName.sendKeys(userName);
        userPassword.sendKeys(password);
    }

    public void submitButton() {
        submitButton.click();
    }

    public void checkName(String profileName) {
        wait(driver).until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
        assertTrue(profilePhoto.getText().equalsIgnoreCase(profileName));
    }
    public void login(String userName, String password){
        loginPage(driver).loginButton();
        loginPage(driver).userInfo(userName,password);
        loginPage(driver).submitButton();
    }
}
