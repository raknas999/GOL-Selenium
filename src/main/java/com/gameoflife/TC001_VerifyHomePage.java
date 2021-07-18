package com.gameoflife;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*
 * TestSteps
 * 1.Launch Browser
 * 2.Enter url
 * 3.Verify Title of the HomePage
 * 4.close Browser
 */
public class TC001_VerifyHomePage {
@Test
public void tc001() throws Exception{
System.setProperty("webdriver.chrome.driver", "G:\\seleniumTrg_Mav_ws\\NareshIT\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://3.138.34.248:8080/gameoflife/home");
Reporter.log("Application Opened");
Thread.sleep(3000);
//Verify Title of the HomePage
if(driver.getTitle().equals("The Game Of Life")) {
	Reporter.log("Title matched");
}
else {
	Reporter.log("Title Not Matched");
}
driver.quit();
Reporter.log("Application Closed");
}
}
