package popupss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://groww.in/");
	     WebElement loginbutton = driver.findElement(By.xpath("//*[text()='Login/Register']"));

			loginbutton .click();
			Thread.sleep(2000);
			WebElement email = driver.findElement(By.xpath("//*[@id='login_email1']"));

			email .sendKeys("anildhotre88@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
}}
