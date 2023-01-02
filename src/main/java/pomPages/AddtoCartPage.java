package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	
	
	@FindBy(id="add") private WebElement plusBtn;
	
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-flat']") private WebElement addtocartbtn;

	
	
	@FindBy(xpath="//a[@class='dropdown-toggle']") private WebElement  AddtocartMinibtn;
	
	

	
	@FindBy(xpath="	//a[text()='Go to Cart']") private WebElement  Gotocartbtn;

	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getPlusBtn() {
		return plusBtn;
	}



	
    public void addtocartButton()
	{
		addtocartbtn.click();
	}

  
   public void addtocartMiniButton()
   {
	   AddtocartMinibtn.click();
   }

   
   public void GotoCart()
   {
	   Gotocartbtn.click();
   }







}
