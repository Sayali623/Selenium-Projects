package mavenfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Maven1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rani\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//
//		String actual = driver.getTitle();
//		String expected = "Google";
//
//		if (actual.contentEquals(expected)) {
//
//			System.out.println("Test case pass");
//		} else {
//
//			System.out.println("Test case fail");
//		}
//
//		String currentUrl = driver.getCurrentUrl();
//		String expectedUrl = "https://www.google.com/";
//		System.out.println(currentUrl);
//		if (currentUrl.contentEquals(expectedUrl)) {
//			System.out.println("Test2 case pass");
//		} else {
//
//			System.out.println("Test case2 fail");
//
//		}
//
//		driver.navigate().to("https://www.gmail.com/");
//
//		driver.navigate().back();
//
//		driver.navigate().forward();
//		driver.close();
//		driver.quit();
//
//		ChromeDriver driver2 = new ChromeDriver();
//		driver2.get("https://www.facebook.com");
//
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rani\\Desktop\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
//		driver.get("https://www.facebook.com");
//
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\Rani\\Desktop\\IEDriverServer.exe");
//		WebDriver driver3 = new InternetExplorerDriver();
//		driver3.get("https://www.instagram.com");
//
//		System.out.println("The current URL is: " + driver.getCurrentUrl());
//		System.out.println("The title is:" + driver.getTitle());

		WebElement element = driver.findElement(By.name("q"));
		System.out.println("element");
		//element.
		//element.click();

		String e = element.getText();
		element.clear();
		driver.quit();

	}

}
