package testscripts;

import org.testng.annotations.Test;

public class BasicTestCase {
  @Test(priority=-1,enabled=false)
  public void testcase1() {
	  System.out.println("testcase1");
	  
	  
  }
  @Test(priority=-2,groups="smoke")
  public void testcase2() {
	  System.out.println("testcase2"); 
  }
  @Test
  public void testcase3() {
	  System.out.println("testcase3");
}
  @Test(groups="smoke")
  public void testcase4() {
	  System.out.println("testcase4");
  }
  @Test
  public void testcase5() {
	  System.out.println("testcase5");
  }  
}