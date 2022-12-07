package waits_Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class ChromeOptionsUse {

	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		
		//opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
		//opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//span[text()='Shop Online']")).click();
		
		

		
		
		
	}

}
