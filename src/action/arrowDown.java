package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshot.screenShot;

public class arrowDown {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.co.in/");
	     driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Selenium");
	     Thread.sleep(3000);
	     Actions act1 =  new Actions(driver);
	     act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	     act1.sendKeys(Keys.ENTER).build().perform();
	     screenShot.captureScreenShot(driver,"ARROW");
}}
