package scripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	
	@Parameters({"T1"})
	@Test
	public void Tc1()
	{
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillraryDemoApp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		
		driverutilities.moveToElement(driver,sd.getCoursebtn());
		sd.SeleniumTrainingbutton();
		
		 AddtoCartPage at=new  AddtoCartPage(driver);
		driverutilities.doubleClick(driver, at.getPlusBtn());
		at.addtocartButton();
		driverutilities.SwitchToAlert(driver);
		
		
         at.addtocartMiniButton();
         at.GotoCart();
		
	}

}
