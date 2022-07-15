package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.screenShot;

public class pravin {
	
		public static void main(String[] args)  {

			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Puranik");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_g_')]")).sendKeys("8180011686");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9284644926");


		WebElement username55 = driver.findElement(By.className("_8esa"));
		username55.click();

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9284644926");

		WebElement username66 = driver.findElement(By.xpath("//input[@value='2']"));
		username66.click();
	      List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
		     for(WebElement day:dayvalues)
		     {
		    	 String dayvalue = day.getText();
		    	 System.out.println(dayvalue);
		    	 if(dayvalue.equals("24")) 
		    	 {
		    		 day.click();
		    		 break;  
	     // screenShot.captureScreenShot(driver,"anil35");
		
	}
	}}}

