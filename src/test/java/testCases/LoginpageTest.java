package testCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.DatabasePage;
import page.LoginPage;

public class LoginpageTest extends TestBase {
	LoginPage loginpageobj;
	@BeforeMethod
	public void setup() {
		init();
		loginpageobj = PageFactory.initElements(driver, LoginPage.class);
	}
	@Test
	public void logintest () throws Throwable {
		loginpageobj.enterUsername(DatabasePage.getData("username"));
		loginpageobj.enterPassword(DatabasePage.getData("password"));
		//loginpageobj.enterPassword("abc123");
		loginpageobj.signInButtonToLogin();
		takeScreenshotAtEndOfTest(driver);
	}
	
@AfterMethod
public void tearDown() {
	driver.close();
	driver.quit();
}


}
