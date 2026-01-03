package mavennew.classqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		
		WebElement navlogin, username_imput, password_input, login_button;
		navlogin = driver.findElement(By.id("login2"));
		navlogin.click();
		Thread.sleep(2000);
		username_imput = driver.findElement(By.id("loginusername"));
		username_imput.sendKeys("testmorning");
		password_input = driver.findElement(By.id("loginpassword"));
		password_input.sendKeys("test123");
		login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		login_button.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
