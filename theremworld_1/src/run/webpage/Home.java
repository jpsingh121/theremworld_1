package run.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import util.SetupForExcel;
import web.Page.locatior.HomePage;

public class Home extends SetupForExcel{
	
	@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@Test(priority=1)
	public void VerifiyhomePage()
	{
		//WebElement as=driver.findElement(By.xpath("/html/body/section/section/div/section/div[1]/section/div[7]/button[2]"));
		Assertion ass = new Assertion();
		String title=driver.getTitle();
		ass.assertEquals(title, "theremworld");
	
		driver.quit();
		
	}
	@Test(priority=2)
	public void createDream()
	{
		//WebElement as=driver.findElement(By.xpath("/html/body/section/section/div/section/div[1]/section/div[7]/button[2]"));
		String title=driver.getTitle();
	
		HomePage page=new HomePage(driver);
		page.Addbutton.click();
		
	}

}
