package org.Practice;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConatainsPractice {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.snapdeal.com/");
		Thread.sleep(4000);
		WebElement simpleCk=driver.findElement(By.xpath("//h2[@class=\"widgetLabelHead\"])[1]"));
		simpleCk.click();
		//WebElement item= driver.findElement(By.xpath("//div[contains(text(),'Bentag ')]"));
		WebElement item1= driver.findElement(By.xpath("//div[@class=\"product_name\"]"));
		 // //div[@class="product_name"]
		item1.click();
		
		WebElement addcartbtn = driver.findElement(By.xpath("//span[@class=\"intialtext\"]"));
		addcartbtn.click();*/
		/*
		//Creating Google Acc
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Janani");
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("Karuna");
		Thread.sleep(20000);
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("apple@gmail.com");
		WebElement Usercurrentmail=driver.findElement(By.xpath("//button[@type=\"button\"]"));
		Usercurrentmail.click();
		Thread.sleep(3000);
		WebElement pass1 = driver.findElement(By.name("Passwd"));
		
		pass1.sendKeys("1232a");
		Thread.sleep(4000);
		//WebElement pass2 = driver.findElement(By.name("ConfirmPasswd"));
		WebElement pass2 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass2.sendKeys("12328878a");
		System.out.println(firstname.getAttribute("value"));
		System.out.println(LastName.getAttribute("value"));
		System.out.println(pass1.getAttribute("value"));*/
		
		//flipkart
		driver.get("https://www.flipkart.com/");
		WebElement popupclose = driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]"));
		popupclose.click();
		/*WebElement electronic = driver.findElement(By.xpath("//span[@class=\"_1QZ6fC _3Lgyp8\"]"));
		System.out.println(electronic.getText());*/
		WebElement tvapp = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions acc1= new Actions(driver);
		acc1.moveToElement(tvapp).perform();
		Thread.sleep(2000);
		WebElement tv = driver.findElement(By.xpath("//a[@title=\"Television\"]"));
		tv.click();
		System.out.println(tvapp.getText());
		
		
		/*driver.get("");
		WebElement textGmail= driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions acc1 = new Actions(driver);
		acc1.contextClick(textGmail).perform();
		
		Robot r = new Robot();
		for (int i=0;i<=3;i++) {
	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
	}

}
