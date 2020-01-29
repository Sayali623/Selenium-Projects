package testngdayone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AllAnnotation {

	@BeforeSuite
	public void BeforeSuiteTest() {
		System.out.println("Before SuiteTest");
	}

	@AfterSuite
	public void AfterSuiteTest() {
		System.out.println("After SuiteTest");
	}

	@BeforeMethod
	public void BeforeMethodTest() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void AfterMethodTest() {
		System.out.println("After Method");
	}

	@BeforeGroups
	public void BeforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@Test
	public void Testcase1() {
		System.out.println("Class 1 Test case 1");
	}

	@Test
	public void Testcase2() {
		System.out.println("Class 1 Test case 2");
	}

	@Test
	public void Testcase3() {
		System.out.println("Class 1 Test case 3");
	}

}
