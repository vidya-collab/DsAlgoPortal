package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ConfigReader;
import utils.DriverManager;
import utils.LoggerLoad;

public class Login_pf {
	WebDriver driver= DriverManager.getdriver();
	ConfigReader configFileReader=DriverManager.configReader();

	
	//button[@class='btn']
	
	@FindBy(xpath = "//button[@class='btn']") WebElement getstarted;
	
	public Login_pf() {
		PageFactory.initElements(driver , this);

	}
	
	public void GetStarted() {
		getstarted.click();
	}
	
}
	
	
	
	
	
	
	
