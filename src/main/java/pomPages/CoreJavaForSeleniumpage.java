package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumpage {

@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']") private WebElement CorejavaforSelenium;
	
	
public  CoreJavaForSeleniumpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



public void ClickCoreJavaforSelenium()
{
	CorejavaforSelenium.click();
}
}
