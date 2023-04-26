package webdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC009_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=true;
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.w3schools.com/html/html_tables.asp");
     
     String ele = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText();
     System.out.println(ele);
     List<WebElement> lst = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
     for(int i=0;i<lst.size();i++)
     {
    	String text =  lst.get(i).getText();
    	if(text.equalsIgnoreCase("prerna"))
    	{
    		status=true;
    		break;
    		
    	}else
    	{status=false;
    	}
     }
    	if(status==true)
    	{
    		System.out.println("value is present");
    	}else
    	{
    		System.out.println("value is not present");
    	}
     
    	 
     driver.quit();
	}

}
