package mavennew.classqa;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");

WebElement simp_nav,simp_btn,conf_nav,conf_btn,prom_nav,prom_btn;
simp_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
simp_nav.click();

simp_btn = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
simp_btn.click();
Thread.sleep(5000);
Alert alt = driver.switchTo().alert();
alt.accept();

conf_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
conf_nav.click();
conf_btn = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
conf_btn.click();
Thread.sleep(5000);
alt.dismiss();

prom_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
prom_nav.click();
prom_btn = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
prom_btn.click();
Thread.sleep(5000);
alt.sendKeys("Class qa");
alt.accept();

	}

}
