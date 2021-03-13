package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Handler extends OneeWebElements {
    WebDriver driver;

    public void Handler(WebDriver driver) {
        this.driver = driver;
    }

    public void closeModal() {
        try {
            competitionModalClose.click();
        } catch (Exception e) {
            System.out.println("Competition modal gösterilmiyor...");
        }

    }

    public void closeCookies() {
        try {
            try {
                Actions actions = new Actions(driver);
                actions.click(cookiesClose);
            } catch (Exception e) {
            }
            cookiesClose.click();
        } catch (Exception e) {
            System.out.println("Cookies gösterilmiyor...");
        }

    }

    public void stripePopupClose() {
        try {
            stripePopupClose.click();
        } catch (Exception e) {
            System.out.println("Stripe pop-up gösterilmiyor...");
        }

    }
}
