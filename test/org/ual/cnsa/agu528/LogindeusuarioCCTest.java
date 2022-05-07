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
import org.openqa.selenium.firefox.FirefoxOptions;
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
public class LogindeusuarioCCTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe"); 
			//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    //driver = new ChromeDriver();
		  FirefoxOptions firefoxOptions = new FirefoxOptions(); 
		    firefoxOptions.setHeadless(true); 
		    driver = new FirefoxDriver(firefoxOptions);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    //Requiere la cuenta ual1@ual.es con pass ual123 creada con anterioridad
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void logindeusuarioCC() {
    // Test name: Login de usuario(CC)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://webapps.alejandrogacles.tech:8080//");
    // 2 | setWindowSize | 813x728 | 
    driver.manage().window().setSize(new Dimension(813, 728));
    // 3 | click | linkText=Sign up | 
    // 15 | click | linkText=Log in | 
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("ual1@ual.es"); 
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("ual123");
    // 19 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 20 | click | id=header-account-menu-link | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("header-account-menu-link")).click();
    // 21 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
  }
}
