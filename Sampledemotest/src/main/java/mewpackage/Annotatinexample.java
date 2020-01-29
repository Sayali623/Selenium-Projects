package mewpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotatinexample {

	WebDriver driver;

	@BeforeMethod

	public void Beforeme() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rani\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

	@Test(priority=1)

	public void gettitle() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test (dependsOnMethods={"gettitle"})

	public void gettitle1() {
		driver.get("https://www.yahoo.com/");
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	@Test(dependsOnMethods={"gettitle"})
	
	public void gettitle2() {
		driver.get("https://www.Firefox.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
}

