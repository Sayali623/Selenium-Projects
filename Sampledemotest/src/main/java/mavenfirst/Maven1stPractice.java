package mavenfirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maven1stPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rani\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//
//		String abc = driver.getTitle();
//		System.out.println("abc");
//
//		String actual = driver.getTitle();
//		String expected = ("Google");
//		if (actual.contentEquals(expected)) {
//			System.out.println("Test case is Pass");
//
//		} else {
//			System.out.println("Test case is fail");
//
//		}
//		String A = driver.getCurrentUrl();
//		// System.out.println("A");
//		String E = "https://www.google.com/";
//		if (A.contentEquals(E)) {
//			System.out.println("Test case2 pass");
//		} else {
//			System.out.println("Test case2 fail");
//		}
//	
//		driver.navigate().to("https://www.gmail.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.close();
//		driver.quit();
//		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rani\\Desktop\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.google.com/");

		String s = driver1.getTitle();
		System.out.println("The title is :");
		String A = driver1.getTitle();
		String E = ("Google");
		if (A.contentEquals(E)) {
			System.out.println("Test case of gettitle is: pass");

		}

		else {
			System.out.println("Test case of gettitle is: Fail");
		}

		String Ac = driver1.getCurrentUrl();
		String Ex = ("https://www.google.com/");
		if (Ac.contentEquals(Ex)) {
			System.out.println("Test case of url is :pass");

		} else {
			System.out.println("Test case of url is:fail");
		}
		driver1.navigate().to("http://staging-admin.sproutlogix.com/");
		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.close();
		driver.quit();
	}

}
