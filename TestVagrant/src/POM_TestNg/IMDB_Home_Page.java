package POM_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDB_Home_Page {
	
	@FindBy(xpath="//input[@class=\"imdb-header-search__input searchTypeahead__input react-autosuggest__input\"]") private WebElement search;
	
	@FindBy(xpath="//button[@aria-label=\"Submit Search\"]") private WebElement submit_button;

	//@FindBy(xpath="") private WebElement search;
	public IMDB_Home_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterMovie(String type) {
		search.sendKeys(type);
	}
	 
	public void click() {
		submit_button.click();
	}

}
