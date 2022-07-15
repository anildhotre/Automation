package launchBrowsers;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.screenShot;

public class chromeDriver {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://www.google.com");
	     Thread.sleep(3000);
     driver.get("http://www.facebook.com");
    driver.navigate().back();
     Thread.sleep(3000);
     driver.navigate().refresh();
    Thread.sleep(3000);
	     driver.navigate().forward();
	     
	     
	     screenShot.captureScreenShot(driver,"rajjuue");
}

}
