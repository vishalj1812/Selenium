package F_CheckBox;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_options {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://techcanvass.com/Examples/multi-select.html");

		driver.manage().window().maximize();

		WebElement lbox = driver.findElement(By.id("multiselect"));
		 Select s = new Select(lbox);
		
		 List<WebElement> b = s.getOptions();
			int size =  b.size();
//			System.out.println(size);
			
			for(int i=0;i<size;i++) {//i=0 1......5
				String c = b.get(i).getText();
				
				System.out.println(c);
				
				Thread.sleep(1000);
				
			}
			driver.close();

	}

}
