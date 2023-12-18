package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIFramesHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://selectorshub.com/iframe-scenario/");
   // f1
    driver.switchTo().frame("pact1");// Ist frame
    Thread.sleep(1000);
     
    driver.findElement(By.id("inp_val")).sendKeys("Akshat");
    //f2
    driver.switchTo().frame("pact2");// 2nd frame
    driver.findElement(By.id("jex")).sendKeys("Ashish");
    
    //f3
     driver.switchTo().frame("pact3");// 3rd frame
     driver.findElement(By.id("glaf")).sendKeys("Destiny");
     //f3-->f1
     //driver.switchTo().frame("pact1");// Switching to 1st frame: Not possible, it will give No frame element found exception
     Thread.sleep(1000);
      //f3-->f2
     //driver.switchTo().frame("pact2");//Switching to second frame : Not possible, it will give No frame element found exception
    // driver.findElement(By.id("jex")).clear();
     
     //Frames always work in forward direction. We cannot traverse in backward direction
     
//     driver.switchTo().parentFrame();// f3-->f2
//     driver.findElement(By.id("jex")).clear();
//     driver.findElement(By.id("jex")).sendKeys("AAAAA");
//     Thread.sleep(1000);
//     driver.switchTo().parentFrame();// f2--->f1
//     
//     //driver.findElement(By.id("jex")).clear();
//     driver.findElement(By.id("inp_val")).sendKeys("Paru");
     
     driver.switchTo().defaultContent();//f3-->page
    String labelText= driver.findElement(By.tagName("h3")).getText();
    System.out.println(labelText);
    
    // Only i frames can be in hierarchy whereas frames can be in sets that's why we have frameset
    //frames are individual elements but iframe can exist in hierarchial way
     
     
     
	}

}
