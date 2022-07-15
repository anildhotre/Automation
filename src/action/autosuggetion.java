package action;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class autosuggetion {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.co.in/");
	     driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Selenium");
	     Thread.sleep(3000);
	     List<WebElement> searchresults = driver.findElements(By.xpath("//*[@class='pcTkSc']//span[text()='selenium']"));
	 	
			for(WebElement result:searchresults)
			{
				String textofresult = result.getText();
				System.out.println(textofresult);
				if(textofresult.equals("selenium webdriver"))
				{
					result.click();
					break;
				}
}

}}
