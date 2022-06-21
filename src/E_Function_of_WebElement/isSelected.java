package E_Function_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?gmb=exp&biz=true&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("i3")).click();
		
		Boolean abc = driver.findElement(By.id("i3")).isSelected();
		
		System.out.println(abc);
		

	}

}
