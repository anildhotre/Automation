package handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleselectdropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/reg/");
	     
	     
	     List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
	     for(WebElement day:dayvalues) {
	    	 String dayvalue = day.getText();
	    	 System.out.println(dayvalue);
	    	 if(dayvalue.equals("20")) {
	    		 day.click();
	    		 break;
	    	 }
	    	 
	     }
	     
}}
