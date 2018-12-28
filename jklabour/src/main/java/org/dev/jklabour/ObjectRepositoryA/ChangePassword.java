package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassword {
	@FindBy(linkText="Change Password")
	private WebElement changePWD;
	
	public void changePassword()
	{
		changePWD.click();
	}

}
