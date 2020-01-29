package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Implicit {
	
	public WebDriver driver;

	@BeforeMethod

	public void Browserlounch() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		// implicitlyWait always applied globally -- is available for all the webElements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		

	}

	@Test(priority=1)
	public void redbusfrom() throws InterruptedException {


		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("src")).sendKeys("Mumbai");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
	}

	@Test(priority=2)
	public void redbusto() throws InterruptedException {
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys("Pune");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("dest")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);

	}

}
