package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshot.screenShot;

public class keywordEnter {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.co.in/");
			
			driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Selenium");
			
			
			Actions act = new Actions(driver);
			
			
			act.sendKeys(Keys.ENTER).perform();
			
			screenShot.captureScreenShot(driver,"umesh");
			
		}

}
