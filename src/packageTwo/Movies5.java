package packageTwo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Movies5 {
	@Parameters({"URL","URL2"})
	@Test
	public void horrorMovieFifthOne(String urlFirst,String urlSecond)
	{
		System.out.println("Movie link in horrorMovieFifthOne -- >" + urlFirst);
		System.out.println("Second Movie link in horrorMovieFifthOne -- >" + urlSecond);
	}
	
	@Test
	public void horrorMovieFifthTwo()
	{
		System.out.println("Horror Movie -- > Purani Haveli");
	}
	@Parameters({"URL","URL2"})	
	@Test
	public void horrorMovieFifthThree(String urlFirst,String urlSecond)
	{
		System.out.println("Movie link in horrorMovieFifthThree -- >" + urlFirst);
		System.out.println("Second Movie link in horrorMovieFifthThree -- >" + urlSecond);
	}
}
