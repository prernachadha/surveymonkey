package webdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean statu = true;
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   String title = driver.getTitle();
   if(title.contains("Facebook"))
   {
	   System.out.println("facebook is opened");
   }else
   {
	   System.out.println("facebook is not opened");
   }
   String url = driver.getCurrentUrl();
   System.out.println("current url is "+url);
   WebElement ele = driver.findElement(By.name("email"));
   ele.sendKeys("pchadha79@gmail.com");
   String text = ele.getAttribute("value"); 
   System.out.println("value entered  is "+text);
   if(text.isEmpty())
   {
	   System.out.println("value is not entered");
   }else
   {
	   System.out.println("value is entered");
   }
     boolean status = driver.findElement(By.name("login")).isDisplayed();
		if(status==true)
		{
			System.out.println("login button is present");
		}else
		{
			System.out.println("login button is not present");
		}
		
		List<WebElement> lst = driver.findElements(By.tagName("a"));
		for(int i=0;i<lst.size();i++)
		{
		  String st = lst.get(i).getText();
		  System.out.println(st);
		  if(st.equalsIgnoreCase("prerna"))
		  {
			  statu=true;
			  break;
		  }else
		  {
			  statu=false;
		  }
		  
		  }
		if(statu==true)
		{
			System.out.println("create a page is present");
		}else
		{
			System.out.println("value not present");
		}
		 driver.quit();
		 	
		
	}

}
