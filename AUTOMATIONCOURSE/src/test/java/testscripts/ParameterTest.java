package testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
  @Test
  @Parameters({"Pone","Ptwo"})
  public void display(int a, int b) {
	  int sum=a+b;
	  System.out.println("Sum is "+sum);
  }
}
