package popups_Study;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupsORwindowBrowser_Study {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		
       System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
	   WebDriver driver=new ChromeDriver();
		
	   driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/ ");
	    Thread.sleep(1000);
		
	 // to get ID of main page use getWidnowHandle-->
		String mainPageID = driver.getWindowHandle();
		
		System.out.println(mainPageID);
		
		
		// to open new tab/window click on main page--> new Window 
		
		driver.findElement(By.name("NewWindow")).click();
	
		// now main page along with child/ new window will be available 
		// to get all page ID's use getWindowHandles() method which will 
		//return you set of String
		
         Set<String> allPagesId = driver.getWindowHandles();
	
       //  for(String a:allPagesId)//for each loop never stop it always proceed 
        	 
      //   {
     //   	 System.out.println(a);
      //   }
         
         
      // to get desired page id use iterator and use next method to move ahead
       
        Iterator<String> it = allPagesId.iterator();//ha baher asto srvat pahile
		String mainpageID = it.next();//0th postion main page/// store Id in ref variable
		String childpage = it.next();//next page la jato/// store Id in ref variable
		
		System.out.println(mainpageID);
		System.out.println(childpage);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(childpage);
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//driver.close();
		Thread.sleep(1000);
		//driver.quit();
		
		driver.findElement(By.id("the7-search")).sendKeys("selenium");
	    driver.close();
	    
		driver.findElement(null)
		
		

	}

}
