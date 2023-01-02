package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {

	
@FindBy(xpath="//a[text()='COURSE']") private WebElement Coursebtn;

	
@FindBy(xpath="(//a[text()='Selenium Training'])[1]") private WebElement SeleniumTrainingbtn;



@FindBy(xpath="//select[@name='addresstype']") private WebElement Coursedd;


public WebElement getCoursedd() {
	return Coursedd;
}


public SkillraryDemoLogin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getCoursebtn() {
	return Coursebtn;
}

public void SeleniumTrainingbutton()
{
	SeleniumTrainingbtn.click();
}






}
