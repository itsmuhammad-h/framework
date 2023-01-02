package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	 
@FindBy(xpath="//a[text()=' GEARS '] ")  private WebElement gearsbtn;


@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]") private WebElement skillraryDemoAppbtn; 


@FindBy(xpath="//div[@class='left_block clearfix']//input[@placeholder='Search for Courses']") private WebElement searchtb; 



@FindBy(xpath="//div[@class='left_block clearfix']//input[@value='go']") private WebElement searchbtn; 







public SkillraryLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
		
	
public void gearsbutton()
{
	gearsbtn.click();
}

public void skillraryDemoApp()
{
	skillraryDemoAppbtn.click();
}

public void searchtextbox(String text)
{
	searchtb.sendKeys(text);
}

public void searchbutton()
{
	searchbtn.click();
}

}
