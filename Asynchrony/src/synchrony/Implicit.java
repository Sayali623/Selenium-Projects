package synchrony;

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

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@Test(priority=1)
	public void redbusfrom() throws InterruptedException {


		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("src")).sendKeys("Mumbai");
		Thread.sleep(2000);

		driver.findElement(By.id("src")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
	}

	@Test(priority=2)
	public void redbusto() throws InterruptedException {
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys("Pune");
		Thread.sleep(3000);

		driver.findElement(By.id("dest")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);

	}
	

}
