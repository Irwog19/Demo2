package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_ContinueToReservation extends Basedriver {

	public void continuefindflights() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@name='findFlights']")).click();		                             
		System.out.println("Continue button clicked to find flights.");
		Reporter.log("Continue button clicked to find flights.");
	}
	
	//validation

	public void screenshotreservation() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//driver//reservation.png"));
		System.out.println("Continue to flights image taken/saved.");
		Reporter.log("Continue to flights snapshot taken/saved.");
	}

	public void Continuereserveflights() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'reserveFlights')]")).click();
		System.out.println("Continue to reservation image taken/saved.");
		Reporter.log("Continue to reservation snapshot taken/saved.");
	}
	
	//validation
	

}
