package F_CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_multiple {

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
	  
	  boolean b = s.isMultiple();
			  System.out.println(b);
			  
			  driver.close();
	}

}
