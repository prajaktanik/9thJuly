package testNG_XMLfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing4_groups {
 
	 @Test(groups="Funds")
	  public void A() 
	  {
		  Reporter.log("A is running", true);
		  
	  }
	  @Test(groups="HomePage")
	  public void B() 
	  {
		  Reporter.log("B is running", true);
		  
	  }
	  @Test(groups="Funds")
	  public void C() 
	  {
		  Reporter.log("C is running", true);
		  
	  } @Test(groups="HomePage")
	  public void D() 
	  {
		  Reporter.log("D is running", true);
		  
	  } @Test(groups="Funds")
	  public void E() 
	  {
		  Reporter.log("E is running", true);
		  
	  } @Test(groups="HomePage")
	  public void F() 
	  {
		  Reporter.log("K is running", true);
		  
	  }
	  
}