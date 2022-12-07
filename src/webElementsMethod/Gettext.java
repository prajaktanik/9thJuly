package webElementsMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	public static void main(String[] args) 
	{ System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
    WebDriver driver=new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.findElement(id="https://www.google.co.in/")
		
	}

}
