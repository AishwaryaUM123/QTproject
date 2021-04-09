package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
  

public class globalvar {
	public WebDriver driver=null;
	
		@Test
		public void login() throws IOException
		{
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\eclipse-workspace\\TestNG_project\\src\\test\\datadrive.properties");
			prop.load(fis);
			System.out.println(prop.getProperty("username"));
		    System.out.println(prop.getProperty("password"));
		    prop.getProperty("browser").equals("chrome");
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		    driver.get(prop.getProperty("url"));
		    
		
		}
		
		
}
