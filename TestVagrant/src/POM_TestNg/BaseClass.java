package POM_TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;
	public void configureBrowser()
	{
		//configure browser
		System.setProperty("webdriver.chrome.driver", "F:\\Angad v\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//open application in browser
		driver.get("https://www.imdb.com/");
	}

}
