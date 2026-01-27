import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInfo {
	
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.qabrains.com/");
		
		//  **** Test case 1 : Validate Page Title ****

		String actualTitle=driver.getTitle();
		String expectedTitle="QA Practice Site";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case 1 Passed, Title Validated.");
		}
			else {
				System.out.println("Test Case 1 Failed, Title Validation Failed.");
			}
		
		
	    //  **** Test case 2 : Validate CurrentUrl ****
		
		String expectedUrl="https://practice.qabrains.com/";
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Test Case 2 Passed, URL Validated.");
		}
			else {
				System.out.println("Test Case 2 Failed, URL Validation Failed.");
			}	
		
	     //  **** Test case 3 : Sign in using credentials correct credentials ****
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("qa_testers@qabrains.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password123");
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
	    String Login_status=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    String Expected_Login_Status= "Login Successful";
	    if (Login_status.equals(Expected_Login_Status)) {
	    	System.out.println("Test Case 3 Passed, Login Successful with Correct credentials.");
	    	driver.findElement(By.className("btn-submit")).sendKeys(Keys.ENTER);
	    }
	    	else {
	    		System.out.println("Test Case 3 Failed, Login unsuccessful with correct credentials.");
	    		
	    	}
	    
	    
	//  **** Test case 4 : Sign in using credentials incorrect credentials ****
	    
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("qa_testers@qabrains");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password12345");
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);

	    
	    String Login_status_incorrect=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    if (Login_status_incorrect.equals("Your email and password both are invalid!")) {
	    System.out.println("Test Case 4 Passed, Login unsuccessful with both incorrect credentials.");
	    }
	    	else {
	    		System.out.println("Test Case 4 Failed.");
	    		
	    	}
	    driver.findElement(By.cssSelector("path[d='M7 7L17 17M7 17L17 7']")).click();
	    driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id='password']")).clear();
	    
	    
    //  **** Test case 5 : Sign in using incorrect password ****
	    
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("qa_testers@qabrains.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password12345");
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);

	    
	    String Password_status=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    if (Password_status.equals("Your password is invalid!")) {
	    System.out.println("Test Case 5 Passed, Login unsuccessful with incorrect password.");
	    }
	    	else {
	    		System.out.println("Test Case 5 Failed,");
	    		
	    	}
	    driver.findElement(By.cssSelector("path[d='M7 7L17 17M7 17L17 7']")).click();
	    driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id='password']")).clear();
	    
	    
	//  **** Test case 6 : Sign in using incorrect email ****
	    
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("qa_testers@qabrains");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password123");
	    driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);

	    
	    String Email_status=driver.findElement(By.cssSelector("span[class='title text-black text-md']")).getText();
	    if (Email_status.equals("Your email is invalid!")) {
	    System.out.println("Test Case 6 Passed, Login unsuccessful with incorrect email.");
	    }
	    	else {
	    		System.out.println("Test Case 6 Failed,");
	    		
	    	}	
	    
	    driver.findElement(By.cssSelector("path[d='M7 7L17 17M7 17L17 7']")).click();
	    driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id='password']")).clear();
		Thread.sleep(4000);
		
		driver.close();
	    	
	}
}
