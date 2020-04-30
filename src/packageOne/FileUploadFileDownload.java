package packageOne;

import java.io.File;

import java.io.IOException;

import java.util.HashMap;



import org.testng.Assert;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class FileUploadFileDownload {

	@Test
	public void fileUploadFileDownloadMethod() throws InterruptedException, IOException {

// TODO Auto-generated method stub

		String downloadPath = System.getProperty("user.dir"); // My Project Path

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath); // Download the file in Project path instead of
																		// downloading in Downloads folder

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs); // Setting up the Preferences in Chrome Options

		WebDriver driver = new ChromeDriver(options); // Invoking the Chrome Options in Chrome Driver

		driver.get("https://altoconvertpdftojpg.com/");
//		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("[class*='btn--choose']")).click(); // click on "Choose File" button

		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\HP-PC\\Documents\\AutoIT Files\\fileupload.exe"); // fileupload.exe file contains
																							// the compiled AutoIt
																							// script

		WebDriverWait wait = new WebDriverWait(driver, 100);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

//		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		WebElement element = driver.findElement(By.cssSelector("button[class*='medium']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementsByClassName('service-action__actions')[0].children[0].click();", element);

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now"))); // Explicit wait - wait
																								// until Download Now is
																								// visible

//		driver.findElement(By.linkText("Download Now")).click();
		WebElement downloadElement = driver.findElement(By.linkText("Download Now"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementsByClassName('output-result__download')[0].children[0].click();", downloadElement);


		Thread.sleep(5000);

		File f = new File(downloadPath + "/converted.zip"); // Store the file in variable f with name "converted.zip" in
															// the Project path defined in variable downloadPath

		if (f.exists())

		{

			Assert.assertTrue(f.exists()); // Check if the file of name "converted.zip" exits in the Project path
//			f.delete();
			if (f.delete()) // Delete the file

				System.out.println("file deleted"); //

		}

	}

}
