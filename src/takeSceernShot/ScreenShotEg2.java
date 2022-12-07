package takeSceernShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 
		 String s= RandomString.make(4);
	       
		 File destination=new File("D:\\selenium\\screenshot\\mytesting"+s+".png");
	        FileHandler.copy(Source, destination);
	}

}
