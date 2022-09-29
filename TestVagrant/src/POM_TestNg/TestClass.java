package POM_TestNg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestClass {
	WebDriver driver;
	String imdb_date;
	String imdb_country;
	String wiki_date;
	String wiki_country;
	@BeforeMethod
	public void openapp() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Angad v\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driver.get("https://www.imdb.com/");
	}
	
	
	
	@Test
	public void extract_method() {
		IMDB_Home_Page home=new IMDB_Home_Page(driver);
		home.EnterMovie("Pushpa:The Rise");
		home.click();
		
		IMDB_Search_window search=new IMDB_Search_window(driver);
		search.click();
		 
		IMDB_Movie_Detail movie=new IMDB_Movie_Detail(driver);
		 imdb_date=movie.releaseDate();
		 imdb_country=movie.country();
		
		driver.get("https://www.wikipedia.org/");
		
		WIKI_Home_Page wh=new WIKI_Home_Page(driver);
		wh.EnterMovie("Pushpa");
		wh.click();

		WIKI_Detail_Page o = new WIKI_Detail_Page(driver);
		 wiki_date= o.releaseDate();
		 wiki_country=o.country();
		
	}
	
	@AfterMethod
	public void verify() {
	
		//Removing Special Symbol from Date
		String result=imdb_date.replaceAll("[^0-9a-zA-Z ]","");
		
		//Making Both Date in Same Standard Format like - DD/MM/YYYY
		String [] s=result.split(" ");
		String actualResult=s[1]+" "+s[0]+" "+s[2];
		
		SoftAssert sa= new SoftAssert();
		//Comparing Both Release dates
		sa.assertEquals(actualResult,wiki_date,"Testcase -Failed due to both Release Date is different");
		//sa.assertEquals(actualResult,wiki_date,"Testcase -Pass due to both Release Date is same");
		
		
		//Comparing Both Country name
		sa.assertEquals(imdb_country, wiki_country,"Testcase -Failed due to both Country Name is different");
		//sa.assertEquals(imdb_country, wiki_country,"Testcase -Pass due to both Country Name is same");
		
		sa.assertAll();
	}
}


