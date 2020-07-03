package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_FlightDetails extends Basedriver{
	
	public void type() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@value,'oneway')]")).click();//click one way and chose round trip again
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@value,'roundtrip')]")).click();//round trip
		
	}	
	public void noofpassengers() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement passengers = driver.findElement(By.xpath(".//*[contains(@name,'passCount')]"));
		Select dd_passengers = new Select(passengers);
		//dd_passengers.selectByValue(getdata("FlightDetails",1,1));
		dd_passengers.selectByValue(getdata("Flight",1,1));
		
				
	}
	public void departfrom() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement departfrom =driver.findElement(By.xpath(".//*[contains(@name,'fromPort')]"));
		Select dd_departfrom = new Select(departfrom);
		dd_departfrom.selectByValue(getdata("Flight",1,2));
		
		String expecteddepartfrom = driver.findElement(By.xpath(".//*[contains(@name,'fromPort')]")).getCssValue("value");
		Assert.assertEquals("LOndon", expecteddepartfrom);
	}
	public void departmonth() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement departmonth = driver.findElement(By.xpath(".//*[contains(@name,'fromMonth')]"));
		Select dd_departmonth = new Select(departmonth);
		dd_departmonth.selectByValue(getdata("Flight",1,3));
	}
	public void departday() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement departday = driver.findElement(By.xpath(".//*[contains(@name,'fromDay')]"));
		Select dd_departday = new Select(departday);
		dd_departday.selectByValue(getdata("Flight",1,4));
	}
	public void arrivein() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement arrivein = driver.findElement(By.xpath(".//*[contains(@name,'toPort')]"));
		Select dd_arrivein = new Select(arrivein);
		dd_arrivein.selectByValue(getdata("Flight",1,5));
		
	}
	public void returnmonth() throws IOException, InterruptedException {
		Thread.sleep(1000);
		WebElement returnmonth = driver.findElement(By.xpath(".//*[contains(@name,'toMonth')]"));
		Select dd_returnmonth = new Select(returnmonth);
		dd_returnmonth.selectByValue(getdata("Flight",1,6));
	}
	public void returnday() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement returnday = driver.findElement(By.xpath(".//*[contains(@name,'toDay')]"));
		Select dd_returnday = new Select(returnday);
		dd_returnday.selectByValue(getdata("Flight",1,7));
		System.out.println("Flight details provided.");
		Reporter.log("Flight details provided.");
	}
	public void screenshotFlight() throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//driver//flight.png"));
		System.out.println("Flight details Snapshot taken and saved.");
		Reporter.log("Flight details Screenshot taken.");
	}
	


}