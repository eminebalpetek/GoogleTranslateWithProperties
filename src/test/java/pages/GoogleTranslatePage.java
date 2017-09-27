package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class GoogleTranslatePage {
	private WebDriver driver;
	
	public GoogleTranslatePage(){
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="source")
	public WebElement sourceTextField;
	
	@FindBy(id="gt-res-dir-ctr")
	public WebElement translationTextField;
	
	@FindBy(xpath="//div[.='English']")
	public WebElement english;
	
	@FindBy(id="gt-sl-gms")
	public WebElement sourceLanIcon;
	
	@FindBy(id="gt-tl-gms")
	public WebElement translationLanIcon;
	
	@FindBy(id = "gt-submit")
	public WebElement translate;
	
}
