package waits_Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		   
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
		
		
		

	}

}
