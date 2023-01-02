package scripts;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pomPages.AddtoWishListPage;
import pomPages.CoreJavaForSeleniumpage;
import pomPages.SkillraryLoginPage;

public class TestCase3  extends BaseClass
{
	
	@Parameters({"T3"})
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage sl=new SkillraryLoginPage(driver);
		sl.searchtextbox(pdata.getData("search"));
		sl.searchbutton();
		 
		CoreJavaForSeleniumpage cj=new CoreJavaForSeleniumpage(driver);
		cj.ClickCoreJavaforSelenium();
		
		AddtoWishListPage aw=new AddtoWishListPage(driver);
	//	driverutilities.SwitchToAlert(driver);  it is not working bruh to accept() the popup 
		aw.closepopup();
		driverutilities.switchFrame(driver);
		
		aw.playbutton();
		Thread.sleep(4000);
		aw.pausebutton();
		driverutilities.switchBackToMainFrame(driver);
		Thread.sleep(1000);
		aw.Addtowishlistbutton();
		
		
	}

}
