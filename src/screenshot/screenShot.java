package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {public static void main(String[] args) {
	
}
	public static void captureScreenShot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
//		 String path = "F:\\Desktop\\VimanNagar\\May 21\\23AprSeleniumBasics\\screenshots\\"+filename+".png";
		
		String path = System.getProperty("user.dir")+"\\screenshotssss\\"+filename+".png";		 
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
	}


}
