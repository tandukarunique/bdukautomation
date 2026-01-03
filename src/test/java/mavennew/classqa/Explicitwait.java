package mavennew.classqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		
		WebElement navlogin, username_input, password_input, login_button;
		navlogin = driver.findElement(By.id("login2"));
		navlogin.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		username_input = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
		username_input.sendKeys("testmorning");
		password_input = driver.findElement(By.id("loginpassword"));
		password_input.sendKeys("test123");
		login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		login_button.click();
	}

}
