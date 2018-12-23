package org.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		WebElement txtUser=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtUser.sendKeys("123asd");
		WebElement btnContinue=driver.findElement(By.xpath("//img[@alt='continue']"));
		btnContinue.click();*/
		
		driver.get("https://www.gmail.com/");
		WebElement txtUser=driver.findElement(By.xpath("//input[@id='identifierId']"));
		txtUser.sendKeys("jananikaruna3@gmail.com");
		WebElement btnnext=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		btnnext.click();
		Thread.sleep(2000);
		WebElement txtPass=driver.findElement(By.xpath("//input[@name='password']"));
		txtPass.sendKeys("priya@nan3");
		WebElement btnext=driver.findElement(By.xpath("//content[@class='CwaK9']"));
		btnext.click();
		//content[@class='CwaK9']
		//input[@class='whsOnd zHQkBf']
		//span[@class='RveJvd snByac']
		//input[@id='identifierId']
		
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement textclick=driver.findElement(By.xpath("//input[@id='identifierId']"));
		
		
	}

}
