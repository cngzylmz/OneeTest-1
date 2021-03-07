import helper.OneeMethods;
import helper.TestBase;
import helper.TestParameters;
import jsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchList extends TestBase implements OneeMethods, TestParameters, ReadJson {

    @Test
    public void searchListCheck() {
        driver.get(testUrl);
        assertEquals(responseCode(driver.getCurrentUrl()),expectedResponseCode);
        search(driver).searchListCheck(testProperty06, expectedResponseCode);
    }
}
