package testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="dp1") //provide data to a test method
  public void sum(int a,int b) {
	  int c=a+b;
	  System.out.println(c);
  }
  @DataProvider (name="dp1")//dp1 is the name of data provider
  public Object[][] dp(){
	  return new Object[][] {{4,5},{6,8},{9,4}};
  }
}
