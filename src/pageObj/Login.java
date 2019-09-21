package pageObj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Page1 obj = new Page1(driver);
		obj.signIn();
		Page2 obj1= new Page2(driver);
		obj1.username();
		obj1.password();
		obj1.submit();
	}

}
