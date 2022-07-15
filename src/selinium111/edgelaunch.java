package selinium111;

import org.openqa.selenium.edge.EdgeDriver;


public class edgelaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe");
	     EdgeDriver driver = new EdgeDriver();
	     driver.get("http://www.facebook.com");

}
}
