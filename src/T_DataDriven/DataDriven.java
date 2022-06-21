package T_DataDriven;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		FileInputStream a = new FileInputStream("C:/Users/Nikhil/OneDrive/Desktop/QA/Slenium Practices/facebook.xlsx");
		Sheet b = WorkbookFactory.create(a).getSheet("Sheet1");
		
		long c = (long) b.getRow(0).getCell(0).getNumericCellValue();
		
		String d = b.getRow(3).getCell(0).getStringCellValue();
		
		WebElement id = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement clickbutton = driver.findElement(By.name("login"));
		
		id.clear();
		id.sendKeys(""+ c);
		pass.clear();
		pass.sendKeys(d);
		
		clickbutton.click();
		
		Thread.sleep(10000);
				
		driver.close();
		
		
		

	}

}
