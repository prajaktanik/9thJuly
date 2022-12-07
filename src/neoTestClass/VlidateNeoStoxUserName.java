package neoTestClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoUtilityClass.Utility;
import neobaseClass.Base1;
import neostoxPOM.NeoStoxHomePage;
import neostoxPOM.NeoStoxPasswordPage;
import neostoxPOM.SingInMobNo;

public class VlidateNeoStoxUserName extends Base1 
{
	NeoStoxHomePage login;
 NeoStoxPasswordPage password;
NeoStoxHomePage home;
@BeforeClass
public void launchNeoStox() throws InterruptedException
{
lunchBrowser();//form base class
login= new NeoStoxHomePage(driver);
password= new NeoStoxPasswordPage(driver);
home= new NeoStoxHomePage(driver);
}
@BeforeMethod
public void logintoNeoStox() throws EncryptedDocumentException, IOException, 
InterruptedException
{
Log.sendMobileNum(driver, Utility.readDataFromExcel(4, 0));
Log.clickOnSignInButton(driver);
Utility.wait(driver, 1000);
password.enterpassword(driver, Utility.readDataFromExcel(4, 1));
Thread.sleep(1000);
password.ClickonSubmitButton(driver);
Thread.sleep(1000);
home.handlePopUp(driver);
}
@Test
 public void validateUserID() throws EncryptedDocumentException, IOException
{
Assert.assertEquals(home.getActualUserName(driver), 
Utility.readDataFromExcel(4, 2),"TC is failed Actual and expected User Name are not matching");
Utility.screenshot(driver, home.getActualUserName(driver));
}
@AfterMethod
public void logOutFromNeoStox()
{
home.logOut(driver);
}
@AfterClass
public void closeBrowser()
{
Reporter.log("closing browser", true);
driver.close();
}
}

	
	
