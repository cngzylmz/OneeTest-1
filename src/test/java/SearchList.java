import helper.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchList extends TestBase implements OneeMethods,TestParameters {

    @Parameters({"responseCode", "testUrl", "testProperty06"})
    @Test
    public void searchListCheck() {
        driver.get(testUrl);
//        homePage(driver).searchListCheck(expectedResponseCode);
    }

}
