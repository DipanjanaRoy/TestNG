package packageTwo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Movies7 {

	@Parameters({"URL"})
	@Test
	public void horrorMovieSeventhOne(String urlFirst)
	{
		System.out.println("Movie link in horrorMovieSeventhOne -- >" + urlFirst);
	}
	
	@Test
	public void horrorMovieSeventhTwo()
	{
		System.out.println("Horror Movie -- > Purani Haveli");
	}
}
