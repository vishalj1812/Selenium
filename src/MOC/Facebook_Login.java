package MOC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

//		driver.findElement(By.id("email")).sendKeys("7038550887");
//		driver.findElement(By.id("pass")).sendKeys("Vishal@1307");
//		driver.findElement(By.name("login")).click();

		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		un.clear();

		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		un.clear();

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));

		Thread.sleep(2000);

		un.sendKeys("7038550887");
		pass.sendKeys("Vishal@1307");
		login.click();

		driver.findElement(By.xpath("//span[contains(text(),'See more')]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		driver.findElement(By.xpath("//span[contains(text(),'Events')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Create new event')]")).click();

	}

}
