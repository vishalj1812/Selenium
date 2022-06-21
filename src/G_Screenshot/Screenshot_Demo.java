package G_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Demo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
			
		Thread.sleep(2000);
				
		File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		File d = new File("C:/Users/Nikhil/OneDrive/Desktop/QA/Slenium Practices/abc.bmp");
				
		FileUtils.copyFile(s, d);
		
		

	}

}
