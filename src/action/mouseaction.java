package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseaction {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
			WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
//		double click
			Actions act = new Actions(driver);
			
			act.doubleClick(doubleclickbutton).perform();
			
			
		
		}}
