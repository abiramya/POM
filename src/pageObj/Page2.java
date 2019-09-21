package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class Page2 {
WebDriver driver;
	
	public Page2(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@data-validate='isEmail'])[2]")
	WebElement uname;

	//By uname = By.xpath("(//*[@data-validate='isEmail'])[2]");
	
	@FindBy(id="passwd")
	WebElement pwd;
	//By pwd = By.id("passwd");
	
	@FindBy(name="SubmitLogin")
	WebElement submit;
	//By submit = By.name("SubmitLogin");
	
	
	public void username() {
		uname.sendKeys("karthi.ashok96@gmail.com");
		
	}
	
	public void  password() {
		pwd.sendKeys("Dontbefrank0");
	
	}
	
	public void submit() {
		submit.click();
	
	}
}
