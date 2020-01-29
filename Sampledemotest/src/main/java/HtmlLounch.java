import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlLounch {

	public static void main(String[] args) {

		WebDriver driver3 = new HtmlUnitDriver();
		driver3.get("https://google.com/");
		System.out.println(driver3.getTitle());
		
		

	}

}
