import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Ecommerce_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practice.qabrains.com/ecommerce");
		driver.findElement(By.id("email")).sendKeys("test@qabrains.com");
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//Automation with auto suggestive drop down.
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[data-slot='popover-trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys("A");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("div[data-slot='command-item']"));
		String A_Z_Ascending = "A to Z (Ascending)";
		for(WebElement option:options) 
		{
			if (option.getText().equalsIgnoreCase(A_Z_Ascending))
			{
			option.click();	
			}
		}
		String actual_filter=driver.findElement(By.cssSelector("button[data-slot='popover-trigger']")).getText();
		Assert.assertEquals(actual_filter, A_Z_Ascending);
		
	}

}
