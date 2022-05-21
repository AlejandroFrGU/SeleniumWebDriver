package org.ual.cnsa.agu528;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditarpasswordCITest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// driver = new ChromeDriver();
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		// firefoxOptions.addArguments("--headless");
		firefoxOptions.addArguments("--width=426");
		firefoxOptions.addArguments("--height=728");

		// firefoxOptions.addArguments("window-size=1440,900");
		// driver.manage().window().setSize(new Dimension(1080, 824));
		driver = new FirefoxDriver(firefoxOptions);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void editarpasswordCI() {
		driver.get("http://webapps.alejandrogacles.tech:8080//");
		// 2 | setWindowSize | 697x728 |
		driver.manage().window().setSize(new Dimension(462, 728));
		// 3 | click | linkText=Log in |
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control |
		// driver.findElement(By.cssSelector(".form-group:nth-child(1) >
		// .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control | user1@ual.es
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("ual2@ual.es");
		// 6 | type | css=.form-group:nth-child(2) > .form-control | user123
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("ual123");
		// 7 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account Settings")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 9 | click | linkText=Settings |
		driver.findElement(By.linkText("Account Settings")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Change password")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Change password")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 18 | type | id=password | user1234
		driver.findElement(By.id("password")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(By.id("password")).sendKeys(Keys.chord(Keys.DELETE));
		driver.findElement(By.id("password")).sendKeys("");
		// 19 | type | id=confirm-password | user1234
		driver.findElement(By.id("confirm-password")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(By.id("confirm-password")).sendKeys(Keys.chord(Keys.DELETE));
		driver.findElement(By.id("confirm-password")).sendKeys("");
		// 20 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
		// 28 | assertText | css=.col-sm-6:nth-child(1) .invalid-feedback | Please enter
		// a password or choose "Cancel".
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions
					.elementToBeClickable(By.cssSelector(".col-sm-6:nth-child(1) .invalid-feedback")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertThat(driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) .invalid-feedback")).getText(),
				is("Please enter a password or choose \"Cancel\"."));
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions
					.elementToBeClickable(By.cssSelector(".col-sm-6:nth-child(2) .invalid-feedback")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 30 | assertText | css=.col-sm-6:nth-child(2) .invalid-feedback | Your new
		// password and confirmation do not match.
		assertThat(driver.findElement(By.cssSelector(".col-sm-6:nth-child(2) .invalid-feedback")).getText(),
				is("Your new password and confirmation do not match."));
		// 31 | click | linkText=Cancel |
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 22 | click | linkText=Sign out |
		driver.findElement(By.linkText("Sign out")).click();
	}
}
