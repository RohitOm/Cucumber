package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver launchBrowser() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Omkar\\eclipse-workspace\\org.learn.cucu\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		return driver;
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void fill(WebElement e, String a) {

	 e.sendKeys(a);
	
}
	
	
}