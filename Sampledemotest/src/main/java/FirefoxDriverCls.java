import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rani\\Desktop\\geckodriver.exe");

		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.google.com/");

		String s = driver2.getTitle();
		System.out.println("The title is :");
		String A = driver2.getTitle();
		String E = ("Google");
		if (A.contentEquals(E)) {
			System.out.println("Test case of gettitle is: pass");

		}

		else {
			System.out.println("Test case of gettitle is: Fail");
		}

		String Ac = driver2.getCurrentUrl();
		String Ex = ("https://www.google.com/");
		if (Ac.contentEquals(Ex)) {
			System.out.println("Test case of url is :pass");

		} else {
			System.out.println("Test case of url is:fail");
		}
//		driver2.navigate().to("http://staging-admin.sproutlogix.com/");
//		driver2.navigate().back();
//		driver2.navigate().forward();
		driver2.close();
		driver2.quit();

	}

}
