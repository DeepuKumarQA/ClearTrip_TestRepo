package com.example;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;
//tested 
public class SourceToDestination {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testSourceToDestination() throws Exception {
    driver.get("https://www.google.com/search?q=cleartrip&rlz=1C1CHBF_enIN1047IN1047&oq=&aqs=chrome.0.35i39i362l8.7270426j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/span")).click();
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtsXxYnAfk8A7tjAgjZ9Nv665jdJ_QJ8wv-WL4YTvXSPNp9DP05f98aArl8EALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtsXxYnAfk8A7tjAgjZ9Nv665jdJ_QJ8wv-WL4YTvXSPNp9DP05f98aArl8EALw_wcB");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//input[@value='DEL - New Delhi, IN']")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div[3]/div/div/div/div[2]/ul[3]/li/div/div[2]/p")).click();
    driver.findElement(By.xpath("//input[@value='CCU - Kolkata, IN']")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div[3]/div/div/div[3]/div[2]/ul[2]/li/div/div[2]/p")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div[4]/div/div[2]/span")).click();
    driver.get("https://www.cleartrip.com/flights/results?adults=1&childs=0&infants=0&class=Economy&depart_date=26/06/2023&from=DEL&to=BOM&intl=n&origin=DEL%20-%20New%20Delhi,%20IN&destination=BOM%20-%20Mumbai,%20IN&sft=&sd=1687770351022&rnd_one=O&sourceCountry=New%20Delhi&destinationCountry=Kolkata");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₹5,891'])[1]/following::*[name()='svg'][15]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₹5,891'])[1]/following::*[name()='svg'][16]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₹5,891'])[1]/following::*[name()='svg'][3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₹5,891'])[1]/following::*[name()='svg'][3]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/main/div/div/div[2]/div[2]/div[7]/div/div[4]/label/span")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/main/div/div/div[2]/div[2]/div[9]/div/div/div/div/div[2]/div[4]/div[2]/button")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.get("https://www.cleartrip.com/flights/itinerary/NI68ada9fe2a-cf3b-4cc7-9454-230626143628/info?ancillaryEnabled=true");
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
