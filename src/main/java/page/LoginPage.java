package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class LoginPage extends TestBase {
	WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")WebElement USERNAME_FIELD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")WebElement PASSWORD_FIELD;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success block full-width']")WebElement SIGNINBUTTON_FIELD;
	
	public void enterUsername(String name) {
		USERNAME_FIELD.sendKeys(name);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	public void signInButtonToLogin() {
		SIGNINBUTTON_FIELD.click();
	}
	public void enterCredentials(String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		 PASSWORD_FIELD.sendKeys(password);
		 }
   public String getPageTitle() {
		  return driver.getTitle();
		 }
}
