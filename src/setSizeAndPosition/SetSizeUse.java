package setSizeAndPosition;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args, String defaultdize) throws InterruptedException
	
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();

	         driver.get("https://paytm.com/");
			
       
	         
	         
	         
        org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(200, 100);
         
       // driver.manage().window().setSize(d);
        
        
         org.openqa.selenium.Dimension defaultSize = driver.manage().window().getSize();
       
         System.out.println("defaultSize is "+defaultdize);
         
	   // System.out.println("defaultSize is "+defaultSize);
	    
	   // Dimension currentSize = d.getSize();  
	    // System.out.println("currentSize is "+currentSize);
	    
	//  System.out.println("defaultSize is "+defaultSize);
	  
	  
	  
	  
	  
	  
	  
	}

}
