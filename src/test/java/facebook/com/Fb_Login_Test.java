package facebook.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Fbpojo.Fb_Login_Pojo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_Login_Test {
	WebDriver driver;

	@BeforeClass
	private void beforeClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test

	private void loginTest() {
		Fb_Login_Pojo l = new Fb_Login_Pojo(driver);
		
		l.getTxtemail().sendKeys("raja71@gmail.com");
		
		l.getTxtpass().sendKeys("12234");
	
		l.getBtnlogin().click();

	}

}
