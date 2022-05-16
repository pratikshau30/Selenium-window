package webActions;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Activity {

	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 */
	public WebDriver startBrowser() throws MalformedURLException {
		// Code to Launch Browser using Zalenium in Crio workspace
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.CHROME);
		driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);

		return driver;
	}

	public static void snippet_2_2(WebDriver driver) throws InterruptedException {
		// TODO
	}

	public static void snippet_3_2(WebDriver driver) {
		// TODO
	}

	public static void snippet_5_2(WebDriver driver) {
		// TODO
	}

	public static void snippet_7_2(WebDriver driver) {
		driver.get("https://crio-qkart-frontend-qa.vercel.app/login");

		String[] urlArray = { "https://www.android.com/intl/en_in/", "https://www.amazon.in/ref=nav_logo",
				"https://www.google.com/", "https://www.netflix.com/in/", "https://www.redbus.in/",
				"https://in.bookmyshow.com/", "https://www.tesla.com/", "https://www.apple.com/",
				"https://www.flipkart.com/", "https://en.wikipedia.org/wiki/Main_Page" };

		JavascriptExecutor jscript = (JavascriptExecutor) driver;
		for (int i = 0; i < urlArray.length; i++) {
			jscript.executeScript("window.open('" + urlArray[i] + "');");

		}

		// TODO: Add Code to Print all the window handles of this Driver object
	}

	public static void snippet_7_3(WebDriver driver) {
		// TODO
	}

	public static void main(String[] args) throws InterruptedException, MalformedURLException, ParseException {

		// Create the object of Activity class
		Activity activity = new Activity();

		// Start the browser
		WebDriver driver = activity.startBrowser();

		// Uncomment for Milestone 2 Activity 2
		// snippet_2_2(driver);

		// Uncomment for Milestone 3 Activity 2
		// snippet_3_2(driver);

		// Uncomment for Milestone 5 Activity 2
		// snippet_5_2(driver);

		// Uncomment for Milestone 7 Activity 2
		// snippet_7_2(driver);

		// Uncomment for Milestone 7 Activity 3
		// snippet_7_3(driver);
	}

}
