package packageTwo;

import java.io.IOException;

import org.testng.annotations.Test;

public class ClassUsingDataDriverPropertiesClass extends ClassDefiningDataDriverProperties{
	@Test
	public void test1() throws IOException
	{
		Login();
		System.out.println("Test 1 called Login ");
		
	}
	
	@Test
	public void test2() throws IOException
	{
		Login();
		System.out.println("Test 2 called Login ");
	}
}
