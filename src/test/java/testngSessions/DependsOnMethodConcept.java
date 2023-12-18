package testngSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test()
	public void loginTest()
	{
		System.out.println("login");
		int x = 5/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void searchTest()
	{
		System.out.println("Search");
	}
	
	@Test(dependsOnMethods ="searchTest")
	public void addToCartTest()
	{
		System.out.println("Add to cart");
	}
	// AAA rule/AAA pattern : Arrange, act & assert
	//1. No dependencies
	//2. No priority
	//3. Test cases/methods should be independent
	
	
	// It is not a good practice to apply so many assertions in a single test. 
	//In case if the first assertion fails, it will not execute the assertions written later
	
	public void searchOnHomePageTest()
	{
		// login(userName, pwd)
		// search("macbook")
		//assertion: only 1 assertion in a single test case
		//a1: fail
		//a2: skipped
		//a3: skipped
		//a4: skipped
		//a5: skipped
	}
	

}
