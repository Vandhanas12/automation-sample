package testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {
  @Test
  public void testcase1() {
	  System.out.println("testcase1");
  }
  @Test
  public void testcase2() {
	  System.out.println("testcase2");
}
  @Test
  public void testcase3() {
	  System.out.println("testcase3");
}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }
  @AfterMethod //run after each method
  public void afterMethod() {
	  System.out.println("afterMethod");
}
  @BeforeClass //run after test
  public void beforeClass() {
	  System.out.println("beforeClass");
  }
  @AfterClass
  public void afterClass() {
  System.out.println("afterClass");
}
  @BeforeTest //before class and after suite
  
  public void beforeTest() {
	  System.out.println("beforeTest");
	}
  @AfterTest
  
  public void afterTest() {
	  System.out.println("afterTest");
  }
  @BeforeSuite //run first
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }
  @AfterSuite //run last after every methods
  public void afterSuite() {
	  System.out.println("afterSuite");
  }
}
  
  