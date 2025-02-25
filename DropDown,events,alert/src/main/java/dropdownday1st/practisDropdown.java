package dropdownday1st;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practisDropdown {

	public WebDriver driver;

	@Test(enabled=false)

	// StaticDropdown

	public void DriverLounch() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		// driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

	}

	@Test(enabled = false)

	public void staticDropdown() {

		WebElement e = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel = new Select(e);

		sel.selectByValue("USD");

		// driver.close();

	}

	@Test(enabled = false)

	public void staticDropdown1() {

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

		// driver.close();

	}

//	@Test(enabled = false)
//
//	public void staticDropdown2() {
//
//		WebElement e = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select sel = new Select(e);
//
//		sel.selectByVisibleText("AED");
//
//		// driver.close();
//
//	}

	@Test(enabled = false)

	public void staticDropdown3() {

		String expected = "1 Adult";

		driver.findElement(By.id("divpaxinfo")).click();
		WebElement e = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select sel = new Select(e);
		sel.selectByIndex(1);

//		WebElement e1 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
//		Select sele = new Select(e1);
//		sele.selectByIndex(2);
//
//		WebElement e2 = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
//		Select selec = new Select(e2);
//		selec.selectByIndex(1);
//		driver.findElement(By.id("divpaxinfo")).click();

		String actual = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(actual, expected);

		driver.close();

	}

	@Test(enabled = false)

	public void staticDropdown4() {

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("mumbai");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("goa");
		driver.findElement(By.xpath("//li[@class='livecl city_selected']//a[contains(text(),'Goa (GOI)')]")).click();

		// driver.findElement(By.id("ctl00_mainContent_view_date1")).sendKeys("26 dec
		// 2019");

	}

	// a[@value='AIP']
	@Test(enabled = false)

	public void loc() {

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AIP']")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']"))
				.click();

	}

	@Test(enabled = false)

	public void mk() {

		// driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.id("fromCity")).sendKeys("Mumbai");

		driver.findElement(By.className("font14 ")).click();

		driver.close();

	}

	@Test(enabled = false)

	public void Oneway() {

		Boolean expectedfalse = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertFalse(expectedfalse);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Boolean expectedtrue = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertTrue(expectedtrue);

	}

	@Test(enabled = false)

	public void RoundTrip() {

//		Boolean expectedfalse = driver.findElement(By.xpath("//label[@class='select-label']")).isSelected();
//		Assert.assertFalse(expectedfalse);
//		driver.findElement(By.xpath("//label[@class='select-label']")).click();
//		Boolean expectedtrue = driver.findElement(By.xpath("//label[@class='select-label']")).isSelected();
//		Assert.assertTrue(expectedtrue);

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// driver.findElement(By.id("ctl00_mainContent_view_date1")).isEnabled();
		Boolean expectedtrue = driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		Assert.assertTrue(expectedtrue);

	}

	@Test(enabled = false)

	public void onew() {

//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//		Boolean expectedfalse =driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
//		Assert.assertFalse(expectedfalse);

		WebElement e = driver.findElement(By.id("Div1"));
		String s = e.getAttribute("style");
		System.out.println(s);
		if (s.contains("0.5")) {

			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

	}

	@Test(enabled = false)

	public void cal() {

//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//		driver.findElement(By.id("id=\"ctl00_mainContent_ddl_originStation1_CTXT\"")).click();
//		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		// driver.findElement(by)
	}

	@Test(enabled = false)
	public void search() {

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

	// Open “http://toolsqa.com/automation-practice-form/”

	@Test
	
	public void toolsqa() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");	
		
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		oSelect.selectByVisibleText("Europe");
		Thread.sleep(2000);
		oSelect.selectByIndex(2);
		Thread.sleep(2000);
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		for(int i =0; i < iListSize ; i++){
			// Storing the value of the option	
			String sValue = oSelect.getOptions().get(i).getText();
			// Printing the stored value
			System.out.println(sValue);
			// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
			if(sValue.equals("Africa")){
				oSelect.selectByIndex(i);
				break;
				}
			}	    

		
	}
	
	
}