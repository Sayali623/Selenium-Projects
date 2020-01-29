package mavenfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDrivermetho {

	@Test
	public void Login() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rani\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.sproutlogix.com/develoop/home");

		// By class
		WebElement emailfind = driver.findElement(By.className("input"));
		emailfind.sendKeys("rani.sawant+prodemail1@sproutlogix.com");

		// By id
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sayali@1");
		// password.submit();

		driver.manage().window().maximize();

		// By Tag
		//WebElement forgot = driver.findElement(By.tagName("a"));
		//forgot.click();

		// By Link Text
		//WebElement bylink = driver.findElement(By.linkText("Forgot password?"));
		//bylink.click();

		// By Link Text
		WebElement plink = driver
			.findElement(By.partialLinkText("Forgot"));
		plink.click();
	}

}
