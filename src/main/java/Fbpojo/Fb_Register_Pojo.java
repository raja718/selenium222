package Fbpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Register_Pojo {
	public Fb_Register_Pojo(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText="Create New Account")	
	private WebElement btncreate;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")	
	private WebElement txtfirstname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")	
	private WebElement txtsecondname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")	
	
	private WebElement txtemail;
	@FindBy(xpath="(//input[@type='text'])[5]")	
	private WebElement txtreemail;

	
	public WebElement getTxtreemail() {
		return txtreemail;
	}


	@FindBy(xpath="(//input[@type='password'])[2]")	
	private WebElement txtnewpass;
	
	@FindBy(xpath="(//select[@name='birthday_day'])")	
	private WebElement txtday;
	
	@FindBy(xpath="(//select[@name='birthday_month'])")	
	private WebElement txtmonth;
	@FindBy(xpath="(//select[@name='birthday_year'])")	
	private WebElement txtyear;
	
	
	@FindBy(xpath="(//input[@type='radio'])[2]")	
	private WebElement txtmale;
	

	@FindBy(linkText="Sign Up")	
	private WebElement btnsignup;


	public WebElement getBtncreate() {
		return btncreate;
	}


	public WebElement getTxtfirstname() {
		return txtfirstname;
	}


	public WebElement getTxtsecondname() {
		return txtsecondname;
	}


	public WebElement getTxtnewpass() {
		return txtnewpass;
	}


	public WebElement getTxtday() {
		return txtday;
	}


	public WebElement getTxtmonth() {
		return txtmonth;
	}


	public WebElement getTxtyear() {
		return txtyear;
	}


	public WebElement getTxtmale() {
		return txtmale;
	}


	public WebElement getBtnsignup() {
		return btnsignup;
	}


	public WebElement getTxtemail() {
		return txtemail;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
