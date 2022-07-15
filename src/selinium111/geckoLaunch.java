package selinium111;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckoLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	     FirefoxDriver driver = new FirefoxDriver();
	     driver.get("http://www.facebook.com");
		
	}

}
