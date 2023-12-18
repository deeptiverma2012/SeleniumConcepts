package MySeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//sid =123
		driver.get("https://www.google.com");//sid =123
			
			//Verification point/check point/ actual vs expected: testing
		   String actTitle=driver.getTitle();//sid =123
		   System.out.println("Title is:"+actTitle);//sid =123
		   
		   if(actTitle.equals("Google"))
		   {
			   System.out.println("Title is correct --Pass");
		   }
		   else
		   {
			   System.out.println("Title is incorrect --Fail");
		   }
		   String url =  driver.getCurrentUrl();
		   System.out.println(url);
		   
		   String pgsrc = driver.getPageSource();
		   if(pgsrc.contains("Google"))
		   {
			   System.out.println("Page source contains title --- Pass");
		   }
		   else
		   {
			   System.out.println("Page source doesn't contains title --- Fail");
		   }

		   // driver.close();
			//driver.quit();//sid =123
			////sid =null;
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com"); //sid = 456
			//System.out.println(driver.getTitle());//sid = 456
			
			
			//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		}


	}


