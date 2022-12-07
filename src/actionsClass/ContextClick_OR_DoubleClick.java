package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ContextClick_OR_DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	
	{
    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();

	    driver.manage().window().maximize();
	    
	
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    
	    Thread.sleep(1000);
	    
	    
	    //1.find element to be handle and store in the ref variable
	    WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
	    
		//create an object of action class
	    Actions act=new Actions(driver);
	    		
	  //  act.moveToElement(rightClickButton).perform();
	  //  act.contextClick().perform() ;  
	    
	    //2nd way
	    
	   // act.moveToElement(rightClickButton).contextClick().build().perform();	
	
	    //3rd way
	    act.contextClick(rightClickButton).perform();	    
	    
	}

}
