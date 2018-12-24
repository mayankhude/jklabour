package org.dev.jklabour.commonLibS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot{
	public static String capture( String screenShotName) throws IOException
	{
		 TakesScreenshot ts= (TakesScreenshot) BaseClass1.driver ;
		  File source=ts.getScreenshotAs(OutputType.FILE);
		  String dest=System.getProperty("user.dir")+"/ErrorScreenshot/"+screenShotName+".png";
		  	
		  File destination =new File("./screenShot/"+screenShotName+".png");
		  FileUtils.copyFile(source, destination);
		 return dest;
	}

	
}
