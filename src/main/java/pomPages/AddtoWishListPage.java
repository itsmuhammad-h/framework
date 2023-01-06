package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoWishListPage {

@FindBy(xpath="//div//button//*[@class='PlayButton_module_playIcon__1a9572b1']") private WebElement playbtn;
	

	
@FindBy(xpath="//div//button[@aria-label='Pause']//*[@class='PlayButton_module_pauseIcon__1a9572b1']") private WebElement pausebtn;
	//always go with div i mean find using parent tag

	@FindBy(xpath="	//*[text()='Add To Wishlist']	") private WebElement addtowishlistbtn;
	
	//a[text()='X']
	
	@FindBy(xpath="	//a[text()='X']") private WebElement closepopp;
	
	
	public AddtoWishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void playbutton()
	{
		playbtn.click();
	}
	
	public void pausebutton()
	{
		pausebtn.click();
	}


	public void Addtowishlistbutton()
	{
		addtowishlistbtn.click();
		
		
	}
public void closepopup()
{
	closepopp.click();
}

}
