package Q_BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		List<WebElement> links=driver.findElements(By.tagName("a"));//40

		System.out.println("Total links are "+links.size());

		Thread.sleep(2000);
		
		for(int i=0;i<links.size();i++)
		{

		WebElement ele= links.get(i);//gmail

		String url=ele.getAttribute("href");//

		verifyLinkActive(url);

		}


		}
		public static void verifyLinkActive(String linkUrl)
		{
		try
		{
		URL url = new URL(linkUrl);

		HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

		httpURLConnect.setConnectTimeout(3000);

		httpURLConnect.connect();

		if(httpURLConnect.getResponseCode()==200)
		{
		System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
		}
		if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
		System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
		}
		} catch (Exception e) {
			

		}


	}

}
