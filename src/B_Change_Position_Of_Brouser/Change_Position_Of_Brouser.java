package B_Change_Position_Of_Brouser;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_Position_Of_Brouser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		Point p = new Point(100,100);
		
		driver.manage().window().setPosition(p);

	}

}
