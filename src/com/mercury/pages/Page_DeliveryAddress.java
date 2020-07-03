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
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;

public class Page_DeliveryAddress extends Basedriver {

	@Test
	public void deliveryaddress() throws IOException {

		// address1&2
		driver.findElement(By.xpath(".//*[contains(@name,'delAddress1')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delAddress1')]")).sendKeys(getdata("Address", 2, 1));
		driver.findElement(By.xpath(".//*[contains(@name,'delAddress2')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delAddress2')]")).sendKeys(getdata("Address", 2, 2));

		// City
		driver.findElement(By.xpath(".//*[contains(@name,'delCity')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delCity')]")).sendKeys(getdata("Address", 2, 3));

		// State/province
		driver.findElement(By.xpath(".//*[contains(@name,'delState')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delState')]")).sendKeys(getdata("Address", 2, 4));

		// PostCode
		driver.findElement(By.xpath(".//*[contains(@name,'delZip')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delZip')]")).sendKeys(getdata("Address", 2, 5));

		// Country
		WebElement country = driver.findElement(By.xpath(".//*[contains(@name,'delCountry')]"));
		Select dd_country = new Select(country);
		dd_country.selectByVisibleText(getdata("Address", 2, 6));
		

		System.out.println("Delivery address furnised.");
		Reporter.log(("Delivery address furnised."));
	}

	public void acceptalert() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		System.out.println("Alert accepted.");
		Reporter.log(("Alert accepted."));

	}

	public void sameasbillingaddress() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				".//*[@name='billCountry']//following::tr[@bgcolor='#CCCCCC']//following::td[@align='right']//input[@value='checkbox']"))
				.click();
		Thread.sleep(2000);
		System.out.println("Same as billing address option clicked.");
		Reporter.log(("Same as billing address option clicked."));

	}

	public void screenshotbookflight() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(",//driver/bookflight.png"));
		System.out.println("Book flight screenshot taken/saved.");
		Reporter.log("Book flight screenshot taken/saved.");
	}

}
