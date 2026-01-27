import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GetInfo {
	
	public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.qabrains.com/");
		
		//  **** Test case 1 : Validate Page Title ****

		String actualTitle=driver.getTitle();
		String expectedTitle="QA Practice Site";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	    //  **** Test case 2 : Validate CurrentUrl ****
		
		String expectedUrl="https://practice.qabrains.com/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		Map<String, String> creds = Get_Password_Username(driver);
		String username=creds.get("email");
		String password=creds.get("password");
		String incorrect_username="qa_testers@qabrains";
		String incorrect_password="Password12345";
		
	     //  **** Test case 3 : Sign in using credentials correct credentials ****
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
	    String Login_status=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    String Expected_Login_Status= "Login Successful";
	    Assert.assertEquals(Login_status, Expected_Login_Status);
	    driver.findElement(By.className("btn-submit")).sendKeys(Keys.ENTER);
	    
	    
	//  **** Test case 4 : Sign in using credentials incorrect credentials ****
	    
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys(incorrect_username);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(incorrect_password);
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
	    
	    String Login_status_incorrect=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    Assert.assertEquals(Login_status_incorrect, "Your email and password both are invalid!");
	    
	    driver.findElement(By.cssSelector("path[d='M7 7L17 17M7 17L17 7']")).click();
	    driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id='password']")).clear();
	    
    //  **** Test case 5 : Sign in using incorrect password ****
	    
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(incorrect_password);
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
	    
	    
	    String Password_status=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    Assert.assertEquals(Password_status, "Your password is invalid!");
	    
	    driver.findElement(By.cssSelector("path[d='M7 7L17 17M7 17L17 7']")).click();
	    driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id='password']")).clear();
		
	    
	    
	//  **** Test case 6 : Sign in using incorrect email ****
	    
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys(incorrect_username);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);

	    
	    String Email_status=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    Assert.assertEquals(Email_status, "Your email is invalid!");	
	    
	    driver.findElement(By.cssSelector("path[d='M7 7L17 17M7 17L17 7']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id='password']")).clear();
		
		driver.close();
	    	
	}
	
	public static Map<String, String> Get_Password_Username(WebDriver driver) {
		
		String email = driver.findElement(By.xpath("//p[contains(text(),'Email')]/b")).getText();
		String password = driver.findElement(By.xpath("//p[contains(text(),'Password')]/b")).getText();
		Map<String, String> credentials = new HashMap<>();
		credentials.put("email", email);
		credentials.put("password", password);
		return credentials;
	}
	
}
