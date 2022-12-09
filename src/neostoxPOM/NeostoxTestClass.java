package neostoxPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxTestClass {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5000));
		
		NeoStoxSingInPage login=new NeoStoxSingInPage(driver);
		login.clicksingInbutton();
		
		SingInMobNo Mob=new SingInMobNo(driver);
		Mob.enterMobNo();
		Mob.clickonSingIN();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(90000000));
		NeoStoxPasswordPage PWD=new NeoStoxPasswordPage(driver);
		PWD.enterpassword(driver, null);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(90000000));
		PWD.ClickonSubmitButton(driver);
		
		NeoStoxHomePage OkCloseButton=new NeoStoxHomePage(driver);
		OkCloseButton.ClickOnOkButton();
		OkCloseButton.close();
		OkCloseButton.logOut();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
