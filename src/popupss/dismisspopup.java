package popupss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dismisspopup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

			WebElement textonconfirmationalert = driver.findElement(By.xpath("//*[@name='confirmation']"));

			textonconfirmationalert .click();
			
			Thread.sleep(2000);
			String textonconfirmationalert1 = driver.switchTo().alert().getText();
			System.out.println(textonconfirmationalert1);
//			Handling the alert pop up by clicking on ok button
			driver.switchTo().alert().dismiss();
			
}}
