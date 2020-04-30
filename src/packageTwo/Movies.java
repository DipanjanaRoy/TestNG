package packageTwo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Movies {

	@Test(groups= {"FirstMovies"})
	public void comedyMovieFirst()
	{
		System.out.println("Comedy Movie First-- > Chup Chup Ke");
	}
	
	@Test
	public void comedyMovieSecond()
	{
		System.out.println("Comedy Movie Second-- > Phir Hera Pheri");
	}
	@Test(groups= {"FirstMovies"})
	public void romanticMovieFirst()
	{
		System.out.println("Romantic Movie First-- > Jab We Met");
	}
	@Test
	public void romanticMovieSecond()
	{
		System.out.println("Romantic Movie Second-- > Milenge Milenge");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Executing any other method in this class (BeforeClass)");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Executing any other method in this class (AfterClass)");
	}
	@BeforeSuite
	public void checkSchedule()
	{
		System.out.println("I checked my schedule today and I am Free (BeforeSuite)");
	}
	@AfterSuite
	public void getBackToWork()
	{
		System.out.println("Let's get back to work (AfterSuite)");
	}
	
	@BeforeTest
	public void purchaseTickets()
	{
		System.out.println("I have purchased tickets (@BeforeTest)");
	}
	
	@AfterTest
	public void tearTickets()
	{
		System.out.println("Now I will tear the tickets as I have seen the Movie (AfterTest)");
	}
	@BeforeMethod
	public void movieBefore()
	{
		System.out.println("I am going to watch Movie (@BeforeMethod)");
	}
	
	@AfterMethod
	public void movieAfter()
	{
		System.out.println("I watched the Movie (AfterMethod)");
	}
	
	
}
