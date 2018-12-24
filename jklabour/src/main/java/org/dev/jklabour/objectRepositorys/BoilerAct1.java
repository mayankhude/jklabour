package org.dev.jklabour.objectRepositorys;

import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public class BoilerAct1 extends WebDriverUtils1{
	 
	  @FindBy(xpath="//a[contains(text(),'Boiler Act')]")
	  private WebElement boiler;
	  
	  public void boilerAct()
	  {
		  selectDropdownMenu(boiler);
	  }

}
