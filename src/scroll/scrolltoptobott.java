package scroll;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltoptobott {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://jqueryui.com/droppable/");
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     //using pixel
	     js.executeScript("window.scrollBy(0,1450)");
}}
