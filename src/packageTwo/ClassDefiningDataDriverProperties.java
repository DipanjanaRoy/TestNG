package packageTwo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassDefiningDataDriverProperties {

	public WebDriver driver = null;
	
	
	@Test
	public void Login() throws IOException {
		
		Properties prop  = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\HP-PC\\eclipse-workspace\\TestNGTutorial\\src\\packageTwo\\dataDriver.properties");
		//Properties needs to know where the dataDriver.properties file is stored
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String urlValue = prop.getProperty("commonUrl");
		System.out.println("Browser Name : " + browserName);
		
		if(browserName.contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(browserName.contains("Firefox"))
		{
		// Write code for FireFox
		}
		else if(browserName.contains("IE"))
		{
		// Write code for IE
		}
		
		driver.get(urlValue);
	
	}
}
