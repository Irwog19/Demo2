package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_Preferences extends Basedriver {

	public void serviceclass() throws InterruptedException, IOException {// can i get the data here from excel
		Thread.sleep(1000);
		//String xpathValue= getdata("Preferences",1,0);		
		driver.findElement(By.xpath(".//*[contains(@value,'First')]")).click();
		System.out.println("Service class: First class seleceted.");
		Reporter.log("Service class: First class seleceted.");
	}

	public void airlines() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement airline = driver.findElement(By.xpath(".//*[contains(@name,'airline')]"));
		Select dd_airline = new Select(airline);
		dd_airline.selectByVisibleText(getdata("Preferences", 1, 1));
		System.out.println("Airlines: 'Unified' seleceted.");
		Reporter.log("Airlines: 'Unified' seleceted.");
	}

	public void screenshotPreference() throws InterruptedException, IOException {
		Thread.sleep(1000);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//driver//FlightNPreference.png"));
		System.out.println("Preferences Snapshot taken and saved.");
		Reporter.log("Preferences Screenshot taken.");

	}

}
