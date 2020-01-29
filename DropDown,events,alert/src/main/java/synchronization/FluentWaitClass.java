package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FluentWaitClass {

	WebDriver driver;
	
	public Boolean IsDisplayed(WebDriver driver, WebElement Ele)	
	{
		return new WebDriverWait(driver,2000).until(ExpectedConditions.visibilityOf(Ele)).isEnabled();
	}
	
	@Test(priority = 1, enabled = false)
	public void ImplicitWait()
	{
		WebDriver driver = OpenBrowser();
		
		Assert.assertTrue(IsDisplayed(driver,driver.findElement(By.xpath("//span[@class='returnCross landingSprite']"))));		
	}

	public WebDriver OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // interface WebDriver and created an object for ChromeDriver class
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		return driver;
	}	
	
	@Test
	public void FluentWait()
	{
		WebDriver driver = OpenBrowser();
				
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click(); // Strat button
		
		System.out.println("Before wait: "+driver.findElement(By.xpath("//div[@id='finish']")).getText());
		
		Wait<WebDriver> wait = 	new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		wait.until(new Function <WebDriver, WebElement>(){	
			
			public WebElement apply(WebDriver driver)
			{
				WebElement ele = driver.findElement(By.xpath("//div[@id='finish']"));
				
				if (ele.isDisplayed())
				{
					System.out.println("After Wait: "+driver.findElement(By.xpath("//div[@id='finish']")).getText());
					return ele; 
				}
				else {
					return null;
				}
			}
		});
	}
}