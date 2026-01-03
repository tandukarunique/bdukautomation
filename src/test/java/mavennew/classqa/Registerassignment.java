package mavennew.classqa;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");

WebElement firstName,lastName,address,phone,gender,hobbiescri,hobbiesmov,language,skill,country,selectcountry,year,month,day,password,confirmpw;

 firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
firstName.sendKeys("Unique");
Thread.sleep(2000);
lastName = driver.findElement(By.xpath("//input[@placeholder = 'Last Name']"));
lastName.sendKeys("Tandukar");
Thread.sleep(2000);

address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
address.sendKeys("Kathmandu, Nepal");

Thread.sleep(2000);

phone= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
phone.sendKeys("98000000");
Thread.sleep(2000);

gender = driver.findElement(By.xpath("//input[@value = 'Male']"));
gender.click();

hobbiescri = driver.findElement(By.id("checkbox1"));
hobbiescri.click();

hobbiesmov = driver.findElement(By.id("checkbox2"));
hobbiesmov.click();

language = driver.findElement(By.id("msdd"));
language.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[text()='English']")).click();
Thread.sleep(1000);
//Click outside to close language dropdown
address.click();
Thread.sleep(1000);

skill = driver.findElement(By.id("Skills"));
Select skillSelect = new Select(skill);
skillSelect.selectByVisibleText("Java");
Thread.sleep(1000);

 country = driver.findElement(By.id("countries"));
Select countrySelect = new Select(country);
countrySelect.selectByValue("India");
Thread.sleep(2000);

selectcountry = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
selectcountry.click();
Thread.sleep(1000);



year = driver.findElement(By.id("yearbox"));
Select yearSelect = new Select(year);
yearSelect.selectByValue("2002");
Thread.sleep(1000);

month = driver.findElement(By.xpath("//select[@placeholder = 'Month']"));
Select monthSelect = new Select(month);
monthSelect.selectByVisibleText("November");
Thread.sleep(1000);

day = driver.findElement(By.xpath("//select[@placeholder = 'Day']"));
Select daySelect = new Select(day);
daySelect.selectByValue("3");
Thread.sleep(1000);

//password ko
password = driver.findElement(By.id("firstpassword"));
password.sendKeys("Password..");
Thread.sleep(2000);

//Confirm
confirmpw = driver.findElement(By.id("secondpassword"));
confirmpw.sendKeys("Password..");
Thread.sleep(2000);

//Submit btn
driver.findElement(By.id("submitbtn"));
Thread.sleep(3000);

driver.quit();


















	}

}
