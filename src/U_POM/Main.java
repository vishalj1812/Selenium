package U_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		LoginPage login = new LoginPage(driver);
		Marketplace_page Marketplace = new Marketplace_page(driver);
		login.id();
		login.pass();
		login.clickbutton();
		
		Thread.sleep(2000);
		
		Marketplace.Click_Marketplace();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
