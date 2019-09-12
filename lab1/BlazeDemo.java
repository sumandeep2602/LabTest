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
	private Object city;
	
	flight = new BlazeDemo();
	

	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_LOCATION);
		driver = new ChromeDriver();
		// 2. go to website
		driver.get(URL_TO_TEST);
		BlazeDemo city = new BlazeDemo();
	}

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void test() 
	{
		List<WebElement> city = driver.findElements(
				By.cssSelector("table+ul li a"));
		System.out.println("No of cities"+size());
		int a = ((Object) city).getCityCount();
		assertEquals(0, 7);
		
	}
 public void VirginAmericaFlight()
 {
	 double DepartureTime = 11.23;
	 assertEquals(0,DepartureTime);
	  double ArrivalTime = 1.45;
	  assertEquals(0,ArrivalTime);
 }
}
