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
public class RegistrodeusuarioCITest {
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
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registrodeusuarioCI() {
    // Test name: Registro de usuario(CI)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://webapps.alejandrogacles.tech:8080//");
    // 2 | setWindowSize | 813x728 | 
    driver.manage().window().setSize(new Dimension(813, 728));
    // 3 | click | linkText=Sign up | 
    driver.findElement(By.linkText("Sign up")).click();
    // 4 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 5 | click | css=.form-group:nth-child(1) > .invalid-feedback | 
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .invalid-feedback")).click();
    // 6 | assertText | css=.form-group:nth-child(1) > .invalid-feedback | Please enter your full name.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(1) > .invalid-feedback")).getText(), is("Please enter your full name."));
    // 7 | assertText | css=.form-group:nth-child(2) > .invalid-feedback | Please enter a valid email address.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(2) > .invalid-feedback")).getText(), is("Please enter a valid email address."));
    // 8 | assertText | css=.form-group:nth-child(3) > .invalid-feedback | Please enter a password.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(3) > .invalid-feedback")).getText(), is("Please enter a password."));
    // 9 | click | css=.form-group:nth-child(4) > .invalid-feedback | 
    driver.findElement(By.cssSelector(".form-group:nth-child(4) > .invalid-feedback")).click();
    // 10 | assertText | css=.form-group:nth-child(4) > .invalid-feedback | Your password and confirmation do not match.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(4) > .invalid-feedback")).getText(), is("Your password and confirmation do not match."));
    // 11 | type | id=full-name | paco
    driver.findElement(By.id("full-name")).sendKeys("paco");
    // 12 | type | id=email-address | user1
    driver.findElement(By.id("email-address")).sendKeys("user1");
    // 13 | assertText | css=.form-group:nth-child(2) > .invalid-feedback | Please enter a valid email address.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(2) > .invalid-feedback")).getText(), is("Please enter a valid email address."));
    // 14 | type | id=password | user123
    driver.findElement(By.id("password")).sendKeys("user123");
    // 15 | type | id=confirm-password | user123
    driver.findElement(By.id("confirm-password")).sendKeys("user123");
    // 16 | type | id=email-address | user1@ual.es
    driver.findElement(By.id("email-address")).sendKeys("user1@ual.es");
    // 17 | click | id=terms-agreement | 
    driver.findElement(By.id("terms-agreement")).click();
    // 18 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 19 | assertText | css=.text-danger | It looks like there's already an account with your email address. If you forgot your password, you can recover it here.
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    assertThat(driver.findElement(By.cssSelector(".text-danger")).getText(), is("It looks like there's already an account with your email address. If you forgot your password, you can recover it here."));
  }
}
