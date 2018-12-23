package org.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
	public static void main (String args[]) {
		//configure Web Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		//Launch Browser
		WebDriver driver = new ChromeDriver();
	/*	//Enter URL
		driver.get("https://www.facebook.com");
		//driver.get("https://www.google.com/");
		//driver.get("https://www.redbus.in/");
		//driver.get("https://www.snapdeal.com/login");
		//driver.get("https://netbanking.hdfcbank.com/");
		//Identify Locators of UserName
		WebElement textUserId = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println("UserId located");
		//insert
		textUserId.sendKeys("janani");
		//Find the Locators Password
		WebElement textPassword = driver.findElement(By.id("pass"));
		System.out.println("To located");
		//insert
		textPassword.sendKeys("123asd"); 
		WebElement radiobtn= driver.findElement(By.xpath("//input[@value='1']"));
        radiobtn.click();*/
		
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement btnreset= driver.findElement(By.xpath("//input[@name='imageField']"));
		btnreset.click();
		
		}

		
		
}
