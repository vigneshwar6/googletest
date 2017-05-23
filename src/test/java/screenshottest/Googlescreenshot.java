package screenshottest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.IOUtils;
import org.testng.annotations.Test;

import cucumber.api.Scenario;

public class Googlescreenshot {
@Test
public static void screenshot() throws IOException
{
	WebDriver wd=new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.co.in");
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\workspace\\bddtest\\screenshot\\google.jpg"));

			
		}
		

}
