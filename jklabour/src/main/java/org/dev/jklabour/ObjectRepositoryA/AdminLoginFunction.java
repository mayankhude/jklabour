package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginFunction {
	@FindBy(name="email")
    private WebElement adminId;
	
	@FindBy(name="password")
	private WebElement adminPwd;
	
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginButton;


	/*-----------------create gatter for admin Access------------*/

	public WebElement getAdminId() {
		return adminId;
	}


	public WebElement getAdminPwd() {
		return adminPwd;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	public void adminLogin(String AId,String APwd)
	{ adminId.sendKeys(AId);
	   
	  adminPwd.sendKeys(APwd);
	  
	  loginButton.click();
		
	}
	 

}
