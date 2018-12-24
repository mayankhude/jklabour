package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ALCDownload {
	@FindBy(linkText="Download Certificate")
    private WebElement certificate;
	
	public void downloadCertificate()
	{
		certificate.click();
	}
}
