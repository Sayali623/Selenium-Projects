package screenshort;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshorts {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/");

		driver.manage().window().maximize();
		Date date = new Date();
		String name = "screenshot_"+date.toString();
		System.out.println(name);
		screenshort("scrshot", driver);
	}
		

	public static void screenshort(String fileName, WebDriver driver) throws IOException {
		TakesScreenshot scr = ((TakesScreenshot) driver);
		File srcfile = scr.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("/Users/Rani/eclipse-workspace/Dev/src/DropDown,events,alert/Screen" + fileName + ".jpg");
		FileUtils.copyFile(srcfile, DestFile);
	}

}
