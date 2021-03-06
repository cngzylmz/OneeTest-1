package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import jsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PropertyDetailPage extends OneeWebElements implements OneeMethods,ReadJson {
    WebDriver driver;



    public PropertyDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void askQuestion(int expectedResponseCode) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        assertTrue(askQuestion.isDisplayed());
        askQuestion.click();
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
        driver.navigate().back();

    }

    public void checkPropertyBanner() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(propertyBanner.isDisplayed());
    }

    public void checkPhotoGallerySize() {
        List<WebElement> list = driver.findElements(By.xpath(galleryList + "//li"));
        sAssert().assertTrue(list.size() > 0);
    }

    public void selectDate() {

    }

}
