package upstox;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
		//sending excel sheet path
		File myFile= new File("D:\\selenium\\Excel.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet2");
		String un = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String paascode = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		

		//Sending username
		driver.findElement(By.id("userCode")).sendKeys(un);
		
		
		//sending paasword
		driver.findElement(By.name("password")).sendKeys(password);

		//click on singin page
		driver.findElement(By.id("submit-btn")).click();
		
		//NAVIGATING to the next page
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//entering to the DOB
		driver.findElement(By.name("yob")).sendKeys(paascode);
		
		//navigating to the home page
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
		
		//click on the no thanks 
	    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
	   String sensexValue = driver.findElement(By.xpath("((//div[@id='ticker']/div/div)[2]//div)[6]")).getText();
	   {
		   System.out.println("sensex value is "+sensexValue);
	   }
	   String Company = driver.findElement(By.xpath("((((//div[@id='watchlistTestId']/div/div)[1]/div)[2]/div)[1]/div)[1]")).getText();
	   {
		   System.out.println("1st company in market cap "+Company);
	   }
	  String value = driver.findElement(By.xpath("(//div[@class='_1SA1FmComlVclXWCtpJpJR L8WooJepTO6Q9tbrujkiv'])[1]")).getText();
	   {
		   System.out.println("current market price is "+value);
	   }
	   
	   
	}

}
