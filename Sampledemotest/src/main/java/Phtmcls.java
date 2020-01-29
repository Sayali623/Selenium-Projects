import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Phtmcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// File file = new File("C:\\Users\\Rani\\Desktop\\phantomjs.exe");
		// System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		// WebDriver driver = new PhantomJSDriver();
		// driver.get("https://www.google.com/");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rani\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		WebElement element = driver.findElement(By.name("q")); // to find the element with name property
		// driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
		// driver.findElement(By.id("q")).click();
		element.sendKeys("Facebook"); // to pass the text into textbox
		System.out.println("Element name: " + element); // to print the element

		WebElement eText = driver.findElement(By.className("szppmdbYutt__middle-slot-promo"));
		System.out.println("Text: " + eText.getText()); // to find the text

		// WebElement btnSubmit = driver.findElement(By.name("btnK"));
		// btnSubmit.click();

		element.submit();

		element = driver.findElement(By.name("q"));
		element.clear(); // to clear the text value
		element.sendKeys("Gmail");
		element.submit();

		driver.navigate().back();
		driver.navigate().back();
//		System.out.println("element");
//		element.click();
		// String e = element.getText();
		// element.clear();

		// driver.quit();
	}

}
