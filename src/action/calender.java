package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://jqueryui.com/datepicker/");
	     WebElement iframe =  driver.findElement(By.xpath("//*[@class='demo-frame']"));
	     driver.switchTo().frame(iframe);
	     driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	     WebElement month1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
	     driver.findElement(By.xpath("ui-datepicker-prev ui-corner-all")).click();
	     //driver.findElement(By.xpath("ui-datepicker-prev ui-corner-all")).
}}
