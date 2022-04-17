package Fbpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Forgotten_Password_Pojo {
	public Fb_Forgotten_Password_Pojo(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Forgotten password?")	
	private WebElement btnforgotten;
	
	@FindBy(id="identify_email")	
	private WebElement txtemail;
	
	@FindBy(id="did_submit")	
	private WebElement didsubmit;
	
	public WebElement getBtncreate() {
		return btnforgotten;
	}
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getDidsubmit() {
		return didsubmit;
	}
	public void setDidsubmit(WebElement didsubmit) {
		this.didsubmit = didsubmit;
	}
	

}
