package com.mercury.basedriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basedriver {
	public static WebDriver driver = null;

	@BeforeTest	
	public void basedriverAndLaunchURL() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println("Browser opened.");
		Reporter.log("Browser opened.");

		driver.get(getdata("Credentials",1,3));
		System.out.println("Travel site opened.");
		Reporter.log("Travel site  opened.");
		
		String expected = driver.findElement(By.xpath(".//*[text()='REGISTER']")).getText();
		Assert.assertEquals("REGISTER", expected);
		System.out.println("Login page validation success on 'Register' text.");
	}
	
	//.//*[text()='REGISTER']
	

	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Browser closed.");
		Reporter.log("Browser closed.");
	}

	
	public static String getdata(String testcasename, int rownumber, int cellnumber) throws IOException {
		File path = new File(".//driver//Mercury_ExcelData.xlsx");
		FileInputStream src = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(src);
		XSSFSheet ws = wb.getSheet(testcasename);

		String data = ws.getRow(rownumber).getCell(cellnumber).getStringCellValue();
		return data;

	}

}
