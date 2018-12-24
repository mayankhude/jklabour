package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersLogin {
	@FindBy(id="email-input")
	private WebElement userLogin;
	
	@FindBy(id="password-input")
	private WebElement userpwd;
	
	@FindBy(id="submit-btn")
	private WebElement loginButton;

	public WebElement getUserLogin() {
		return userLogin;
	}

	public WebElement getUserpwd() {
		return userpwd;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public void login(String user, String pwd)
	{
		userLogin.sendKeys(user);
		userpwd.sendKeys(pwd);
		loginButton.click();
	}
	

}
