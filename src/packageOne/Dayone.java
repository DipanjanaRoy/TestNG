package packageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dayone {
	@Test
	public void firstTest() {
		System.out.println("First Test");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Second Test");
	}
	
	@Test
	public void testIrctc() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.irctc.co.in/nget/train-search");
		  Thread.sleep(4000L);
		  driver.manage().window().maximize();
//		 System.out.println("Alert Text: --->"+driver.findElement(By.xpath("//div[@role='dialog']/div/span")).getText());
		  driver.findElement(By.xpath("//button[text()='Ok']")).click();;
//		  driver.switchTo().alert().accept();
//		  System.out.println("Alert Text : -->" +  driver.switchTo().alert().getText());
	}
}
