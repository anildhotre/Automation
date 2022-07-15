package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizable {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://jqueryui.com/resizable/");
	     WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	     driver.switchTo().frame(iframe);
			
			WebElement resize = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.clickAndHold(resize).moveByOffset(100, 150).release(resize).build().perform();
}}
