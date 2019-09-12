import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BlazeDemo {
	final String CHROMEDRIVER_LOCATION = "/Users/macstudent/Desktop/chromedriver";
	// Website we want to test
	final String URL_TO_TEST = "http://blazedemo.com/";
	
	// -----------------------------------
	// Global driver variables
	// -----------------------------------
	WebDriver driver;
	

	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_LOCATION);
		driver = new ChromeDriver();
		// 2. go to website
		driver.get(URL_TO_TEST);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
