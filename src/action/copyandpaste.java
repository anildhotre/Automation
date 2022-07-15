package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshot.screenShot;

public class copyandpaste {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/signup");
	 	
	 	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Velocity");
	 	
	 	Actions act = new Actions(driver);

	 	//performing control + a operations	
	 	 act.keyDown(Keys.CONTROL)
	 		.sendKeys("a")
	 		.keyUp(Keys.CONTROL)
	 		.build().perform();
	 	
	 	//performing control + c operations	
	 	
	 	 
	 	 act.keyDown(Keys.CONTROL)
	 	 	.sendKeys("c")
	 	 	.keyUp(Keys.CONTROL)
	 	 	.build().perform();
	 	 
//	 	 performing control + v operations
	 	 
	 	 act.sendKeys(Keys.TAB)
	 	 	.keyDown(Keys.CONTROL)
	 	 	.sendKeys("v")
	 	 	.keyUp(Keys.CONTROL)
	 	 	.build().perform();
	 	screenShot.captureScreenShot(driver,"COPY[ASTE");
}}
