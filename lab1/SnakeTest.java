import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	@Before
	public void setUp() throws Exception
	{
      SnakeTest snake1 =new SnakeTest();
      SnakeTest snake2 = new SnakeTest();
       
	}

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public void isHealthy()
	{
		
	}
	
	public void fitsInCage()
	{
		
	}
}
