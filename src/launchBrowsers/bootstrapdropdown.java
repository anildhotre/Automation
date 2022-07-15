package launchBrowsers;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.screenShot;

public class bootstrapdropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://zoom.us/signup");
	     Thread.sleep(5000);
	     
	   WebElement month  =driver.findElement(By.xpath("//*[@id='select-0']"));
	   month.click();
	   Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id='select-item-select-0-2']")).click();
	     WebElement day  =driver.findElement(By.xpath("//*[@id='select-1']"));
		   day.click();
		   Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id='select-item-select-1-2']")).click();
		     WebElement year  =driver.findElement(By.xpath("//*[@id='select-2']"));
			   year.click();
			   Thread.sleep(3000);
			     driver.findElement(By.xpath("//*[@id='select-item-select-2-3']")).click();
			     screenShot.captureScreenShot(driver,"ankush");
}}
