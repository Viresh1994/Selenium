package com.wss;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {
	
	@Test
	public void button() 
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:9090/wss/login");
			driver.findElement(By.cssSelector(".login-logo")).click();
			String actualUrl="http://localhost:9090/wss/home";
			String expectedUrl= driver.getCurrentUrl();
			if(actualUrl.equalsIgnoreCase(expectedUrl))
	        {
	            System.out.println("Test passed");
	        }
	        else
	        {
	            System.out.println("Test failed");
	        }
	 driver.close();
	}
}

