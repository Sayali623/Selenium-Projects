package revise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RAnnotations {

	@BeforeSuite

	public void beforsuit() {

		System.out.println("Beforsuit");
	}

	@AfterSuite

	public void Aftersuit() {

		System.out.println("Aftersuit");
	}

	@BeforeMethod
	public void Beforemethod() {

		System.out.println("beforeMethod");
	}

	@AfterMethod

	public void Aftermethod() {

		System.out.println("Aftermethod");
	}

	@BeforeGroups

	public void beforeGroups() {

		System.out.println("BeforeGroups");
	}

	@AfterTest

	public void Aftertest() {

		System.out.println("Aftertest");
	}

	@Test

	public void testcase1() {

		System.out.println("Testcase 1st");
	}

	@Test

	public void testcase2() {

		System.out.println("Testcase 2nd");
	}

	@Test

	public void testcase3() {

		System.out.println("Testcase 3rd");
	}

}
