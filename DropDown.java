package org.Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement dDnCmds = driver.findElement(By.id("selenium_commands"));
		//to scroll down till selenium commands
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dDnCmds);
		
		Select s = new Select(dDnCmds);
		List<WebElement> cmd = s.getOptions();
		for(int i=0;i<cmd.size();i++) {
			if(i%2==0) {
				 s.selectByIndex(i);
				 System.out.println(s.getAllSelectedOptions());
				}
			/*WebElement dDnContinents = driver.findElement(By.id("continents"));
			Select s1 = new Select(dDnContinents);
			List<WebElement> cont = s1.getOptions();
			for(WebElement c1: cont) {
				String name = c1.getText();
				s1.selectByVisibleText(name);
				System.out.println(name);
				*/
			}
			
		}
				/*for( WebElement c :cmd) {
					String name = c.getText();
					s.selectByVisibleText(name);
					}*/
	}


