package org.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsTextPractice {

	public static void main(String args[]) throws InterruptedException {
		//Configure WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		//Enter URL
		driver.get("http://www.greenstechnologys.com/oracle-training.html");
		/*WebElement txtGreens=driver.findElement(By.xpath("//h2[text()=\"Greens Technologys Overall Reviews\"]"));
		System.out.println("word loacted ");
	    System.out.print(txtGreens.getText())*/;
	    
	    Thread.sleep(3000);
	  /*  WebElement closebtn=driver.findElement(By.xpath("//button[@type='button']"));
	    closebtn.click();
	    WebElement para3 = driver.findElement(By.xpath("//strong[text()=\"Selenium with Appium course syllabus\"]"));
	    System.out.println(para3.getText());*/
	    WebElement para1 = driver.findElement(By.xpath("//p[contains(text(),'Awarded')]"));
	    System.out.println(para1.getText());
	
	}
}
