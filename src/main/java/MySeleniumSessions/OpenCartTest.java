package MySeleniumSessions;

public class OpenCartTest {

	public static void main(String[] args) {
		BrowserUtility brUtil = new BrowserUtility();
		brUtil.lanchBrowser("edge");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/");
		
	   String actTitle = brUtil.getTitle();
	   String expTitle ="Your Store";
	   if(actTitle.equals(expTitle))
	   {
		   System.out.println("title is correct ---> Pass");
	   }
	   else
	   {
		   System.out.println("title is incorrect ---> Fail");
	   }
	   
	   String url = brUtil.getPageUrl();
	   if (url.equals("https://naveenautomationlabs.com/opencart/"))
	   {
		   System.out.println("url is correct ---> Pass");
	   }
	   else
	   {
		   System.out.println("url is incorrect ---> Fail");
	   }
	}

}
