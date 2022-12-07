package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
      @Override
      public void onTestFailure(ITestResult result)
{
	Reporter.log("Test case is failed please have a look again",true);
	Reporter.log("test case is fail taken screenshot",true);
}	

     @Override
	 public void onTestSuccess(ITestResult result) 
{
	Reporter.log("Test case is completed successfully",true);	
}
     
     @Override
    public void onTestSkipped(ITestResult result)
     
{
   Reporter.log("Test case is skipped please retry",true);
}
     
     
     
     
     
     
     
     
     
     
     
     
     
}














