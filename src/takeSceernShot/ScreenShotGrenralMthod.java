package takeSceernShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotGrenralMthod
{
public static void ScreenShotMethod(WebDriver driver, String name) throws IOException
{

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
File destination=new File("D:\\selenium\\screenshot\\"+name+".png");
FileHandler.copy(src, destination);



}
	
	
	
	
}
