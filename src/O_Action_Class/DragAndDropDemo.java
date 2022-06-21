package O_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.uitestpractice.com/Students/Actions");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		

		
		
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, destination).build().perform();
	}

}
