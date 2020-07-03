package com.mercury.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_BillingAddress extends Basedriver {
	public void bilingaddress() throws IOException, InterruptedException {
		
		//address1&2
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress1')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress1')]")).sendKeys(getdata("Address",1,1));
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress2')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress2')]")).sendKeys(getdata("Address",1,2));
		
		//City
		driver.findElement(By.xpath(".//*[contains(@name,'billCity')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billCity')]")).sendKeys(getdata("Address",1,3));
		
		//State/province
		driver.findElement(By.xpath(".//*[contains(@name,'billState')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billState')]")).sendKeys(getdata("Address",1,4));
		
		//PostCode
		driver.findElement(By.xpath(".//*[contains(@name,'billZip')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billZip')]")).sendKeys(getdata("Address",1,5));
		
		//Country
		WebElement country = driver.findElement(By.xpath(".//*[contains(@name,'billCountry')]"));
		Select dd_country = new Select(country);
		dd_country.selectByVisibleText(getdata("Address",1,6));
		Thread.sleep(2000);
		
		System.out.println("Billing address furnised.");
		Reporter.log(("Billing address furnised."));
	}
	// click ticketless travel
	public void ticketlesstravel() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@name='delAddress1']//preceding::td[@align='right']//following::font[contains(text(),'Ticket')]//preceding::input[@name='ticketLess']")).click();
		
		
	}

}
