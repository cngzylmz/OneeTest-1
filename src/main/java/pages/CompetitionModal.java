package pages;

import helper.OneeMethods;
import helper.OneeWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompetitionModal extends OneeWebElements implements OneeMethods {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/button/span")
    public WebElement competitionModalClose;

    public void CompetitionModal(WebDriver driver){
        this.driver = driver;
    }

    public void closeModal(){
        try{
        competitionModalClose.click();
        }catch (Exception e){
            System.out.println("Modal gösterilmiyor...");
        }

    }



}
