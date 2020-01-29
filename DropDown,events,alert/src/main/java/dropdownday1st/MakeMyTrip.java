package dropdownday1st;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeMyTrip {

	public WebDriver driver;

	@BeforeMethod

	public void Browserlounch() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();
	}

	// Auto Suggestive drop down example One
	// MakeMyTrip 
	@Test(enabled = false)
	public void FromTo() {
		// From city
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("(//div[@class='calc60'])[2]")).click();
		Boolean To = driver.findElement(By.xpath("//label[@for='fromCity']")).getText().contains("DEL");
		Assert.assertTrue(To);
	}

	@Test(enabled=false)
	public void Tocity() {
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("(//div[@class='calc60'])[1]")).click();
		Boolean To = driver.findElement(By.xpath("//label[@for='toCity']")).getText().contains("BOM");
		Assert.assertTrue(To);
		
	}

	@Test(enabled=false)
	public void Departuredate() {
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@aria-label='Wed Jan 22 2020'])[1]")).click();
		String actualValue = driver.findElement(By.xpath("//label[@for='departure']")).getText(); 
		Assert.assertTrue(actualValue.contains("22 Jan20")); 
	}

	@Test(enabled=false)
	public void returnArea() {
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		driver.findElement(By.xpath("//label[@for='return']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@aria-label='Sat Jan 25 2020'])")).click();
		String actualValue = driver.findElement(By.xpath("//label[@for='return']")).getText(); 
		Assert.assertTrue(actualValue.contains("26 Jan20")); 
	}

	@Test(enabled = true)

	public void Traveller()  {
		
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
		driver.findElement(By.xpath("//li[@data-cy='infants-1']")).click();
		driver.findElement(By.xpath("//li[@data-cy='travelClass-1']")).click();
		
		String a[] = new String[4];
		a[0] = driver.findElement(By.xpath("(//li[@class='selected'])[2]")).getText();
		a[1]= driver.findElement(By.xpath("(//li[@class='selected'])[3]")).getText();
		a[2]= driver.findElement(By.xpath("(//li[@class='selected'])[4]")).getText();
		a[3]= driver.findElement(By.xpath("(//li[@class='selected'])[5]")).getText();
		
		int sum=0;
		for(int i=0; i<a.length-1; i++)
		{
			sum += Integer.parseInt(a[i]);
		}
		//System.out.println("Total: "+sum);
				
		driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();
		
		Boolean Total = driver.findElement(By.xpath("//label[@for='travellers']")).getText().contains(Integer.toString(sum));

		Assert.assertTrue(Total);
			
	}

}
