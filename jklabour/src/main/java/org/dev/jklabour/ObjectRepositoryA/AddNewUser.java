package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUser {
	
	@FindBy(linkText="Add New User")
	private WebElement NewUser;
	
	public void addNewUser()
	{
		NewUser.click();
	}

}
