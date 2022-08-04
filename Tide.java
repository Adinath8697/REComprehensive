package com.mindtree.tide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tide {

	public static void main(String[] args) throws InterruptedException {
		
		//declaration and instantiation of object
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch Website
		driver.get("https://tide.com/en-us");
		
		//Print Title of Website
		System.out.println(driver.getTitle());
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Thread.sleep(4000);
		
		//to wait for click on close button
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(@class,'lilo3746-close-icon')]")));
		
		driver.findElement(By.xpath("//a[contains(@class,'lilo3746-close-icon')]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='/en-us/how-to-wash-clothes']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		
		driver.findElement(By.linkText("How to Remove Stains")).click();
		
		
		
		//driver.findElement(By.xpath("//*[@class='custom_class']")).click();
		
		//driver.findElement(By.linkText("Contact Us")).click();
		
		
		//driver.findElement(By.xpath("//a[@class='articleLink'][1]")).click();
		//driver.findElement(By.xpath("//a[@href='/en-us/live-chat']")).click();
		//driver.navigate().back();
		
		//driver.findElement(By.linkText("Register")).click();
		
		
		//driver.findElement(By.linkText("Sign up now")).click();
		//String vaibhav = "ass";
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Adinath");
		//driver.findElement(By.xpath("//*[@id='name']")).sendKeysens("ad");
	
		//driver.findElement(By.xpath("//button[contains(@class,'underline text-primaryCta ')]")).click();
		//driver.navigate().back();
	}

}
