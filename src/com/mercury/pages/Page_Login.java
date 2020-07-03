package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_Login extends Basedriver {
	
	
	public void login() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@name='userName']")).sendKeys(getdata("Credentials",1,0));
		
		String actualusername= driver.findElement(By.xpath(".//*[@name='userName']")).getAttribute("value");
		Assert.assertEquals("gowrikoyada@gmail.com", actualusername);
																
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys(getdata("Credentials",1,1));
		
		String actualpassword = driver.findElement(By.xpath(".//*[@name='password']")).getAttribute("value");
		Assert.assertEquals("test123", actualpassword);
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'login')]")).click();
		System.out.println("User successfully logged in.");
		Reporter.log("User successfully logged in.");
		
	}
	
	public void screenshotLogin() throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File( ".//driver//login.png")); 
		System.out.println("Signin Snapshot taken/saved.");
		Reporter.log("Signin Screenshot taken.");
		

}
}
