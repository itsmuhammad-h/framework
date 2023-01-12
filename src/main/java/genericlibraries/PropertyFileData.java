package genericlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileData {

	
	public String getData(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(key);     //just give p.getProperty(key); here while reading data in baseclass we get to see suggestion of changing type to String from void 
		
	}
}
