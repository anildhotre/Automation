package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbmovetab {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     WebElement forgot =  driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
	     
	     Actions act3 = new Actions(driver);
	     act3.moveToElement(forgot).keyDown(Keys.CONTROL).click().build().perform();

}}
