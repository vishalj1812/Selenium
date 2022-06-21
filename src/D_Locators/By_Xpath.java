package D_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Xpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

	}

}
