package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActionsClass {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();

	    driver.manage().window().maximize();
		
	    
	    //click by using by actions class
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
		//1.find the web element handle and store in ref variable
	    WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	    
	    //2.create an Actions class
	    
	    Actions act=new Actions(driver);
	    
	    //3 using actions class take the any action
	    
	    //1st way
	   // act.moveToElement(radioButton1).perform();
	    //act.click().perform() ;     
	
	    //2nd way
	  act.moveToElement(radioButton1).click().build().perform();
	
	 //3rd way
	  
	  act.click(radioButton1).perform();}

}
