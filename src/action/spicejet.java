package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spicejet {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.airindia.in/");
	     Actions act4 = new Actions(driver); 
	     act4.moveToElement(driver.findElement(By.xpath("//*[@id='concessionaryType1']"))).build().perform();
	     Thread.sleep(3000);
	     
}}
