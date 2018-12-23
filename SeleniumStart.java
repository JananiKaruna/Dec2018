package org.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart {

	public static void main(String args[]) {
		//Configure Webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		//Enter URL
		driver.get("https://www.seleniumhq.org");
		
		//Title of browser
		String title= driver.getTitle();
		System.out.println(title);
		
		//Entered url
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//closing the browser
		driver.quit();
	
	}
}
