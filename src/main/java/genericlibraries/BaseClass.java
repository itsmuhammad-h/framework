package genericlibraries;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	public PropertyFileData pdata=new PropertyFileData();
	 public WebDriverUtilities driverutilities =new WebDriverUtilities();
	
	
	
	
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get(pdata.getData("url"));
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		}
	
	
	
	
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
	int status = res.getStatus();
	String name = res.getName();
	if(status==2){
		
	photo p=new photo();
	p.getphoto(driver, name);
	
		
	}
	driver.quit();
	}
	
}
