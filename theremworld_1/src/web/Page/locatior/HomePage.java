package web.Page.locatior;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.SetupForExcel;

public class HomePage extends SetupForExcel{
	//WebDriver driver;
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[text()='Sign Up']")
	public WebElement signupButton;
	@FindBy(xpath="//div[contains(@class,'dropdown dropdown-menu-animation is-hoverable is-mobile-modal')]")
	public WebElement signupIcon;
	
	@FindBy(xpath="//a[text()='Sign In']")
	public WebElement signInButton;
	
	
	@FindBy(xpath="//input[contains(@placeholder, 'ID or email')]")
	public WebElement EamailID;
	
	@FindBy(xpath="//input[contains(@placeholder, 'Your password')]")
	public WebElement Password;
	
	@FindBy(xpath="//button/span[text()='Login']")
	public WebElement login;
	//button/span[text()='Login']
	
	
	@FindBy(xpath="/html/body/section/section/div/section/div[1]/section/div[7]/button[2]")
	public WebElement VerifiyText;
	
	
	
	@FindBy(xpath="//button/span[text()='Add']")
	public WebElement Addbutton;
	
	@FindBy(xpath=".//*[@id='86-content']/section/div/div[1]/div[2]/div/div/input")
	public WebElement EnterDreamName;
	
	@FindBy(xpath=".//*[@id='86-content']/section/div/div[1]/div[2]/div/div/input")
	public WebElement EnterDreamDetails;
	
	@FindBy(xpath=".//*[@id='86-content']/section/div/div[1]/div[2]/div/div/input")
	public WebElement EnterDreamAnalysis;
	
	@FindBy(xpath=".//*[@id='86-content']/section/div/div[1]/div[2]/div/div/input")
	public WebElement submitdetail;
}
