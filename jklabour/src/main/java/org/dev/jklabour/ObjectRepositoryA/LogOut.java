package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut {
	@FindBy(xpath="//div[@class='txt']/following-sibling::i[@class='dropdown icon']")
	private WebElement icon;
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	
	
	public void logOut()
	{
		icon.click();
		
		logout.click();
	}

}
