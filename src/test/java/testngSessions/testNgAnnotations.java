package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




/*
BS -----------------Connect with database
BT----------------------Create the User
BC----------------------Launch Browser

BM------------------------loginToApp
Test---------------------------Add To Cart Test
AM---------------------------Logout

BM------------------------loginToApp
Test---------------------------Checkout Test
AM---------------------------Logout

BM------------------------loginToApp
Test---------------------------Search Test
AM---------------------------Logout

AT---------------------------delete the User
AS---------------------------disconnect with db
 */

public class testNgAnnotations {

	@BeforeSuite
	public void connectWithDB()
	{
		System.out.println("BS -----------------Connect with database");
	}
	@BeforeTest
	public void createUser()
	{
		System.out.println("BT----------------------Create the User");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC----------------------Launch Browser");
	}
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM------------------------loginToApp");
	}
		
	@Test	
	public void searchTest()
	{
		System.out.println("Test---------------------------Search Test");
	}
	@Test	
	public void addToCartTest()
	{
		System.out.println("Test---------------------------Add To Cart Test");
	}
	@Test	
	public void checkoutTest()
	{
		System.out.println("Test---------------------------Checkout Test");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("AM---------------------------Logout");
	}
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT---------------------------delete the User");
	}
	@AfterSuite
	public void disconnectWithDB()
	{
		System.out.println("AS---------------------------disconnect with db");
	}
	
	
}
