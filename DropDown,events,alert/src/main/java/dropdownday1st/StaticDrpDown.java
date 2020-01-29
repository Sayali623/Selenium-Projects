package dropdownday1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StaticDrpDown {

	public WebDriver driver;

	@BeforeMethod

	// StaticDropdown

	public void DriverLounch() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		// driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

	}

	@Test(enabled=false)

	public void selectByValue() {

		WebElement e = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel = new Select(e);

		sel.selectByValue("USD");
	}

	@Test(enabled=false)

	public void selectByIndex() {

		WebElement e = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		String Actual = "USD";
		Boolean Expected = false;

		Select sel = new Select(e);

		sel.selectByIndex(2);

		List<WebElement> actuals = driver.findElements(By.tagName("option"));

		System.out.println(actuals.size());

		System.out.println(actuals);

		for (int i = 0; i < actuals.size(); i++) {

		}

	}

	@Test(enabled = false)

	public void selectByIndex1() {

		String expected = "2 Adult";

		driver.findElement(By.id("divpaxinfo")).click();
		WebElement e = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select sel = new Select(e);
		sel.selectByIndex(1);
		String actual = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(actual, expected);

	}
	
	@Test(enabled=false)
	
	public void selectstartendpoint() {
		
		String expected = "Adampur (AIP)";


		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AIP']")).click();
		//String actual = driver.findElement(By.xpath("//a[@value='AIP']")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();

	}

@Test(enabled=false)
	
	public void testCase() {
		
	
	Boolean  expectedfalse = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
	Assert.assertFalse(expectedfalse);
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	Boolean  expectedtrue = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
	Assert.assertTrue(expectedtrue);
	
	
		

	}

}


