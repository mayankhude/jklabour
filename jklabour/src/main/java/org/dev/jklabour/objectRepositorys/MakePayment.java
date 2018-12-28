package org.dev.jklabour.objectRepositorys;

import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakePayment {
	
	@FindBy(id="netBankingBank")
	private WebElement  nbank;
	
	@FindBy(xpath="//strong[@class='orderTotal highlight-text']")
	private WebElement totalAmount;
	
	
	@FindBy(xpath="//span[text()='Make Payment']") 
	 private WebElement payment;
	
	public void  payment()
	{
	
		WebDriverUtils1.dropdownselect(nbank, "AvenuesTest");
		System.out.println("\n total amount is ==> "+totalAmount.getText());
		payment.click();
	}
	
       
	
	@FindBy(xpath="//select [@name='PAID']")
	private WebElement status;
	
	public void transactionStatus()
	{
		WebDriverUtils1.dropdownselect(status, "N");
	}
	
	
   @FindBy(xpath="//input[@value='Return To the Merchant Site']")
    private WebElement returnToSite;

 	
    public void merchanSite()
    {
    	returnToSite.submit();
    }
	
    
    
    
    
	/*---------------------alert pop-up-------------------------*/
	     
	    
	
    

}
