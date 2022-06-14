package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetupForExcel extends ReadData{
public static WebDriver driver=null;
public static String URL="https://staging.theremworld.com/";
public static String URL2="https://staging.theremworld.com/";

	
	
	public static WebDriver browser(String browser)
	{
		try{
		if(browser.equalsIgnoreCase("FireFox"))
		{

			System.setProperty("webdriver.gecko.driver", "E:\\software\\FireFox\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
		       System.setProperty("webdriver.chrome.driver", "/home/jitendra/Desktop/Software/chromedriver");
			driver=new ChromeDriver();
			///write your browser
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\software\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			///write your browser
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\software\\Edge\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		}catch(Exception e)
		{
		return null;
		}
		return driver;
		
	}

}
