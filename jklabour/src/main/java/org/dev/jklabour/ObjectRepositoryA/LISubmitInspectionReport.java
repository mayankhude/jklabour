package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LISubmitInspectionReport {
	@FindBy(linkText="Submit Inspection Report")
	private WebElement report;
	
	public void submitReport()
	{ 
		report.click();;
	}

}
