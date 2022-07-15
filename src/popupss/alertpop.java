package popupss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpop {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

			WebElement alertbutton = driver.findElement(By.xpath("//*[@name='alert']"));

			alertbutton.click();
			
			Thread.sleep(2000);
//			Handling the alert pop up by clicking on ok button
			driver.switchTo().alert().accept();
			
			
		}



}

	