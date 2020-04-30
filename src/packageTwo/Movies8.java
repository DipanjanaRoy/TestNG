package packageTwo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Movies8 {
	@Test(dataProvider = "getData")
	public void horrorMovieEighthOne(String username,String password)
	{
		System.out.println("Username -- >" + username);
		System.out.println("Password -- >" + password);
	}
	
	@DataProvider
	public Object[][] getData() {
	
		//1st combination -- username password
		//2nd combination -- username password
		//3rd combination -- username password
		
		Object[][] data = new Object[3][2];
		data[0][0] = "Sita";
		data[0][1] = "Sita123";
		data[1][0] = "Ram";
		data[1][1] = "Ram123";
		data[2][0] = "Gagan";
		data[2][1] = "Gagan123";

		return data;
	}
}
