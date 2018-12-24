package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ALCCustPage extends ALCContractorsRegistrationsMenu{
	
	
	
	@FindBy (xpath="//td[text()='22252007']")
	private WebElement trackingidNo;
	
	
	@FindBy(xpath="//td[text()='22252007']/following-sibling::td[6]/span[@class='ui blue button mini']")
	private WebElement status;
	
	@FindBy(xpath="//td[text()='22252007']/following-sibling::td/a[text()='View']")
    private  WebElement view;
	
	
	public void gettrackingId()
	{
		
		String id=trackingidNo.getText();
		System.out.println("tracking id ===> "+id);
		
	}
	
	
	
	public void doAction(){
		view.click();}
		
	
}
