package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import locator.Locator;

public class Loginpage {
	WebDriver driver;
	Locator loc = 	new Locator(); 
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
				
		
	}
	public void clicknavLogin() {
	driver.findElement(By.id(loc.nav_id)).click();	
	}

	public void enterusername(String username) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(loc.username_id)).sendKeys(username);
	}
	public void enterpassword(String password) {
		driver.findElement(By.id(loc.password_id)).sendKeys(password);
	}
	public void clickloginbutton() {
		driver.findElement(By.xpath(loc.button_xpath)).click();
	}
	
	public void loginToApplication(String username, String password) {
		clicknavLogin();
		enterusername(username);
		enterpassword(password);
		clickloginbutton();
	}
}
