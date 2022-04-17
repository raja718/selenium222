package facebook.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Fbpojo.Fb_Forgotten_Password_Pojo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_Forgotton_Password_Test {
	WebDriver driver;

	@BeforeClass
	private void beforeClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test

	private void forgottenpassTest() {
		Fb_Forgotten_Password_Pojo l = new Fb_Forgotten_Password_Pojo(driver);
		l.getBtncreate().click();
		l.getTxtemail().sendKeys("raja718@gmail.com");
		l.getDidsubmit().click();
		
	}

	
}
