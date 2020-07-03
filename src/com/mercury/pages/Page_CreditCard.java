package com.mercury.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_CreditCard extends Basedriver {
	public void creditcarddetails() throws InterruptedException, IOException {
		
		//cardType
		WebElement cardtype = driver.findElement(By.xpath(".//*[contains(@name,'creditCard')]"));
		Select dd_cardtype = new Select(cardtype);
		dd_cardtype.selectByVisibleText(getdata("Creditcard",1,0));//?
		Thread.sleep(1000);
		
		//cardNumber
		driver.findElement(By.xpath(".//*[contains(@name,'creditnumber')]")).sendKeys(getdata("Creditcard",1,1));
		
		//expiryMonth
		WebElement expirymonth = driver.findElement(By.xpath(".//*[contains(@name,'cc_exp_dt_mn')]"));
		Select dd_expirymonth = new Select(expirymonth);
		dd_expirymonth.selectByVisibleText(getdata("Creditcard",1,2));
		
		//expiryYear
		WebElement expiryyear = driver.findElement(By.xpath(".//*[contains(@name,'cc_exp_dt_yr')]"));
		Select dd_expiryyear = new Select(expiryyear);
		dd_expiryyear.selectByVisibleText(getdata("Creditcard",1,3));
		Thread.sleep(1000);
		
		//cardHolderName
		driver.findElement(By.xpath(".//*[contains(@name,'cc_frst_name')]")).sendKeys(getdata("Creditcard",1,4));
		driver.findElement(By.xpath(".//*[contains(@name,'cc_mid_name')]")).sendKeys(getdata("Creditcard",1,5));
		driver.findElement(By.xpath(".//*[contains(@name,'cc_last_name')]")).sendKeys(getdata("Creditcard",1,6));
		Thread.sleep(1000);	
		System.out.println("Credit card details furnished.");
		Reporter.log("Credit card details furnished.");
	}

}
