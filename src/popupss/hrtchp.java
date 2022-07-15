package popupss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrtchp {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");

     WebElement serchbutton=driver.findElement(By.xpath("//*[@name='searchBtn']"));
     serchbutton .click();

Thread.sleep(2000);
//Handling the alert pop up by clicking on ok button
driver.switchTo().alert().accept();


}}