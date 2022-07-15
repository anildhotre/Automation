package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://jqueryui.com/draggable/");
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			
//			Switching from parent frame to iframe
			
			driver.switchTo().frame(iframe);
			
			WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		
			Actions act = new Actions(driver);
			
			act.clickAndHold(draggable).moveByOffset(20, 60).release(draggable).build().perform();
			
			Thread.sleep(2000);
			
			act.clickAndHold(draggable).moveByOffset(-10, -30).release(draggable).build().perform();
		
//		Switching back to the parent frame:
			
			driver.switchTo().parentFrame();
		
		}

}

	