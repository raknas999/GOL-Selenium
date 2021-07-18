package com.gameoflife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*
 * TestSteps
 * 1.Launch Browser
 * 2.Enter url
 * 3.Click on NewGame button
 * 4.click on 3rd checkbox
 * 5.click on 4th checkbox
 * 6.click on Go button
 * 7.click on Next Generation button
 * 8.click on Home link
 * 9.close the browser
 */
public class TC003_NewGame2 {
@Test
public void tc001() throws Exception{
System.setProperty("webdriver.chrome.driver", "G:\\seleniumTrg_Mav_ws\\NareshIT\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://3.138.34.248:8080/gameoflife/home");
Reporter.log("Application Opened");
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[2]/a")).click();
Reporter.log("Clicked on NewGame button");
Thread.sleep(3000);
driver.findElement(By.name("cell_0_2")).click();
Reporter.log("Clicked on 3rd check box");
Thread.sleep(3000);
driver.findElement(By.name("cell_1_0")).click();
Reporter.log("Clicked on 4th check box");
Thread.sleep(3000);
driver.findElement(By.id("submit")).click();
Reporter.log("clicked on Go button");
Thread.sleep(3000);
driver.findElement(By.id("submit")).click();
Reporter.log("clicked on Next Generation button");
Thread.sleep(3000);
driver.findElement(By.linkText("home")).click();
Reporter.log("clicked on Home Link");
Thread.sleep(3000);
driver.quit();
Reporter.log("Application Closed");
}
}
