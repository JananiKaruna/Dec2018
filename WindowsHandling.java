package org.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String args[]) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Selenium-workspace\\SeleniumPractice\\SeleniumPractice\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
WebElement btnNewUser = driver.findElement(By.xpath("//a[text()='New User Activation']"));
btnNewUser.click();
//parent WindowId
String pWid=driver.getWindowHandle();
System.out.println(pWid);
//allWindowId
Set<String> allWid=driver.getWindowHandles();
System.out.println(allWid);
//find child Window from this
for (String v : allWid) {
	if (!pWid.equals(v)) {
		driver.switchTo().window(v);
		WebElement txtUsername= driver.findElement(By.xpath("//input[@id='fldUId']"));
	     txtUsername.sendKeys("456789");
	}
}
}
}
