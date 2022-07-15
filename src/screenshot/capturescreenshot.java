package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturescreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	     username.sendKeys("Admin");
	     WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	     password.sendKeys("admin123");
	     WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
	     loginbutton.click();
	     //capture screenshot
	     TakesScreenshot ts = (TakesScreenshot)driver;
	     File source = ts.getScreenshotAs(OutputType.FILE);
	     String path = "D:\\capturescreenshot\\orangelogin1.png";
	     File destination = new File(path);
	     FileHandler.copy(source,destination);
}}
