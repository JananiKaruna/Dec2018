package org.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.gettyimages.in/");
		WebElement ckCreativeImages = driver.findElement(By.xpath("//div[@class='landing-search-media-filter__selected-label media-filter-label']"));
		ckCreativeImages.click();
		WebElement ckVideo = driver.findElement(By.xpath("//label[text()='Video']"));
		ckVideo.click();
		*/
		/*Select s = new Select(ckCreativeImages);
		s.selectByVisibleText("Video");*/
		
		//Demoqa - Register Form
		driver.get("http://demo.automationtesting.in/Register.html");
		/*WebElement txtFirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtFirstName.sendKeys("Janani");
		WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtLastName.sendKeys("K");
		//WebElement txtAddress = driver.findElement (By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		//txtAddress.sendKeys("Chennai");
		WebElement txtEmail = driver.findElement (By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("jk@gmail.com");
		WebElement txtPhone = driver.findElement (By.xpath("//input[@type='tel']"));
		txtPhone.sendKeys("123456789");
		WebElement btnGender = driver.findElement (By.xpath("//input[@value='FeMale']"));
		btnGender.click();
		WebElement btn1Hobbies = driver.findElement (By.id("checkbox1"));
		btn1Hobbies.click();
		WebElement btn2Hobbies = driver.findElement (By.id("checkbox2"));
		btn2Hobbies.click();*/                                  
		//Drop Down 
		/*WebElement dDnCountry= driver.findElement(By.xpath("(//select[@type='text'])[2]"));
		Select s1 = new Select(dDnCountry);
		List<WebElement> country = s1.getOptions();
		for(WebElement c : country) {
			String name = c.getText();
			s1.selectByVisibleText(c.getText());
			System.out.println(name);
		}
		s1.selectByValue("Albania");
		WebElement dDnMonth= driver.findElement(By.xpath("(//select[@type='text'])[4]"));
	//	dDnLang.click();
		Select s = new Select(dDnMonth);
		//s.selectByVisibleText("June");
		List<WebElement> reg = s.getOptions();
		for(WebElement w : reg) {
			String name=w.getText();
			s.selectByVisibleText(name);
			System.out.println(name);
		}
		*/
		
		// To check Lang allows to select multiple values
		WebElement dDnlang= driver.findElement(By.id("msdd"));
		Select s2 = new Select(dDnlang);
		boolean b = s2.isMultiple();
		System.out.println(b);
		
	}

}
