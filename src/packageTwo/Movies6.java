package packageTwo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Movies6 {
	@Parameters({"URL"})
	@Test
	public void horrorMovieSixthOne(String urlFirst)
	{
		System.out.println("Movie link in horrorMovieSixthOne -- >" + urlFirst);
	}
	
	@Test
	public void horrorMovieSixthTwo()
	{
		System.out.println("Horror Movie -- > Purani Haveli");
	}

}
