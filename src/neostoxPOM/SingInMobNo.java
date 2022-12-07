package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoUtilityClass.Utility;

public class SingInMobNo 
{

	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement mobileNumField;
	@FindBy(id="lnk_signup1") private WebElement singInButton;
	
	
	public SingInMobNo (WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);

		
	}

   public void sendMobileNum(WebDriver driver,String mobNo)
   {
	   Utility.wait(driver, 1000);
	   mobileNumField.sendKeys("mobNo");
	   	Reporter.log("sending moblie number..",true);
   }
   public void clickonOnSingInButton(WebDriver driver)
   {
		Utility.wait(driver, 1000);
	    singInButton.click();

	    Reporter.log("clicking on sinfin button",true);

   }
	



	
	
}
