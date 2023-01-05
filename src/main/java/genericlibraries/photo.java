package genericlibraries;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo {
	

  public void  getphoto(WebDriver driver,String name) throws IOException //we give String name so tht to knw which test case got failed 
	{
		
	  //this is how we get current   system date
	Date d=new Date();
    String currentdate=	d.toString().replaceAll(":", "-"); //we are using replaceAll coz evry computer has diff format of displaying current date and time 
    
    
    TakesScreenshot ts=(TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File dst=new File(AutoConstant.photopath +currentdate+name+ ".png"); //photopath contains   ./photo/ path of  ss folder 
	  FileUtils.copyFile(src, dst);
	    
	 }

}
