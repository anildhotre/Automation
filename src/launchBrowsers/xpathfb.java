package launchBrowsers;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.screenShot;

public class xpathfb {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/login.php");
	     WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
	     username.sendKeys("9096819365");
	     WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']"));
	     password.sendKeys("9822477561");
	     
		
}
}