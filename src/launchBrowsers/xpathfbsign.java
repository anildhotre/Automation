package launchBrowsers;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpathfbsign {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/reg/");
	     //contains
	      //driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("anil ");
	      driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("dhotre");
	     // driver.findElement(By.xpath("//input[contains(@id,'u_0_g_')]")).sendKeys("9096819365");
	      driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("9767940536");
	    //and logical
	      driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys("9767940536");
	     //OR logical
	      driver.findElement(By.xpath("//input[@type='text' or @name='reg_email__']")).sendKeys("9767940535");
	     
	      
	      List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
		     for(WebElement day:dayvalues)
		     {
		    	 String dayvalue = day.getText();
		    	 System.out.println(dayvalue);
		    	 if(dayvalue.equals("24")) 
		    	 {
		    		 day.click();
		    		 break;  
	     // screenShot.captureScreenShot(driver,"anil33");
	     
	     
	 
}}}}
