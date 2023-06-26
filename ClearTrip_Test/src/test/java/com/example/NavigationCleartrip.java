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
public class NavigationCleartrip {
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
  public void testNavigationCleartrip() throws Exception {
    driver.get("https://www.google.com/search?q=cleartrip&rlz=1C1CHBF_enIN1047IN1047&oq=&aqs=chrome.0.35i39i362l8.7359490j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/span")).click();
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NEW'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/div/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[3]/div/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[4]/div/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/button")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/span/div/div/div[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='(2 - 12 yrs)'])[1]/following::*[name()='svg'][1] | ]]
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/button")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/button")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/div/ul/li[2]/div/div/span")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Learn More'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[4]/div[3]/div/div[2]/a/div/div[2]")).click();
    driver.get("https://www.cleartrip.com/hotels/results?city=New+Delhi&state=Delhi&country=IN&area=&poi=&hotelId=&hotelName=&SearchTag=&dest_code=35485&chk_in=29/06/2023&chk_out=30/06/2023&adults1=2&children1=0&num_rooms=1");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB");
    driver.findElement(By.linkText("About Us")).click();
    driver.get("https://www.cleartrip.com/about");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB");
    driver.findElement(By.linkText("Careers")).click();
    driver.get("https://careers.cleartrip.com/#!");
    driver.get("https://careers.cleartrip.com/");
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB");
    driver.findElement(By.linkText("FAQs")).click();
    driver.get("https://www.cleartrip.com/faq/");
    driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJtW8D4kwG7eBpCgnOJP2X1St-GxhY1HVAVnL0Ih57cXhvfbLo90NSMaAlz9EALw_wcB");
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
