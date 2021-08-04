package com.wss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Selenium {
	
	
	public void login() 
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:9090/wss/login");
			WebElement username=driver.findElement(By.name("username"));
			WebElement password=driver.findElement(By.name("password"));
			username.sendKeys("abc@gmail.com");
			password.sendKeys("viresh@12345");
			driver.findElement(By.cssSelector(".btn-primary")).click();
			String actualUrl="http://localhost:9090/wss/wss";
			String expectedUrl= driver.getCurrentUrl();
			if(actualUrl.equalsIgnoreCase(expectedUrl))
	        {
	            System.out.println("Test passed");
	        }
	        else
	        {
	            System.out.println("Test failed");
	        }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium myobj = new Selenium();
		myobj.login();
	}

}
