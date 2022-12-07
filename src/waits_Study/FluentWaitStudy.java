package waits_Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitStudy {

	public static void main(String[] args)
	{
		
		   
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		WebElement singIn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		 FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver);
		
		w.withTimeout(Duration.ofSeconds(1)).pollingEvery(Duration.ofSeconds(1));
		
		w.withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofSeconds(2));
		w.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOf(singIn));
		singIn.click();
		

	}

}
