package calenderandTable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshort {
	
	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	TakeScreenShort("googleScreenShort" , driver);
	

}



public static void TakeScreenShort(String fileName ,WebDriver driverOne) throws IOException {
	
	
	TakesScreenshot scrShot =((TakesScreenshot)driverOne);
	
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	
	File DestFile=new File("/Users/Rani/eclipse-workspace/Dev/src/DropDown,events,alert/Screen"+fileName+".jpg");	
	
	FileUtils.copyFile(SrcFile, DestFile);
	
	//FileUtils.copyFile(scrShot.getScreenshotAs(OutputType.FILE), new File("/Users/chinmaydeshpande/eclipse-workspace/selvinsselenium/screenShort"+fileName+".jpg"));

	
}



private static void copyFile(File srcFile, File destFile) {
	// TODO Auto-generated method stub
	
}
}


