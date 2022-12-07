package testNG_XMLfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3_groups {
  @Test(groups="Funds") 
  
  public void A()
  {
	  Reporter.log("A is running", true);
	  
  }
  @Test(groups="Funds") 
  public void X() 
  {
	  Reporter.log("X is running", true);
	  
  }
  @Test(groups="HomePage") 
  public void Y() 
  {
	  Reporter.log("Y is running", true);
	  
  } @Test(groups="Funds") 
  public void W() 
  {
	  Reporter.log("W is running", true);
	  
  } @Test(groups="HomePage")
  public void V() 
  {
	  Reporter.log("V is running", true);
	  
  }  @Test(groups="HomePage")
  public void H() 
  {
  
	  Reporter.log("K is running", true);
	  
  }

}
