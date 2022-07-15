package handledropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.screenShot;

public class handlebootstrap {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://zoom.us/signup");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id='select-2']")).click();
	     List<WebElement> years = driver.findElements(By.xpath("//*[contains(@id,'select-item-select-2-')]"));
	     for(WebElement year:years) 
	     {
	    	 String yeartext = year.getText();
	    	 System.out.println(yeartext);
	    	 if(yeartext.equals("2022")) {
	    		 year.click();
	    		 
	    		 screenShot.captureScreenShot(driver,"bhandle");
	    		 break;
}}}}
