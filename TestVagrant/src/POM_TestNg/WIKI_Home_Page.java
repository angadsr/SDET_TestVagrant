package POM_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIKI_Home_Page {
	
	@FindBy(xpath="//input[@id=\"searchInput\"]") private WebElement search;

	@FindBy(xpath="//button[@class=\"pure-button pure-button-primary-progressive\"]") private WebElement button;
	
	public WIKI_Home_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterMovie(String srch) {
		search.sendKeys(srch);
	}
	 
	public void click() {
		button.click();
	}


}
