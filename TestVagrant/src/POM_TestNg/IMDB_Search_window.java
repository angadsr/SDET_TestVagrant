package POM_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDB_Search_window {
	@FindBy(xpath="//a[text()='Pushpa: The Rise - Part 1']") private WebElement option;
	
	public IMDB_Search_window (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click() {
		option.click();
	}




}
