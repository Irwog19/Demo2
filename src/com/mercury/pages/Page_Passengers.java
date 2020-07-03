package com.mercury.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_Passengers extends Basedriver {

	public void passenger1() throws IOException, InterruptedException {
		// Name
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(@name,'passFirst0')]")).sendKeys(getdata("Passengers",1,1));
		driver.findElement(By.xpath(".//*[contains(@name,'passLast0')]")).sendKeys(getdata("Passengers",1,2));

		// Meal Type
		WebElement mealTypeP1 = driver.findElement(By.xpath(".//*[contains(@name,'pass.0.meal')]"));
		Select dd_mealtypeP1 = new Select(mealTypeP1);
		dd_mealtypeP1.selectByVisibleText(getdata("Passengers",1,3));

	}

	public void passenger2() throws IOException, InterruptedException {
		// Name
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'passFirst1')]")).sendKeys(getdata("Passengers",2,1));
		driver.findElement(By.xpath(".//*[contains(@name,'passLast1')]")).sendKeys(getdata("Passengers",2,2));

		// Meal Type
		Thread.sleep(1000);
		WebElement mealTypeP1 = driver.findElement(By.xpath(".//*[contains(@name,'pass.1.meal')]"));
		Select dd_mealtypeP1 = new Select(mealTypeP1);
		dd_mealtypeP1.selectByVisibleText(getdata("Passengers",2,3));
		
		System.out.println("Passengers(2) details furnished.");
		Reporter.log("Passengers(2) details furnished.");

	}
	
	

}
