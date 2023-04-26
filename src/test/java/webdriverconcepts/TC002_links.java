package webdriverconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_links {

	public static void main(String[] args) {
		Boolean status = true;
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   // driver.findElement(By.linkText("Create a Page"));
    
    List<WebElement> lst = driver.findElements(By.tagName("a"));
    int size = lst.size();
    System.out.println("links are " +size);
		for(int i=0;i<size;i++)
		{
			String tit = lst.get(i).getText();
			System.out.println(tit);
			if(tit.equalsIgnoreCase("Create a page"))
			{
				status=true;
				break;
			}else
			{
				status=false;
			}
			
		}
		if(status==true)
		{
			System.out.println("text is present");
		}else
		{
			System.out.println("text is not present");
		}
		driver.quit();
	}

}
