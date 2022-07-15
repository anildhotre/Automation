package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshot.screenShot;

public class keywordAction {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/reg/");
	     //contains
	     WebElement firstname= driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]"));
	     Actions act = new Actions(driver);
			
			act.sendKeys(firstname, "Velocity").sendKeys(Keys.TAB).sendKeys("Corporate").build().perform();
			act.sendKeys(Keys.TAB).sendKeys("9876543210").sendKeys(Keys.TAB).sendKeys("abc123").build().perform();
			screenShot.captureScreenShot(driver,"vivara");
	}

	
	}

