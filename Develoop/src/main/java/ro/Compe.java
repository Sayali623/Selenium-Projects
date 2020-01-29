package ro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Compe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.sproutlogix.com/develoop/home");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("qa+july@sproutlogix.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sayali@1");
		driver.findElement(By.xpath("//button[@name=\"action\"]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		
		//Code for handle notification popup
		
					String myWindowHandle1 = driver.getWindowHandle();
					driver.switchTo().window(myWindowHandle1);
					driver.findElement(By.id("onesignal-popover-cancel-button")).click();
					driver.findElement(By.xpath("//*[@id=\"onesignal-popover-cancel-button\"]")).click();
					//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

		
		// Feedback Click
		
	    driver.findElement(By.xpath("/html/body/app/vertical-layout-1/div/div/div/div/content/app-home-v2/div/div[1]/div/fuse-widget[3]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/div/span/div[1]/div[2]/a")).click();		
		String myWindowHandle2 = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle2);
		driver.findElement(By.name("feedback")).sendKeys("Nip issues in the bud as they occur. If left unsaid, the problems will only recur and may multiply by a domino effect.");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 
		
			// click on send button 
			 driver.switchTo().window(myWindowHandle2);
			 driver.findElement(By.xpath("//*[@id=\"mat-tab-label-1-0\"]")).click();
			 driver.findElement(By.xpath("//give-feedback-component/give-feedback-shared/div/div[3]/button[2]")).click();
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			 
			 // Click on Ok Button after feedback
			 
			 driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/give-feedback-component/give-feedback-shared/div/div/button")).click();
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			 	
			 
			 
			 
					
			   //click on My Requests to Supporters
			    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]")).click();
				driver.findElement(By.xpath("/html/body/app/vertical-layout-1/div/div/div/div/content/app-home-v2/div/div[1]/div/fuse-widget[3]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/div/span/div[1]/div[2]/button\r\n" + "")).click();
		
		    
			      driver.findElement(By.xpath("//*[@id=\"container-3\"]")).click();		
			      
			      driver.findElement(By.className("blue-900-fg mat-body-2 view-journey-btn")).click();
					
				}

}
