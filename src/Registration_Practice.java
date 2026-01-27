import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Registration_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		String Name = "Kirupa";
		String Email = "vasinikirupa@gmail.com";
		String Password = "Hello123";
		String Country = "United Kingdom";
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://practice.qabrains.com/registration");
		
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys(Name);
		
		WebElement staticcountry = driver.findElement(By.id("country"));
		Select staticdropdown = new Select(staticcountry);
		staticdropdown.selectByValue(Country);
		
		WebElement staticaccount = driver.findElement(By.id("account"));
		Select staticdropdown2 = new Select(staticaccount);
		staticdropdown2.selectByContainsVisibleText("Engineer");
		
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("confirm_password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String actual_signup_output = driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
		String expected_signup_output = "Registration Successful";
		Assert.assertEquals(actual_signup_output, expected_signup_output);
		driver.findElement(By.cssSelector("path[d='M7 7L17 17M7 17L17 7'")).click();
		
	}

}
