package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadCertificate {
	
	@FindBy(linkText="Upload Certificate")
	private WebElement certificate;
	
	public void uploadCetificate()
	{
		certificate.click();
	}

}
