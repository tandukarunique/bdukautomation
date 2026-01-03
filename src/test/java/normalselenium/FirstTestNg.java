package normalselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstTestNg {
	WebDriver driver = new ChromeDriver();
	

  
  
  @BeforeMethod
  public void beforeTest() {
	  driver.manage().window().maximize();
	  driver.get("https://demoblaze.com/");
  }
  
  
  @Test
  public void login() throws InterruptedException {
	  System.out.println("This is first TestNG test case");
//	  Assert.assertEquals(false,true, "Both are not equal");
	  WebElement navlogin, username_imput, password_input, login_button;
		navlogin = driver.findElement(By.id("login2"));
		navlogin.click();
		Thread.sleep(5000);
		username_imput = driver.findElement(By.id("loginusername"));
		username_imput.sendKeys("testmorning");
		password_input = driver.findElement(By.id("loginpassword"));
		password_input.sendKeys("test123");
		login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		login_button.click();
		Thread.sleep(5000);
		String username_displayed = driver.findElement(By.id("nameofuser")).getText();
		String expected_username = "Welcome testmorning";
		Assert.assertEquals(username_displayed, expected_username, "Both are equal");
	  
  }

  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }

}
