package pack;

public class Test {

	public static void main(String[] args) 
	{
		
		
            String exePath = "D:\\Sele\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			driver.get("http://staging-app.sproutlogix.com/web/#/");
			System.out.println("Launched");

			//gettitle
			String title = driver.getTitle();
			System.out.println("Title="+title);

			//getcurrent url

			String url = driver.getCurrentUrl();
			System.out.println("URL=" + url);



			//close the browser
			driver.close();

		}
}