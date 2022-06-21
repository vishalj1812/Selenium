package U_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Marketplace_page {
	
	@FindBy(linkText="Marketplace")
	private WebElement mar;
	
	
	public Marketplace_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void Click_Marketplace () {
		mar.click();
	}

}
