package F_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		driver.manage().window().maximize();
		
	  WebElement lbox =  driver.findElement(By.id("multiselect"));
	  
	  Select s = new Select(lbox);
	  s.selectByIndex(0);
	  s.selectByIndex(3);
	  
	  s.selectByValue("hyundai");
	  s.selectByVisibleText("Maruti Suzuki");
	  
	  Thread.sleep(3000);
	  
	  s.deselectByIndex(0);
	  s.deselectByIndex(3);
	  
	  s.deselectByValue("hyundai");
	  s.deselectByVisibleText("Maruti Suzuki");
	  
	  Thread.sleep(2000);
	  driver.close();
	}

}
