package mavennew.classqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		WebElement navlogin, username_input, password_input, login_button;
		try {
			try {navlogin = driver.findElement(By.id("login2"));
			navlogin.click();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			username_input = driver.findElement(By.id("loginusername"));
			username_input.sendKeys("testmorning");
			password_input = driver.findElement(By.id("loginpassword"));
			password_input.sendKeys("test123");
			login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
			login_button.click();
			Thread.sleep(5000);
			}catch (ElementNotInteractableException e) {
			System.out.println("Error seen "+e.getMessage());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			username_input = driver.findElement(By.id("loginusername"));
			username_input.sendKeys("testmorning");
			password_input = driver.findElement(By.id("loginpassword"));
			password_input.sendKeys("test123");
			login_button = driver.findElement(By.xpath("//*[@id=\"nomodal\"]/div/div/div[3]/button[2]"));
			login_button.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ie) {
				System.out.println("Thread sleep interrupted: " + ie.getMessage());
			}
		
		}
		}
		catch(Exception e) {
			System.out.println("Some other exception "+ e.getMessage());
		}
		driver.quit();
	}

}
