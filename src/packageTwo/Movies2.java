package packageTwo;

import org.testng.annotations.Test;

public class Movies2 {
	@Test(groups= {"FirstMovies"})
	public void horrorMovieFirst()
	{
		System.out.println("Horror Movie First-- > The Ghost");
	}
	
	@Test
	public void horrorMovieSecond()
	{
		System.out.println("Horror Movie Second-- > Purani Haveli");
	}
	@Test(groups= {"FirstMovies"})
	public void actionMovieFirst()
	{
		System.out.println("Action Movie First-- > URI");
	}
	@Test
	public void actionMovieSecond()
	{
		System.out.println("Action Movie Second-- > Tiger Zinda Hain");
	}
}
