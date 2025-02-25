package subdriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeSubDriver {

	@Test(enabled = false)
	public void driver() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> ls = driver.findElements(By.tagName("a")); // Created list of element (tag(a)for link)

		WebElement driverFooter = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]")); // Click on footer
		List<WebElement> isfooter = driverFooter.findElements(By.tagName("a")); // created sub driver(Footer)
		System.out.println(isfooter.size()); // Count of footer link
		WebElement singleColumDriver = driverFooter.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]")); // xpath
																														// of
																														// single
																														// driver
		int sizesin = singleColumDriver.findElements(By.tagName("a")).size();
		List<WebElement> singlecolumnlist = singleColumDriver.findElements(By.tagName("a"));
		for (int i = 0; i < sizesin; i++) {
			singlecolumnlist.get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		}
		Set<String> id = driver.getWindowHandles();
		Iterator<String> is = id.iterator();
		while (is.hasNext()) {

			System.out.println(driver.switchTo().window(is.next()).getTitle());
		}
	}

	// Making SubDriver redbus.com Example
	// ADD-ONS
	@Test(enabled = true)
	public void redbussubdriver() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		List<WebElement> lt = driver.findElements(By.tagName("a"));
		WebElement footer = driver.findElement(By.xpath("//ul[@class='add-ons-tab']"));
		List<WebElement> LI = footer.findElements(By.tagName("a"));
		System.out.println(LI.size());

	}

	// Sub Driver
	@Test(enabled = false)
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");

		List<WebElement> lt = driver.findElements(By.tagName("a"));
		WebElement footer1 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[@class='maincontainer']/div[@id='header']/div[@class='main_header']/div[@class='middle']/div[@class='middle2']/div[@id='smoothmenu1']/ul/li[@class='li-login float-right tabres']/ul[1]"));
		List<WebElement> LI = footer1.findElements(By.tagName("a"));
		System.out.println(LI.size());

		List<WebElement> q = footer1.findElements(By.xpath(""));

	}

//How to select date 

	@Test(enabled = false)
	public void cal() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		WebElement firstdriver=	driver.findElement(By.cssSelector("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		

//		List WebElement firstdriver.findElement(By.className("ui-state-default"));
//
//		List<WebElement> si = driver.findElements(By.xpath("//a[@class='ui-state-default ui-state-active ui-state-hover']"));
//
//		System.out.print(si.size());
//		for (int i = 1; i < si.size(); i++) {
//
//			si.get(i).getText().equalsIgnoreCase("22");
//
//			si.get(i).click();
//
//		}
	}

	
	
	
	
}
