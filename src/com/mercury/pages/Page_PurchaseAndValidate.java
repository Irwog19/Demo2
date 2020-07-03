package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_PurchaseAndValidate extends Basedriver {
	public void clickpurchase() throws InterruptedException {
		driver.findElement(By.xpath(".//*[contains(@name,'delCountry')]//following::td[@align='CENTER']//input[contains(@name,'buyFlights')]")).click();
		Thread.sleep(2000);
		
	}
	public void screenshotPurchase() throws IOException {
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//driver//purchaseConfirmation.png"));
		System.out.println("Purchase confirmation screenshot taken/saved.");
		Reporter.log("Purchase confirmation  screenshot taken/saved.");
					
	}
	public void validatepurchase() throws IOException {
		String currenturl=driver.getCurrentUrl();
		if (currenturl.equals(getdata("Credentials", 5, 3))) {
			System.out.println("Purchase has been successful.");
			Reporter.log("Purchase has been successful.");
		}
		else {
			System.out.println("Purchase has been UN-successful.");
			Reporter.log("Purchase has UN-been successful.");
		}
			System.out.println("Purchase Validation done.");
			Reporter.log("Purchase Validation done.");
			
	}
	
	public void returntoHomescreen() throws InterruptedException {
		driver.findElement(By.xpath(".//*[contains(@src,'/images/forms/home.gif')]")).click();
		Thread.sleep(1000);
		System.out.println("Returned to home screen.");
		Reporter.log("Returned to home screen.");
		
	}
	

}
