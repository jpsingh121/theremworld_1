package run.webpage;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import okio.Timeout;
import util.SetupForExcel;
import web.Page.locatior.HomePage;

public class LoginCase extends SetupForExcel{
	

	@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void loginToDream() throws InterruptedException
	{
		HomePage page=new HomePage(driver);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		Actions action=new Actions(driver);
		action.moveToElement(page.signupIcon).build().perform();
		wait.until(ExpectedConditions.visibilityOfAllElements(page.signInButton));
		page.signInButton.click();
		page.EamailID.sendKeys("jitendra@panalinks.com");
		page.Password.sendKeys("panalink1");
		page.login.click();
		
		Thread.sleep(2000);
	}

}
