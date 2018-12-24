package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDeptLogin {
	@FindBy(linkText="Department Login")
	private WebElement deptLogin;
	
	
	public void deptLoginlink()
	{
		deptLogin.click();
	}

}
