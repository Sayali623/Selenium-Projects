package calenderandTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calender {

	WebDriver driver;

	@Test(enabled = false)
	public void path2usacalender() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel-date")).click();
		// driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]")).click();

		List<WebElement> si = driver.findElements(By.className("day"));
		for (int i = 0; i < si.size(); i++) {

			if (si.get(i).getText().equalsIgnoreCase("22"))
				;
			{

				si.get(i).click();
			}

		}
	}

	@Test(enabled = false)
	public void spicejtcal() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		WebElement footer = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		footer.findElement(By.className("ui-state-default")).click();
		List<WebElement> e = footer
				.findElements(By.className("//a[@class='ui-state-default ui-state-active ui-state-hover']"));
		System.out.println(e.size());
		for (int i = 1; i < e.size(); i++) {
			e.get(i).getText().equalsIgnoreCase("23");
			e.get(i).click();

		}
	}

	// Count of link in calendar
	@Test(enabled = true)

	public void sd() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		List<WebElement> l = driver.findElements(By.tagName("a"));
		WebElement footer = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		List<WebElement> isfooter = footer.findElements(By.tagName("a"));
		System.out.println(isfooter.size());
		System.out.println(footer.getText());

	}

	
// Table Example of cricbuzz.com
	@Test(enabled=false)
	public void cla4() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/26574/pak-vs-ban-2nd-t20i-bangladesh-tour-of-pakistan-2020");
		WebElement table = driver.findElement(By.className("cb-ltst-wgt-hdr"));
		int sum = 0;
		List<WebElement> list = table.findElements(By.cssSelector(".cb-scrd-itms"));
		// System.out.println(sizey);

		for (int i = 0; i < list.size() - 3; i++) {
			String value = driver.findElements(By.cssSelector(".cb-scrd-itms div:nth-child(3)")).get(i).getText();
			int runs = Integer.parseInt(value);
			sum = sum + runs;

		}

		System.out.println(sum);

		int extra = Integer
				.parseInt(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		int total = Integer
				.parseInt(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		int totalRuns = sum + extra;
		System.out.println(total);
		System.out.println(totalRuns);
		Assert.assertEquals(totalRuns, total);

	}
	
	// ksrtc.in Using JavascriptExecutor
	// Javascript DOM can extract hidden elements
	// because selenium cannot identify hidden elements - (Ajax implementation)
	// investigate the properties of object if it have any hidden text
	@Test(enabled=false)
	public void cal5() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText();
		
		
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		   
		 String Script = "return document.getElementById(\"fromPlaceName\").value;";
		 
		 String text=(String)js.executeScript(Script);
		 System.out.println(text);
		 int i = 0;
			// BENGALURU INTERNATION AIPORT
			while (!text.equalsIgnoreCase("BENGALURU INTATION AIPORT")) {
				i++;
				driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

				text = (String) js.executeScript(Script);
				System.out.println(text);
				if (i > 10) {
					break;
				}

			}

			if (i > 10) {
				System.out.println("Element not found");
			} else {
				System.out.println("Element  found");
			}

		
	}
}

