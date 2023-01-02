package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {

	@FindBy(xpath="//img[@id='Selenium Training']") private WebElement SeleniumTraining;
	
	@FindBy(xpath="//div[@id='cartArea']") private WebElement CartArea;
	
	@FindBy(id="cars") private WebElement CourseSelectPrizedd;
	
	@FindBy(xpath="(//a[@href='https://bit.ly/InstaSKILLRARY'])[2]") private WebElement instaicon;
	
	
	

	public WebElement getCourseSelectPrizedd() {
		return CourseSelectPrizedd;
	}

	public CoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleniumTraining() {
		return SeleniumTraining;
	}

	public WebElement getCartArea() {
		return CartArea;
	}

	public WebElement getInstaicon() {
		return instaicon;
	}
	
	public void Clickoninstaicon()
	{
		instaicon.click();
	}
	


}
