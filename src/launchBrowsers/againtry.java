package launchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class againtry {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	     username.sendKeys("Adminn");
	     WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	     password.sendKeys("admin123");
	     WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
	     loginbutton.click();
	     WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
	     String msg = message.getText();
	     System.out.println(msg);
	     String expectedmessage = "Invalid Credentials";
	     if(expectedmessage.equals(msg))
	     {System.out.println("Test case pass");
	    	 }
	     else {
	    	 System.out.println("Test case fail");
	     }
	     }
	     
}
