package packag;


	
	
import java.util.Scanner;

public class BinarySearch {

	void binarysearch()
	{
	System.out.print("Enter the index range to be stored in  array ");
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display elements ");
		for(int i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		System.out.println("sorted display elements ");
		for(int i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		
		System.out.println("Enter the number you want to search ");
		int number=sc.nextInt();
		int x=0;
		int y =a.length-1;
		int m = (x+y)/2;
		 while( x <= y ){  
			       if ( a[m] < number ){  
			        x = m + 1;     
			       }else if ( a[m] == number ){  
			         System.out.println("number found at index position" + m);  
			         break;  
			       }else{  
			          y = m - 1;  
			      }  
			    }  
			    if ( x > y ){  
			       System.out.println("number is not present in array");  
			    }  
}

	 public static void main(String args[])
	 {
		BinarySearch obj =new BinarySearch();
		obj.binarysearch();
	 }
}










import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MouseActions {
	
	WebDriver driver;

	public WebDriver OpenBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // interface WebDriver and created an object for ChromeDriver class
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	@Test(enabled = false)
	public void MouseOver1()
	{
		OpenBrowser("https://book.spicejet.com");
		
		String ExpectedURL="https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true";
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.findElement(By.xpath("//a[@href='https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true']")).click();
		String ActualURL= driver.getCurrentUrl();
	
		Assert.assertEquals(ActualURL, ExpectedURL);
	}
	
	@Test(enabled = false)
	public void MouseOver2()
	{
		OpenBrowser("https://www.spicejet.com");
		String ExpectedURL="https://www.spicejet.com/SeatPlusMealComboOffer.aspx";
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.findElement(By.xpath("//a[@href='SeatPlusMealComboOffer.aspx']")).click();
		String ActualURL= driver.getCurrentUrl();
	
		Assert.assertEquals(ActualURL, ExpectedURL);
	}
	
	@Test(enabled = false)
	public void MouserOver3()
	{
		OpenBrowser("https://www.amazon.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).build().perform();
		//driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='a-spacing-small']")).isDisplayed());
				
	}

@AfterMethod
	public void CloseBowser()
	{
		driver.quit();
	}
	
}











































