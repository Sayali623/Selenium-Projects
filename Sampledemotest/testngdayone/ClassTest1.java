package testngdayone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest1 {
	
	@BeforeMethod
	  public void Testcase3() {
		  
		  System.out.println("Testcase3");
	  }
	  @Test
	public void Testcase4() {
		  
		  System.out.println("Testcase4");
	  }

	  @AfterMethod
	  public void Testcase5() {
		  
		  System.out.println("Testcase3");
	  }
	  
	  @AfterMethod
	  public void Testcase6() {
		  
		  System.out.println("Testcase3");
	  }
}
