package com.example;   //tested 

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class HomePageTest {
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
  public void testHomePage() throws Exception {
    driver.get("https://www.google.com/search?q=cleartrip&rlz=1C1CHBF_enIN1047IN1047&oq=&aqs=chrome.0.35i39i362l8.7184849j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/span")).click();
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJsZNbBTM0auJ8Y7j1H83NP_m3_-xlwbgXXodiqW33GQ1SPesGyy8qQaAgbGEALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJsZNbBTM0auJ8Y7j1H83NP_m3_-xlwbgXXodiqW33GQ1SPesGyy8qQaAgbGEALw_wcB");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Holiday Packages'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div[2]/ul/li[2]/a/div")).click();
    driver.get("https://www.cleartrip.com/hotels");
    driver.findElement(By.xpath("//div[@id='root']/div/div/main/div/div/div/div[2]/ul/li[3]/a/div")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//div[@id='root']/div/div/main/div/div/div/div[2]/ul")).click();
    driver.get("https://www.cleartrip.com/offers/india");
    driver.get("https://www.cleartrip.com/hotels");
    driver.findElement(By.xpath("//div[@id='root']/div/div/main/div/div/div/div[2]/ul/li[4]/a/div")).click();
    driver.get("https://www.cleartrip.com/offers/india");
    driver.get("https://www.cleartrip.com/support");
    driver.get("https://www.cleartrip.com/offers/india");
    driver.get("https://www.cleartrip.com/hotels");
    driver.findElement(By.xpath("//div[@id='root']/div/div/main/div/div/div/div[2]/ul/li[5]/a/div")).click();
    driver.get("https://business.cleartrip.com/");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.get("https://www.cleartrip.com/hotels");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("Support")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.close();
    driver.get("https://www.cleartrip.com/support");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
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
