package org.dev.jklabour.ObjectRepositoryA;

import org.dev.jklabour.adminCommonLibs.labcom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageUser {
	
	@FindBy(xpath="//a[contains(text(),'Manage Users')]")
	private WebElement manageUser;
	
	public void manageUsers()
	{
		JavascriptExecutor je =(JavascriptExecutor) labcom.driver;
		je.executeScript("arguments[0].scrollIntoView(true);", manageUser);
		manageUser.click();
	}

}
