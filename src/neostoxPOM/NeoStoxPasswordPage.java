package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoUtilityClass.Utility;

public class NeoStoxPasswordPage 
{

	

	@FindBy(xpath="//input[@type='password']") private WebElement paaWordField;
	@FindBy(xpath="//a[@class='btn btn-neo']") private WebElement SubmitButton;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpassword(WebDriver driver,String pass) throws InterruptedException
	
	{    
		Utility.wait(driver, 1000);
		 paaWordField .sendKeys(pass);
		Reporter.log("sending password",true);
	}
	
	public  void ClickonSubmitButton(WebDriver driver) 
	{
	
		
		
	
		Utility.wait(driver, 5000);
		
		SubmitButton.click();
		Reporter.log("clicking on submit button..",true);
	}
	
	
}
