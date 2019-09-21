package pageObj;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Page3 {
	
	WebDriver driver;
	
	public Page3(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class='account']/span")
	WebElement label;
	//By label = By.xpath("//*[@class='account']/span");
	
	
	public String getlabel() {
		String text =label.getText();
		return text;
	}
}
