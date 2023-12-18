package MySeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    String username ="admin";
    String password = "admin";
    driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		

	}

}
