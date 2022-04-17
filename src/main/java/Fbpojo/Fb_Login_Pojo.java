package Fbpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login_Pojo {
	
	
	public Fb_Login_Pojo(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="email")
	
	private WebElement txtemail;
	
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnlogin;


	public WebElement getBtnlogin() {
		return btnlogin;
	}


	public WebElement getTxtemail() {
		return txtemail;
	}


	public WebElement getTxtpass() {
		return txtpass;
	}


}
