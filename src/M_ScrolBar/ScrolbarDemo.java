package M_ScrolBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolbarDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();


		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		JavascriptExecutor   j  =  (JavascriptExecutor)driver;

		j.executeScript("window.scrollBy(0,300)");

		Thread.sleep(2000);

		j.executeScript("window.scrollBy(0,-300)");

	}

}
