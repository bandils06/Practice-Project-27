package com.simplilearn;

import org.testng.annotations.Test;
//	import org.testng.annotations.AfterClass;
//	import org.testng.annotations.Test;
//	import org.testng.AssertJUnit;
//	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;
//	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.By.ByXPath;
////import org.openqa.selenium.JavascriptExecutor;
//	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.support.ui.FluentWait;
//	import org.openqa.selenium.support.ui.Wait;
//	import org.testng.annotations.AfterClass;
//	import org.testng.annotations.AfterMethod;

	public class driver_your_way_test {

		// Step 1: Initialize the webdriver
		WebDriver driver = null;
		SoftAssert soft = new SoftAssert();

		@Test
		public void initialization_T0() {
			// Step 2: Declare a path and set property for google chrome driver
			String path = "C:\\Users\\Prateek\\Phase 5 Workspace\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
			
		}

		@Test(groups = "Chrome", dependsOnMethods = { "initialization_T0" })
		public void cross_T1() {
			System.out.println("Testcases Starting...");
			System.out.println();

			// starting chrome
			driver.get("http://localhost:4200/login");

			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement email=driver.findElement(By.xpath("/html/body/app-root/html/body/div/app-login/html/body/div/div/form/div/input[1]"));
			email.sendKeys("admin@gmail.com");
			WebElement password=driver.findElement(By.xpath("/html/body/app-root/html/body/div/app-login/html/body/div/div/form/div/input[2]"));
			password.sendKeys("admin@123");
			WebElement admin=driver.findElement(By.id("admin1"));	
			admin.click();
			WebElement signIn=driver.findElement(By.id("signIn12"));
			signIn.submit();
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		@Test(groups = "Chrome", dependsOnMethods = {"cross_T1"})
		public void cross_T2() {
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Clicking Search Button
			
			WebElement addproduct11=driver.findElement(By.xpath("//*[@id=\"add1\"]"));
			addproduct11.click();
			WebElement pname=driver.findElement(By.id("pname11"));
			pname.sendKeys("I10");
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement price=driver.findElement(By.id("price11"));
			price.sendKeys("500000");
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement url=driver.findElement(By.id("url11"));
			url.sendKeys("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Hyundai_i10_1.0_Intro_%28III%29_%E2%80%93_f_03012021.jpg/640px-Hyundai_i10_1.0_Intro_%28III%29_%E2%80%93_f_03012021.jpg");
			WebElement store=driver.findElement(By.id("submit11"));
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			store.submit();
					
		}

}
