import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class PropertyDetail extends TestBase implements TestParameters, OneeMethods, ReadJson {

    @Parameters({"testProperty06"})
//    String testProperty06
    @Test(priority = 1)
    public void askQuestion() {
        driver.get(testProperty06);
        assertEquals(responseCode(driver.getCurrentUrl()), expectedResponseCode);

    }

//    @Parameters({"testUrl"})
//    //    String testUrl
//    @Test (priority=1)
//    public void mostPopularCheck() {
//        driver.get(testUrl);
//        PropertyDetailPage detailPage = PageFactory.initElements(driver, PropertyDetailPage.class);
//        detailPage.askQuestion(responseCode);
//    }
//    @Test(priority=3)
//    public  void logoCheck() throws InterruptedException {
//        PropertyDetailPage detailPage = PageFactory.initElements(driver, PropertyDetailPage.class);
//        detailPage.askQuestion(responseCode);
//    }
//    @Test(priority=4)
//    public void trendingDestinationCheck(){
//        PropertyDetailPage detailPage = PageFactory.initElements(driver, PropertyDetailPage.class);
//        detailPage.askQuestion(responseCode);
//    }


}
