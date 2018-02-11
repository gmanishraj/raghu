package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public abstract class Basetest implements Autoconst {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void initDriver()
	{
		System.setProperty(Chrome_key,Chrome_value);
		
	}
//      @Parameters({"browser"})
            @BeforeClass
	public void openapplication()
	{
//    	  DesiredCapabilities whichBrowser=new DesiredCapabilities();
//			whichBrowser.setBrowserName(browser);
////			driver=new RemoteWebDriver(whichBrowser);
      driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		driver.get("https://markhughes.goherbalife.com/Account/Authentication/Login/en-US");
	}
	
//	@AfterMethod
//	public void closeapp()
//	{
//		driver.close();
//	}
	
	
}
