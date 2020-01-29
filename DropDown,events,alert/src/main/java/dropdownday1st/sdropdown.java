package dropdownday1st;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sdropdown {

	public WebDriver driver;

	@BeforeMethod

	public void Browserlounch() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;


	}

	@Test(enabled = false)

	public void CURRENCY() {

		WebElement e = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel = new Select(e);

		// sel.selectByIndex(2);
		// sel.selectByValue("USD");
		sel.selectByVisibleText("AED");

	}

	@Test(enabled = false)
	public void PASSENGERSAdult() {

		String expected = "1 Adult";

		driver.findElement(By.className("paxinfo")).click();
		WebElement e = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select sel = new Select(e);
		sel.selectByIndex(2);

		String actual = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(actual, expected);

		driver.close();
	}

	@Test(enabled = false)
	public void PASSENGERSChild() {

		String expected = "3 Child";
		driver.findElement(By.className("paxinfo")).click();
		WebElement e = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select sel = new Select(e);
		sel.selectByIndex(3);

		String actual = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(actual, expected);

	}

	@Test(enabled = false)

	public void PASSENGERSINFANT() {
		String expected = "1 INFANT";
		driver.findElement(By.className("paxinfo")).click();
		WebElement e = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select sel = new Select(e);
		sel.selectByIndex(1);

		String actual = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(actual, expected);

	}

	@Test(enabled = false)
	public void from() {

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AIP']")).click();
		driver.findElement(By.xpath("//a[@value='IXU']")).click();

	}

	@Test(enabled = false)

	public void FamilyandFriends() {

		Boolean expectedfalse = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertFalse(expectedfalse);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Boolean expectedtrue = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertTrue(expectedtrue);
	}

	@Test(enabled=false)
	public void onetrip() {

		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		// Boolean expectedtrue =
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
		// Assert.assertTrue(expectedtrue);

		WebElement e = driver.findElement(By.id("Div1"));
		String s = e.getAttribute("style");
		System.out.println(s);
		if (s.contains("0.5")) {

			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

	}
	
	
	
}
