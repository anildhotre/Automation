package launchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
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
     //text
     //driver.findElement(By.xpath("//a[text()='Forgot your password?']\r\n"
     //		+ "")).click();
      driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
      for(int i=1; i<40; i++) 
      {
    	  driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();  
      }
      
	}
	

}