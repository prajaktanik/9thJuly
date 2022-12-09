package popups_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoUtilityClass.Utility;

public class NeoStoxSingInPage 

{
   @FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement SingInBUtton;
	


public  NeoStoxSingInPage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void clickOnsingInbutton(WebDriver driver)
{
	Utility.wait(driver, 1000);
	Reporter.log("Clicking in Singin button");
	SingInBUtton.click();
}
 
}




}


















