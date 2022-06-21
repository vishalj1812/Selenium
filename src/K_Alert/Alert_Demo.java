package K_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.name("cusid")).sendKeys("123");

		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);
		
		String abc = driver.switchTo().alert().getText();
		System.out.println(abc);


		//driver.switchTo().alert().accept();//for click on OK button

		Alert a = driver.switchTo().alert();//for click on cancel button
		a.accept();
		Thread.sleep(2000);

		//driver.switchTo().alert().accept();
		
		
		driver.close();


	}

}
