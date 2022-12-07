package scrolling_Study;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingFunction 
{
public static void ScrollingIntoView(WebDriver driver,WebElement element)

{
            JavascriptExecutor js = (JavascriptExecutor)driver;
	
            js.executeScript("arguments[0].scrollIntoView()", element);
            
         
}



}
