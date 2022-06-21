package U_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	@FindBy(id="email")
	private WebElement id;
	
	@FindBy(id = "pass") 
	private WebElement pass;
	
	@FindBy(name="login") 
	private WebElement loginbutton;
	
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
	
	
	public void id () {
		id.sendKeys("7038550887");
	}
	
	
	public void pass() {
		pass.sendKeys("Vishal@1307");
	}
	
	
	public void clickbutton() {
		loginbutton.click();
	}
	

}
