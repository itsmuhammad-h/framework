package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase2  extends BaseClass{
	@Parameters({"T2"})
	@Test
	public void tc2() throws IOException, InterruptedException
	{
		SkillraryLoginPage sl=new SkillraryLoginPage (driver);
		sl.gearsbutton();
		sl.skillraryDemoApp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin (driver);
		driverutilities.switchTabs(driver);
		
		
		driverutilities.DropdownSelectByVisibleText(sd.getCoursedd(), pdata.getData("Coursedd"));
		
		CoursePage cp=new CoursePage(driver);
		
		
		//driverutilities.scrollByJavascriptExecutor(driver, 0, 195);
		
	//	driverutilities.dragAnddrop(driver, cp.getSeleniumTraining(), cp.getCartArea());

		/*
WebElement location=cp.getCartArea();
Point loc = location.getLocation();
 int x = loc.getX();
 int y = loc.getY();
 */
 
      driverutilities.clickAndHold(driver, cp.getSeleniumTraining());
     driverutilities.scrollByJavascriptExecutor(driver, 0, 194);
      Thread.sleep(1000);
      driverutilities.moveToElement(driver, cp.getCartArea());
      driverutilities.release(driver, cp.getSeleniumTraining());
      Thread.sleep(3000);
      
	
		
		
	//	driverutilities.ScrollIntoView(driver, cp.getInstaicon());
	//	cp.Clickoninstaicon();
	
		
		
	}
	
}
