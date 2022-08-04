package com.mindtree.tide;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tide.com/en-us");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(@class,'lilo3746-close-icon')]")));
		
		driver.findElement(By.xpath("//a[contains(@class,'lilo3746-close-icon')]")).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		
		driver.findElement(By.linkText("Sign up now")).click();
		
		Set<String>nos=driver.getWindowHandles();
		Iterator<String> ex=nos.iterator();
		String pno=ex.next();
		String cno=ex.next();
		driver.switchTo().window(cno);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Adinath");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adikhule8697@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("MH22@ab1234");
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		
		

	}

}
