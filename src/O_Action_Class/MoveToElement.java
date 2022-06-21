package O_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement abc = driver.findElement(By.id("searchDropdownBox"));
		abc.click();

		Actions a = new Actions(driver);

		for (int i = 1; i <= 10; i++) {
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(1000);
		}

		a.sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
