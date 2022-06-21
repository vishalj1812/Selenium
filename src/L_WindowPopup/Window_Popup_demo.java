package L_WindowPopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup_demo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/popup.php ");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Parent window title is:" + title);

		Thread.sleep(2000);

		driver.findElement(By.linkText("Click Here")).click();

		Thread.sleep(2000);

		Set<String> s = driver.getWindowHandles();

		Iterator<String> it = s.iterator();

		String w1st = it.next();
		String w2nd = it.next();

		driver.switchTo().window(w2nd);

		String ctitle = driver.getTitle();

		System.out.println("Child window title is:" + ctitle);

		Thread.sleep(2000);

		driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.name("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Click Here")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
