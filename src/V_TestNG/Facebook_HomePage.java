package V_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Facebook_HomePage {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		 driver = new ChromeDriver();
		
		System.out.println("Chrome Has Been Lounched");
	}
	
	@BeforeTest
	public void profile_setup() {
		driver.manage().window().maximize();
		System.out.println("Chrome Has been Maximized/ Profile Setup Complited");
		
	}
	
	@BeforeClass
	public void appsetup() {
		driver.get("https://www.facebook.com/login");
		System.out.println("App Stup Complited");
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.id("email")).sendKeys("7038550887");
		driver.findElement(By.id("pass")).sendKeys("Vishal@1307");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Loggedin to Facebook");
		
//		Alert a =driver.switchTo().alert();
//		a.dismiss();
		
	}
	
	@Test
	public void url() {
		
		String url= driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.facebook.com/login");
		
		System.out.println("Page Validation Is Complited");
		
	}
	
//	@Test
//	public void frieindsLink() {
//		WebElement Freinds = driver.findElement(By.xpath("//img[@class='hu5pjgll bixrwtb6']"));
//		boolean b = Freinds.isEnabled();
//		Assert.assertEquals(true, Freinds);
//		
//		System.out.println("friends Link is Active");
//	}
	
	
	
	@AfterMethod
	public void screenshot() throws IOException {
		File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File b = new File("C:/Users/Nikhil/OneDrive/Desktop/QA/Slenium Practices/Facebook.bmp");
		
		FileUtils.copyFile(a, b);
		
	}
	
	@AfterClass
	public void closeBrouser() {
		driver.close();
		
		System.out.println("Brouser Closed");
	}
	
	@AfterTest
	public void report() {
		
		System.out.println("Report is ready");
	}
	
	@AfterSuite
	public void cleanUp() {
		System.out.println("All Test cases Executed");
	}
	

}
