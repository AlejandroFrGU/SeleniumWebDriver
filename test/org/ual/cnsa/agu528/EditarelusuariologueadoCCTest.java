package org.ual.cnsa.agu528;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EditarelusuariologueadoCCTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void editarelusuariologueadoCC() {
    // Test name: Editar el usuario logueado(CC)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://webapps.alejandrogacles.tech:8080//");
    // 2 | setWindowSize | 697x728 | 
    driver.manage().window().setSize(new Dimension(697, 728));
    // 3 | click | linkText=Log in | 
    driver.findElement(By.linkText("Log in")).click();
    // 4 | click | css=.form-group:nth-child(1) > .form-control | 
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    // 5 | type | css=.form-group:nth-child(1) > .form-control | user1@ual.es
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("user1@ual.es");
    // 6 | type | css=.form-group:nth-child(2) > .form-control | user123
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("user123");
    // 7 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 8 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 9 | click | linkText=Settings | 
    driver.findElement(By.linkText("Settings")).click();
    // 10 | click | linkText=Edit profile | 
    driver.findElement(By.linkText("Edit profile")).click();
    // 11 | type | id=full-name | user1234
    driver.findElement(By.id("full-name")).sendKeys("user1234");
    // 12 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 13 | click | linkText=Edit profile | 
    driver.findElement(By.linkText("Edit profile")).click();
    // 14 | click | id=email-address | 
    driver.findElement(By.id("email-address")).click();
    // 15 | type | id=email-address | user12@ual.es
    driver.findElement(By.id("email-address")).sendKeys("user12@ual.es");
    // 16 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 17 | click | linkText=Change password | 
    driver.findElement(By.linkText("Change password")).click();
    // 18 | type | id=password | user1234
    driver.findElement(By.id("password")).sendKeys("user1234");
    // 19 | type | id=confirm-password | user1234
    driver.findElement(By.id("confirm-password")).sendKeys("user1234");
    // 20 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 21 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 22 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
    // 23 | type | css=.form-group:nth-child(1) > .form-control | user12@ual.es
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("user12@ual.es");
    // 24 | type | css=.form-group:nth-child(2) > .form-control | user1234
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("user1234");
    // 25 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 26 | mouseOver | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.cssSelector(".ajax-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 27 | mouseOut | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 28 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 29 | click | linkText=Settings | 
    driver.findElement(By.linkText("Settings")).click();
    // 30 | click | linkText=Edit profile | 
    driver.findElement(By.linkText("Edit profile")).click();
    // 31 | click | id=email-address | 
    driver.findElement(By.id("email-address")).click();
    // 32 | type | id=email-address | user1@ual.es
    driver.findElement(By.id("email-address")).sendKeys("user1@ual.es");
    // 33 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 34 | click | linkText=Change password | 
    driver.findElement(By.linkText("Change password")).click();
    // 35 | type | id=password | user123
    driver.findElement(By.id("password")).sendKeys("user123");
    // 36 | type | id=confirm-password | user123
    driver.findElement(By.id("confirm-password")).sendKeys("user123");
    // 37 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 38 | mouseOver | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.cssSelector(".ajax-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 39 | mouseOut | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 40 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 41 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
  }
}
