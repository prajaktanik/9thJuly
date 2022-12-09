package neoUtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	//Excel
	//screenshot
	//scrolling
	//wait
	
	

	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException 
	{

		File myFile = new File("D:\\selenium\\Excel.xlsx");
		
		Sheet mySheet= (Sheet) WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		String value = ((org.apache.poi.ss.usermodel.Sheet) mySheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	
}
	public static void screenshot(WebDriver driver, String string) throws IOException
	{   wait(driver,500);
	    wait(driver,500);
	    wait(driver,500);
	  
	    
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("D:\\selenium\\screenshot\\"+string+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void ScrollingIntoView(WebDriver driver,WebElement element)

	{           wait(driver,500);
	            wait(driver,500);
	            JavascriptExecutor js = (JavascriptExecutor)driver;
		
	            js.executeScript("arguments[0].scrollIntoView(true)", element);
	            Reporter.log("scrolling into view",true);
	         
	}
	public static void wait(WebDriver driver,int waitTime)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("Waiting for"+"ms",true);
	}
}


















