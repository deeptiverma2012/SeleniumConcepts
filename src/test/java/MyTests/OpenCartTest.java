package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

			
		@Test(priority=1)
		public void IsOpenCartLogoIsVisibleTest()
		{
			boolean flag = driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
			Assert.assertEquals(flag, true);
		}
		
		@Test(priority=2)
		public void  OpenCartTitleTest()
		{			
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Your Store");
		}
		
		@Test(priority=3)
		public void  OpenCartUrlTest()
		{
			String actualUrl = driver.getCurrentUrl();
			System.out.println(actualUrl);
			Assert.assertTrue(actualUrl.contains("opencart/"));
		}
		

	}


