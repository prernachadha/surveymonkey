package webdriverconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
    //public static WebDriver driver;
	
    public WebDriver open(WebDriver driver, String browsername) {
    	
    	if(browsername.equalsIgnoreCase("ChromeDriver"))
    	{
    	WebDriverManager.chromedriver().setup();
 	    driver = new ChromeDriver();
 	   
    	}
    	else if(browsername.equalsIgnoreCase("edge"))
    	{
    		WebDriverManager.edgedriver().setup();
    		 driver = new EdgeDriver();
    		 
    	}else
    	{
    		System.out.println("browser name should be either chrome or edge");
    	}
    	return(driver);
    }
    public void close(WebDriver driver)
    {
    	driver.quit();
    }
		
}
