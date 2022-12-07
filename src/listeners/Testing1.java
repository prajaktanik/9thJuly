package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)

public class Testing1 {
  @Test
  public void mytest1() 
  {
	 Reporter.log("mytest1 is executing",true); 
  }
  
  @Test
  public void mytest2() 
  {  
	  
	  Reporter.log("mytest2 is executing",true);  
	  Assert.fail();
  }
  
  @Test(dependsOnMethods = "mytest2")
  public void mytest3() 
  {
	  Reporter.log("mytest3 is executing",true); 
  }
  
  
  
  
  
  
  
}
