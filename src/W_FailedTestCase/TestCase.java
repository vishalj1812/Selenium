package W_FailedTestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends Base {

	@BeforeMethod
	
	public void setup() {
		
		initialization();
	}
	
	@Test
	public void test1() {
		
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
}
