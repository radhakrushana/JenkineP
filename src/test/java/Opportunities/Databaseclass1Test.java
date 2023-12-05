package Opportunities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Databaseclass1Test {
 
	public WebDriver driver;
	
	@Test
	public void vtigercrmTest() throws IOException
	{
		FileInputStream fis = new FileInputStream("src\\test\\resources\\vtigerdatabase.properties.txt");
		Properties p = new Properties();
		p.load(fis);
		
		String BROWSER = p.getProperty("broswer");
		String URL =     p.getProperty("Url");
	    String USERNAME = p.getProperty("Username");
	    String PASSWORD = p.getProperty("Password");
	    
	    if(BROWSER.equalsIgnoreCase("Chrome")) {
	    	driver = new ChromeDriver();
	    	
	    }else if(BROWSER.equalsIgnoreCase("Edge")){
	    	driver = new EdgeDriver();
	    }
	    else {
	    	driver = new FirefoxDriver();
	    }
	    
	    driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		  driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		  
		  driver.findElement(By.id("submitButton")).click();
		  
	}
	
	
}
