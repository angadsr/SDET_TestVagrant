package POM_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIKI_Detail_Page {

	@FindBy(xpath="(//td[@class='infobox-data'])[10]") private WebElement release;
	
	@FindBy(xpath="(//td[@class='infobox-data'])[12]") private WebElement country;
	
	public WIKI_Detail_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String releaseDate() {
		String s1=release.getText();
		System.out.println("Extracted Release Date from WIKI -"+s1);;
		return s1;
	}
	
	public String country() {
		String s2=country.getText();
		System.out.println("Extracted Country from WIKI -"+s2);
		return s2;
	}


}
