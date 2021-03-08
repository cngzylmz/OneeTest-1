package helper;

import org.openqa.selenium.WebDriver;

public class Handler extends OneeWebElements {
    WebDriver driver;

    public void Handler(WebDriver driver) {
        this.driver = driver;
    }

    public void closeModal() {
        try {
            competitionModalClose.click();
        } catch (Exception e) {
            System.out.println("Modal gösterilmiyor...");
        }

    }
    public void cookiesClose() {
        try {
            cookiesClose.click();
        } catch (Exception e) {
            System.out.println("Cookies gösterilmiyor...");
        }

    }
}
