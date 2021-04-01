package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Handler extends OneeWebElements {
    WebDriver driver;

    public Handler(WebDriver driver) {
        this.driver = driver;
    }

    public void closeCompetitionModal() {
        try {
            competitionModalClose.click();
        } catch (Exception e) {
            System.out.println("Competition modal gösterilmiyor...");
        }

    }

    public void closeCookies() throws InterruptedException {
        Thread.sleep(2000);
        try {
            try {
                Actions actions = new Actions(driver);
                actions.click(cookiesClose);
            } catch (Exception e) {
                e.printStackTrace();
            }
            cookiesClose.click();
        } catch (Exception e) {
            System.out.println("Cookies kapatılamadı...");
        }

    }

    public void stripePopupClose() throws InterruptedException {
        Thread.sleep(5000);
        try {
            Actions actions = new Actions(driver);
            actions.click(stripePopupClose);
        } catch (Exception e) {
            try {
                stripePopupClose.click();
            } catch (Exception ex) {
                System.out.println("Cookies kapatılamadı...");
            }
        }

    }
}
