package scrolling_Study;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import takeSceernShot.ScreenShotGrenralMthod;

public class ScrollingEg2 {

	public static void main(String[] args) throws IOException
	{
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();

	    driver.manage().window().maximize();
	    
	    driver.get("https://paytm.com/");

		WebElement postpaid = driver.findElement(By.xpath("//div[text()='Want it? '] "));
		
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	js.executeScript("arguments[0].scrollIntoView()",postpaid);
		
		ScrollingFunction.ScrollingIntoView(driver, postpaid);
		
		ScreenShotGrenralMthod.ScreenShotMethod(driver," paytmscreenshot");
		
		
	}

}
