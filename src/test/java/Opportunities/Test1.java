package Opportunities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
 @Test
 public void Facebook() {
	 
	
	 WebDriver d1 = new ChromeDriver();
	 d1.get("https://www.facebook.com/");
	 String Actualtitle = d1.getTitle();
	 System.out.println(Actualtitle);
	 
 }
}
