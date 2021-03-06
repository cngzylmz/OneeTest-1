package pages;

import helper.OneeWebElements;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class RegisterPages extends OneeWebElements {
    WebDriver driver;

    public RegisterPages(WebDriver driver) {
        this.driver = driver;
    }

    public void profilePolicyCheck() {
        //TA
        String agencyPolicy = "Sub Agency Agreement and Self Billing Agreement ";
        String privacyPolicy = "Privacy Policy ";
        String termsOfUse = "Terms of Use";

        //Privacy Policy
        //Sub Agency Agreement and Self Billing Agreement,
        //Terms of Use
        //Property Manager Agency Agreement and Self Billing Agreement,
        for (int i = 0; i <= 3; i++) {
            selectProfile.click();
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.DOWN).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();


            List<WebElement> policyElements = driver.
                    findElements(By.xpath(policyList + "//a"));
            for (WebElement e : policyElements) {
                System.out.print("Text within the Anchor tab" + e.getText() + "\t");
            }
        }


        /* *** profile g�re de�i�en policy ve input kontrol� yap�lacak ***** */
    }

    public void profileInputsCheck() {
        selectProfile.click();
        policyCheck.click();
	/*	webSite.sendKeys(null);
		companyName.sendKeys(null);
		network.sendKeys(null);
		IATANumber.sendKeys(null);
		agencyName.sendKeys(null);

		/**** profile g�re de�i�en input kontrol� yap�lacak ***** */
    }

    public void registerInputs() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        selectProfile.click();//Property Manager seçilecek.
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        selectTitle.click();// Mr seçilecek.
        actions.sendKeys(Keys.ENTER).build().perform();
        registerFirstName.sendKeys("Cengiz");
        registerSecondName.sendKeys("YILMAZ");
        pNumber.sendKeys("+44 7400 " + String.format("%06d", number()));
        String randomMail = randomText();
        registerMail.sendKeys(randomMail + "@test.com");
        registerMailRepeat.sendKeys(randomMail + "@test.com");
        password.sendKeys("123456eE!");
        js.executeScript("window.scrollBy(0, 1900);");
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", policyCheck);
    }

    public void sendRegisterForm() {
        sendRegisterForm.click();
    }

    public void phoneCode() throws InterruptedException {
        // send-sms -> data -> body -> "Your Onee phone verification code: 7706" split
//		String url = driver.getCurrentUrl();

//			  JSONObject obj = new JSONObject();
//		        String body = obj.getJSONObject("data").getString("body");
//		        System.out.println(body);
//		        System.out.println(body);
//		        String[] code = body.split(" ");
//		        System.out.println(code[5]);
        Thread.sleep(5000);
    }


    public void registerButton() {
        registerButton.click();
    }

    public int number() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        return number;
    }

    public String randomText() {
        String AlphaNumericString = "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder rt = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            rt.append(AlphaNumericString
                    .charAt(index));
        }
        return rt.toString();
    }
}
