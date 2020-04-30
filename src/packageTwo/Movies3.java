package packageTwo;

import org.testng.annotations.Test;

public class Movies3 {

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

}
