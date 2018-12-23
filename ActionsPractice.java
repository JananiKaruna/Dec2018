package org.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	/*	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtemail = driver.findElement(By.id("email"));
	Actions acc = new Actions(driver);
	acc.keyDown(txtemail,Keys.SHIFT).sendKeys(txtemail,"hello").keyUp(txtemail,Keys.SHIFT).perform();
	acc.doubleClick(txtemail).perform(); //double click
	acc.contextClick(txtemail).perform(); // right click
	//to press down arrow 
	Robot r1= new Robot();
	for(int i=1;i<=2;i++){
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	}
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	
	//finding Password Locator
	WebElement txtPass = driver.findElement(By.id("pass"));
	acc.contextClick(txtPass).perform();
	for(int i=1;i<=2;i++){
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		}
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	
	//acc.keyDown(txtPass,Keys.DOWN).keyUp(txtPass,Keys.UP).keyDown(txtPass,Keys.DOWN).keyUp(txtPass,Keys.UP).keyDown(txtPass,Keys.ENTER).keyUp(txtPass,Keys.ENTER).perform();
	
	//txtemail.sendKeys("hello");
*/	
		
		/*//Q2:
		driver.get("https://www.google.co.in/webhp");
		WebElement ggapps =driver.findElement(By.xpath("//a[@title=\"Google apps\"]"));
		ggapps.click();
		WebElement gmail =driver.findElement(By.xpath("(//span[@class='gb_W'])[7]"));
		Thread.sleep(2000);
		gmail.click();
	
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement btn =driver.findElement(By.xpath("//button[@class=\"close\"]"));
		btn.click();
		/*Actions acc2 = new Actions(driver);
		WebElement obj1 =driver.findElement(By.xpath("//div[@id=\"wrapper\"]"));
		acc2.doubleClick(obj1).perform();
		acc2.contextClick(obj1).perform();
		WebElement obj1 =driver.findElement(By.xpath("//a[(text()=\"Download Links click here\")]"));
		obj1.click();
		/*Robot r2 = new Robot();
		for(int i=0;i<3;i++) {
			r2.keyPress(KeyEvent.VK_DOWN);
			r2.keyRelease(KeyEvent.VK_DOWN);
		}
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		}*/
		
		driver.get("https://www.amazon.in/");

	Actions acc3 = new Actions(driver);
	WebElement btn =driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		acc3.moveToElement(btn).perform();
		btn.click();
		WebElement mail =driver.findElement(By.id("ap_email"));
		mail.sendKeys("jananikaruna3@gmail.com");
		acc3.doubleClick(mail);
		Thread.sleep(200);
		acc3.contextClick(mail);
		Robot r = new Robot();
		for(int i=1;i<=8;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		/*for(int i=1;i<=8;i++) {
		acc3.keyDown(mail,Keys.DOWN);
		acc3.keyUp(mail, Keys.DOWN);
		}
		acc3.keyDown(mail,Keys.ENTER);
		acc3.keyUp(mail,Keys.ENTER);*/

	WebElement continuebtn =driver.findElement(By.id("continue"));
	continuebtn.click();
        
		WebElement pass =driver.findElement(By.id("ap_password"));
		Thread.sleep(1000);
		acc3.contextClick(pass);
		
			acc3.keyDown(pass,Keys.DOWN).keyUp(pass, Keys.DOWN).perform();
			acc3.keyDown(pass,Keys.DOWN).keyUp(pass, Keys.DOWN).perform();
			acc3.keyDown(pass,Keys.ENTER).keyUp(pass, Keys.ENTER).perform();

			WebElement loginbtn =driver.findElement(By.id("signInSubmit"));
			loginbtn.click();
			}
  }


