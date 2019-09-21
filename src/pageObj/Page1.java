package pageObj;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
 WebDriver driver;
	
	public Page1(WebDriver x)
	{
		this.driver=x;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Sign in')]")
	WebElement signInbtn;
	
	//By signInbtn= By.xpath("//*[contains(text(),'Sign in')]");
	
	
	public void signIn() {
		
		signInbtn.click();
	}
	

}
