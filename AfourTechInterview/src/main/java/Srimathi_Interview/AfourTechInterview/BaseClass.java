package Srimathi_Interview.AfourTechInterview;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
		WebDriver driver;
		Properties prop=new Properties();
		String browserName;
		public WebDriver InvokeDriver() throws IOException
		{
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("browser.properties");
			prop.load(fis);
			browserName=prop.getProperty("browser");
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "/Users/Srimathi/Downloads/chromedriver");
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "/Users/Srimathi/Downloads/geckodriver");
				driver=new FirefoxDriver();
			
			}
			return driver;
			
		}
	}