package pages;

import helper.OneeMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PmPages extends helper.OneeWebElements implements OneeMethods {
    WebDriver driver;

    public PmPages(WebDriver driver) {
        this.driver = driver;
    }

    public void dashboard() throws InterruptedException {
        wait(driver).until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
        profilePhoto.click();
        Thread.sleep(5000);
//        wait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id("popover-container")));
//        wait(driver).until(ExpectedConditions.visibilityOf(dashboard));
        dashboard.click();
    }

    public void viewUpcoming() throws InterruptedException {
        wait(driver).until(ExpectedConditions.elementToBeClickable(viewBooking));
        viewBooking.click();
        wait(driver).until(ExpectedConditions.visibilityOf(requested));
        sAssert().assertTrue(driver.findElement(By.
                xpath("//a[contains(text(),'Upcoming') and @aria-selected='true'] ")).isDisplayed());
        driver.navigate().back();
    }

    public void viewProperty() throws InterruptedException {
        viewProperty.click();
        Thread.sleep(3000);
        sAssert().assertEquals(driver.getCurrentUrl(), "https://dev.onee.com/account/property-list");
        driver.navigate().back();
    }
}
