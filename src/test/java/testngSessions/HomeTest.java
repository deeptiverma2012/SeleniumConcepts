package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {
	// python: Pytest/ UnitTest
	//.Net : NUnit
	//Java : Junit/TestNG
	//Node JS: Mocha/ Jasmine
	
	

	// Feature : method: API: WS: Whitebox testing/ static analysis
	// test coverage: 100%
	//code coverage: 100%
	//code coverage checking tools: Sonarcube, Jacoco, Cobertura
	private int sum(int a, int b)
	{
		return a+b;
	}
	//user: web app: functional testing
	public void calSum(int a, int b)
	{
		sum(a,b);
	}
	
	//Unit test + assertions
	@Test
	public void sumTest1()
	{	
	 Assert.assertEquals(sum(12,10),22);
	}
	@Test
	public void sumTest2()
	{
		Assert.assertEquals(sum(10,20), 30);
	}
	@Test
	public void sumTest3()
	{
		Assert.assertEquals(sum(40,20), 60);
	}
	@Test
	public void sumTest4()
	{
		Assert.assertEquals(sum(20,20), 40);
	}
	@Test
	public void sumTest5()
	{
		Assert.assertEquals(sum(-10,20), 10);
	}
	
}
