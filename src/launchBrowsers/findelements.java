package launchBrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {
	public static void main(String[] args) {
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
	      driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	      List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contain(@id,'ohrmList_chkSelectRecord_')]"));
        for(WebElement checkbox  : checkboxes) {
	    checkbox.click();
}
	}}
