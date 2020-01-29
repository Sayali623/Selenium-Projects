package mouseevents;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class event {
	WebDriver driver;

	@Test(enabled = false)
	public void browser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		// driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		String Expected = "https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true";
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.findElement(By.xpath("//a[@href='https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true']"))
				.click();
		String actual = driver.getCurrentUrl();

		Assert.assertEquals(actual, Expected);
	}

	@Test(enabled = false)

	public void mouseover() {

		{
			driver.get("https://www.spicejet.com");
			String ExpectedURL = "https://www.spicejet.com/SeatPlusMealComboOffer.aspx";

			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
			driver.findElement(By.xpath("//a[@href='SeatPlusMealComboOffer.aspx']")).click();
			String ActualURL = driver.getCurrentUrl();

			Assert.assertEquals(ActualURL, ExpectedURL);
		}

	}

	// Performing Mouse and Keyword interactions with selenium

	// Context click on the element

	// Double click on element
	@Test(enabled = false)
	public void Amazonexample() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		// String Expected =
		// "https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true";
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("Hello").doubleClick().build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}

	// Test case for double click on search text-box
	@Test(enabled = false)
	public void Doubleclick() {
		driver.get("https://www.amazon.com/s?k=hello&ref=nb_sb_noss_2");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));

		Actions action = new Actions(driver);
		action.doubleClick(ele).click().build().perform();

		System.out.println(ele.getText());
	}

	@Test(enabled = false)
	public void develoop() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.sproutlogix.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("qa+dec@sproutlogix.com");
		driver.findElement(By.id("password")).sendKeys("sayali@1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20);

		driver.findElement(By.id("mat-tab-label-0-0")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='blue-900-fg mat-body-2 view-journey-btn'])[2]"));

		Actions action = new Actions(driver);
		action.moveToElement(ele).keyDown(Keys.CONTROL).click().build().perform();

	}

}
