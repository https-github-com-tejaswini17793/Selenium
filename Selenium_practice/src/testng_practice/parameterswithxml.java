package testng_practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterswithxml {
	@Test
	@Parameters({"val1","val2"})
	public void add(int v1,int v2)
	{
		int result=v1+v2;
		System.out.println(result);
	}
	@Test
	@Parameters({"val1","val2"})
	public void diff(int v1,int v2)
	{
		int result=v1-v2;
		System.out.println(result);
	}

	@Test
	@Parameters({"val1","val2"})
	public void div(int v1,int v2)
	{
		int result=v1/v2;
		System.out.println(result);
	}
}
