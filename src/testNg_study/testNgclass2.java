package testNg_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNgclass2 {
  @Test
  public void A() 
  {
	  Reporter.log("A is running", true);
  }
  @Test
  public void B() 
  {
	  Reporter.log("B is running", true);
  }
  @Test
  public void C() 
  {
	  Reporter.log("C is running", true);
  }
  @Test
  public void D() 
  {
	  Reporter.log("D is running", true);
  }
}
