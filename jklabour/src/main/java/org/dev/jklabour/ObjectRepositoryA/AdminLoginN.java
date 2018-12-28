package org.dev.jklabour.ObjectRepositoryA;

import java.util.Iterator;
import java.util.Set;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminLoginN {
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
	{ 
		Set<String> set=BaseClass1.driver.getWindowHandles();
		System.out.println(set.size());
		
		Iterator<String> iterator=set.iterator();
		String perentId=iterator.next();
		System.out.println(perentId);
		String childId=iterator.next();
		BaseClass1.driver.switchTo().window(childId);

		
		adminId.sendKeys(AId);
	   
	  adminPwd.sendKeys(APwd);
	  
	  loginButton.click();
		
	}
	 
	
	
	
	
}
