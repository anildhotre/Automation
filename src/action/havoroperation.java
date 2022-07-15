package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshot.screenShot;

public class havoroperation {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	    
	     Actions act2 = new Actions(driver);
	     WebElement hoverelement = driver.findElement(By.xpath("//*[@id='sub-menu']"));
	     
	     act2.moveToElement(hoverelement).perform();
			
			WebElement googlelink = driver.findElement(By.xpath("//*[@id='link3']"));
			
			googlelink.click();
			screenShot.captureScreenShot(driver,"HAVOR");
}}
