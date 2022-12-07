package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickStudy {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();

		    driver.manage().window().maximize();
		    
		
		    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		    
		    Thread.sleep(1000);
		    
		    //1st store in ref variable
		   WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		    
		   //object create
		   Actions act=new Actions(driver);
		   
		   //3rd 
		  // act.moveToElement(DoubleClick).perform();
		   //act.doubleClick().perform();	
	
	//2nd way
		 //  act.moveToElement(DoubleClick).doubleClick().build()	.perform();
	
	//3rd way
		   
		  act.doubleClick(DoubleClick).perform();
		  
	}

}
