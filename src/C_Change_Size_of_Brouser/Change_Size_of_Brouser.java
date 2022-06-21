package C_Change_Size_of_Brouser;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_Size_of_Brouser {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.in/");
		
		Dimension D = new Dimension(300,700);
		
		driver.manage().window().setSize(D);
		Thread.sleep(2000);
		
		driver.close();

	}

}
