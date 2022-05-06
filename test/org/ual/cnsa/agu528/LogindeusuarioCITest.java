// Generated by Selenium IDE
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
public class LogindeusuarioCITest {
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
  public void logindeusuarioCI() {
    // Test name: Login de usuario(CI)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://webapps.alejandrogacles.tech:8080//");
    // 2 | setWindowSize | 813x728 | 
    driver.manage().window().setSize(new Dimension(813, 728));
    // 3 | click | linkText=Log in | 
    driver.findElement(By.linkText("Log in")).click();
    // 4 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 5 | click | css=.form-group:nth-child(1) > .invalid-feedback | 
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .invalid-feedback")).click();
    // 6 | assertText | css=.form-group:nth-child(1) > .invalid-feedback | Please provide a valid email address.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(1) > .invalid-feedback")).getText(), is("Please provide a valid email address."));
    // 7 | click | css=.form-group:nth-child(2) > .invalid-feedback | 
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .invalid-feedback")).click();
    // 8 | assertText | css=.form-group:nth-child(2) > .invalid-feedback | Please enter your password.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(2) > .invalid-feedback")).getText(), is("Please enter your password."));
    // 9 | click | css=.form-group:nth-child(1) > .form-control | 
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    // 10 | type | css=.form-group:nth-child(1) > .form-control | user1@ual.es
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("user1@ual.es");
    // 11 | type | css=.form-group:nth-child(2) > .form-control | aweawe
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("aweawe");
    // 12 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 13 | mouseOver | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.cssSelector(".ajax-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 14 | mouseOut | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 15 | click | css=.text-danger | 
    driver.findElement(By.cssSelector(".text-danger")).click();
    // 16 | assertText | css=.text-danger | The credentials you entered are not associated with an account. Please check your email and/or password and try again.
    assertThat(driver.findElement(By.cssSelector(".text-danger")).getText(), is("The credentials you entered are not associated with an account. Please check your email and/or password and try again."));
  }
}
