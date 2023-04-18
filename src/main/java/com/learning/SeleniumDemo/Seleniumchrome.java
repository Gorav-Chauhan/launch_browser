package com.learning.SeleniumDemo;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumchrome {

	public static void main(String[] args) throws InterruptedException {
		
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\browser drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\jubl-asset-automation\\browser\\headless\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("First Tab" +driver.getTitle());

		
		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("jubilant");
		search_box.submit();
		
	
		WebElement wikipediaLink = driver.findElement(By.partialLinkText("LinkedIn"));
		wikipediaLink.sendKeys(Keys.CONTROL,Keys.ENTER);
		Thread.sleep(1000);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		System.out.println("Second Tab" +driver.getTitle());
		
		driver.quit();

	}

}
