package mewpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PractisofLoc {

	WebDriver driver;

	@BeforeMethod
	public void OpenDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rani\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void WebAppLogin() {

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?\";");

		FindElementxpath(driver,
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]")
						.click();
		FindElementxpath(driver, "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/div[2]/div[1]")
				.click();

		FindElementname(driver, "username ").sendKeys("rani.sawant+x@sproutlogix.com");
		FindElementname(driver, "firstName").sendKeys("Rani");
		FindElementname(driver, "whsOnd ").sendKeys("Sawant");
		FindElementname(driver, "username ").sendKeys("rani.sawant+x@sproutlogix.com");
		FindElementname(driver, "username ").sendKeys("rani.sawant+x@sproutlogix.com");
	}

	public WebElement FindElementname(WebDriver driver, String name) {
		// WebElement e = driver.findElement(By.id(idName));
		return driver.findElement(By.name(name));
	}

	public WebElement FindElementclassName(WebDriver driver, String className) {
		// WebElement e = driver.findElement(By.id(idName));
		return driver.findElement(By.className(className));
	}

	public WebElement FindElementId(WebDriver driver, String idName) {
		// WebElement e = driver.findElement(By.id(idName));
		return driver.findElement(By.id(idName));
	}

	public WebElement FindElementxpath(WebDriver driver, String xpath) {
		// WebElement e = driver.findElement(By.id(idName));
		return driver.findElement(By.xpath(xpath));
	}

}
