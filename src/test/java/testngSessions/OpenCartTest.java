package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
	   driver = new ChromeDriver();	
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.get("https://naveenautomationlabs.com/opencart/");
	}
	@Test(priority=-1)
	public void IsOpenCartLogoIsVisibleTest()
	{
		boolean flag = driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test(priority=-2)
	public void  OpenCartTitleTest()
	{
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Your Store");
	}
	@Test(priority=1)
	public void  OpenCartUrlTest()
	{
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertTrue(actualUrl.contains("opencart/"));
	}
	@Test
	public void  aTest()
	{
		System.out.println("a test");
	}
	@Test
	public void  bTest()
	{
		System.out.println("b test");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
