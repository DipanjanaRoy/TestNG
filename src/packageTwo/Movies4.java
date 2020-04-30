package packageTwo;

import org.testng.annotations.Test;
/*--- We have a requirement that Horror Movie should execute before comedy movie-----*/
/*--- @Test(enabled=false) --> If we know any method is giving error and we want to skip the execution of that method */
/*--- If we know that execution of a particulr method is taking time ,use timeOut(It says that wait for 5 sec for the method before you give any error)---*/
public class Movies4 {
	
	@Test(dependsOnMethods= {"horrorMovie"})
	public void comedyMovie()
	{
		System.out.println("Comedy Movie -- > Chup Chup Ke");
	}
	

	@Test
	public void horrorMovie()
	{
		System.out.println("Horror Movie -- > Purani Haveli");
	}
	
	@Test(enabled=false)
	public void actionMovie()
	{
		System.out.println("Action Movie -- > Tiger Zinda Hain");
	}
	@Test(timeOut=8000)
	public void thrilerMovie()
	{
		System.out.println("Thriller Movie -- > Naam Shabana");
	}


}
