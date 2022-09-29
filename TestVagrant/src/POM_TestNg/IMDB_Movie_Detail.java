package POM_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDB_Movie_Detail {

	@FindBy(xpath="//a[contains(text(),'December 17, 2021 (United States)')]") private WebElement release;

	@FindBy(xpath="//a[text()='India']") private WebElement country;
	public IMDB_Movie_Detail (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String releaseDate() {
		String s1=release.getText();
		System.out.println("Extracted Release Date from IMDM website-"+s1);;
		return s1;
	}
	
	public String country() {
		String s2=country.getText();
		System.out.println("Extracted Country from IMDM website-"+s2);
		return s2;
	}

}
