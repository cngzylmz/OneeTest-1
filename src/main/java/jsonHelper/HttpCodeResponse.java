package jsonHelper;

import static org.testng.Assert.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import helper.TestBase;
import org.openqa.selenium.WebDriver;

public class HttpCodeResponse extends TestBase {
	WebDriver driver;

	public HttpCodeResponse(WebDriver driver) {
		this.driver = driver;
	}

	public void head(int expectedCode) throws IOException {
		String responseURL = driver.getCurrentUrl();
		HttpURLConnection c = (HttpURLConnection) new URL(responseURL).openConnection();
		c.setRequestMethod("HEAD");
		c.connect();
		int response = c.getResponseCode();
		assertEquals(expectedCode, response);
	}
}