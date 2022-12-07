package upstox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserIdAndFunds {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
		//Sending username
		driver.findElement(By.id("userCode")).sendKeys("6WBHR7");
		
		//sending paasword
		driver.findElement(By.name("password")).sendKeys("SL%Rg=7sFE");

		//click on singin page
		driver.findElement(By.id("submit-btn")).click();
		
		//NAVIGATING to the next page
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//entering to the DOB
		driver.findElement(By.name("yob")).sendKeys("1997");
		
		//navigating to the home page
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
		
		//click on the no thanks 
	    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
	    
	   //validate user name
	   String ActualUsername= driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
	   String expectedUserName = "Santosh S.";
if(ActualUsername.equals(expectedUserName)) 
{
	System.out.println("Actual and expected result are matching, TC pass ");
}
else 
{
	System.out.println("Actual and expected result are not matching, TC failed ");
	
}
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
  
  //validate funds
  //clicking on funds button
  driver.findElement(By.id("funds")).click();
  
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
  
  //clicking on balance
  String funds = driver.findElement(By.xpath("(//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[3]")).getText();
  {
	  System.out.println("funds available to treads"+funds);
  }

	}

}
