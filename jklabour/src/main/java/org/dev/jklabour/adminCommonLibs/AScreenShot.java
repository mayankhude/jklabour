package org.dev.jklabour.adminCommonLibs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AScreenShot{
	public static String capture( String screenShotName) throws IOException
	{
		
		
		 TakesScreenshot ts= (TakesScreenshot)AdminBaseClassALC. driver ;
		  File source=ts.getScreenshotAs(OutputType.FILE);
		  String dest=System.getProperty("user.dir")+"/ErrorScreenshot/"+screenShotName+".png";
		  	
		  File destination =new File("./adminFailedScreenShot/"+screenShotName+".png");
		  FileUtils.copyFile(source, destination);
		 return dest;
	}

	
}
