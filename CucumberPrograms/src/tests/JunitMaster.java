package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitMaster
{
	public static WebDriver driver;
	@BeforeClass
	public static void launch()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void close()
	{
		driver.quit();
	}

}
