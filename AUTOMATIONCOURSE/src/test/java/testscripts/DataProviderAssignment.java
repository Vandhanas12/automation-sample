package testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAssignment {
  @Test(dataProvider="dp")
  public void print() {
	  String name="Vandhana";
			  String place="Kollam";
			  System.out.println("name+place= ");
  }
  @DataProvider (name="dp")
  public Object[][] dp(){
	  return new Object[][] {{4,5},{6,8},{9,4}};
  }
}
