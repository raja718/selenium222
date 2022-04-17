package facebook.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Fbpojo.Fb_Register_Pojo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_Registration_Test {
	WebDriver driver;

	@BeforeClass
	private void beforeClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	private void registrationTest() throws InterruptedException {
		Fb_Register_Pojo l = new Fb_Register_Pojo(driver);
		l.getBtncreate().click();
		Thread.sleep(3000);

		l.getTxtfirstname().sendKeys("raja");
		l.getTxtsecondname().sendKeys("sekar");
		l.getTxtmale().click();
		l.getTxtemail().sendKeys("raja718@gmail.com");
		Thread.sleep(3000);

		l.getTxtreemail().sendKeys("raja718@gmail.com");
		l.getTxtnewpass().sendKeys("12334545");
		Select s = new Select(l.getTxtday());
		s.selectByValue("7");
		Select s2 = new Select(l.getTxtmonth());
		s.selectByValue("11");
		Select s3 = new Select(l.getTxtyear());
		s3.selectByValue("1997");
		l.getTxtmale().click();
		Thread.sleep(6000);
		Actions a = new Actions(driver);
		a.contextClick(l.getBtnsignup());

		driver.quit();

	}

}
