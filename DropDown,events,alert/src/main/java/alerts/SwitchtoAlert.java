package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchtoAlert {

	// Click on confirm  button
	@Test(enabled = false) 
	public void Acceptalert() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("confirmbtn")).click();
		String A = driver.switchTo().alert().getText();
		System.out.println(A);
		driver.switchTo().alert().accept();
		// driver.close();

	}

	@Test(enabled=false)
	public void dissmissalert() {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("confirmbtn")).click();
		String d = driver.switchTo().alert().getText();
		System.out.println(d);
		driver.switchTo().alert().dismiss();

	}
	
	@Test(enabled=false)
	public void dissmissalert2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Thread.sleep(20);
		String a2 = driver.switchTo().alert().getText();
		System.out.println(a2);
		driver.switchTo().alert().dismiss();
		
	}

	// Develoop alert
	@Test
	
	public void develooploginalret() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.sproutlogix.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("rani.sawant+dec3@sproutlogix.com");
		driver.findElement(By.id("password")).sendKeys("sayali@1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20);
		driver.findElement(By.xpath("//button[@class='action-button-blue mat-raised-button']")).click();
		String d = driver.switchTo().alert().getText();
		System.out.println(d);
		driver.switchTo().alert().accept();
		
		
//		driver.findElement(By.id("mat-input-1")).sendKeys("sayali@1");
//		driver.findElement(By.id("mat-input-2")).sendKeys("sayali@1");
//		driver.findElement(By.xpath("//button[@class='btn btn-success mt-20 p-4 w-100-p mat-raised-button']")).click();
//		String a3 = driver.switchTo().alert().getText();
//		System.out.println(a3);
//		driver.switchTo().alert().dismiss();
	}
}
