package mewpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassAA {
	@Parameters({"lounch"})
	@Test
	
	public void Q(String google) {

		System.out.println("gmail login");
		System.out.println("lounch");
		System.out.println(google);
	}

	
	@Test
	public void Q1() {

		System.out.println("gmail login");
	}

	@Test
	public void Q3() {

		System.out.println("gmail login");
	}
	
}


