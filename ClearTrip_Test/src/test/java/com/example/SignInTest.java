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
public class SignInTest {
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
  public void testSignIn() throws Exception {
    driver.get("https://www.google.com/search?q=cleartrip&rlz=1C1CHBF_enIN1047IN1047&oq=&aqs=chrome.0.35i39i362l8.7093856j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/span")).click();
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB");
    driver.findElement(By.xpath("//input[@value='']")).click();
    driver.findElement(By.xpath("//input[@value='9849082149']")).clear();
    driver.findElement(By.xpath("//input[@value='9849082149']")).sendKeys("9849082149");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//input[@value='']")).click();
    driver.findElement(By.xpath("//input[@value='9218398213']")).clear();
    driver.findElement(By.xpath("//input[@value='9218398213']")).sendKeys("9218398213");
    driver.findElement(By.xpath("//input[@value='']")).clear();
    driver.findElement(By.xpath("//input[@value='']")).sendKeys("0");
    driver.findElement(By.xpath("//input[@value='']")).clear();
    driver.findElement(By.xpath("//input[@value='']")).sendKeys("9");
    driver.findElement(By.xpath("//input[@value='']")).clear();
    driver.findElement(By.xpath("//input[@value='']")).sendKeys("1");
    driver.findElement(By.xpath("//input[@value='2']")).clear();
    driver.findElement(By.xpath("//input[@value='2']")).sendKeys("2");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::button[6]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='&'])[1]/following::span[2]")).click();
    driver.get("https://www.cleartrip.com/terms-of-service/");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('By continuing, you agree to Cleartrip', \"'\", 's')])[1]/following::span[1]")).click();
    driver.get("https://www.cleartrip.com/terms-of-service/");
    driver.get("https://www.cleartrip.com/privacy-policy/");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.get("https://www.cleartrip.com/terms-of-service/");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://www.cleartrip.com/privacy-policy/");
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::*[name()='svg'][1]")).click();
    driver.get("https://www.cleartrip.com/privacy-policy/");
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtZcoy1vvQaM4pMeLicxJL4hd4LdMtSPfOO2IPSMmZoTM8Dl68dP2kaArTrEALw_wcB");
    driver.findElement(By.xpath("//div[@id='root']/div/div/header/div/div/div/div/div/div[2]/div/button")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::*[name()='svg'][1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow |  | ]]
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
