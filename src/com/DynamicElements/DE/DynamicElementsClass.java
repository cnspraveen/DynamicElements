package com.DynamicElements.DE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DynamicElementsClass 
{
@Test
public void DynamicElements()
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://mail.google.com");
	Reporter.log("Opening Gmail in firefox", true);
        Reporter.log("Changes from github to Eclipse" +  "  " + "Gmail in Firfrox", true);	
	//Reporter.log("DynamicElements", true);
	
	
	System.setProperty("webdriver.chrome.driver", "D:/PraveenBackUp/EclipseAdvanceSeleniumPractiseClass/Jarfiles/chromedriver.exe");
    WebDriver driver2 = new ChromeDriver();
    driver2.navigate().to("https://github.com/");
    Reporter.log("Opening Github in Chrome", true);
    Reporter.log("Changes from github to Eclipse" +  "  " + "Github in Chrome", true);
    driver.close();
    driver2.close();
}
}
