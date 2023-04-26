package webdriverconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_inputfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String tit = "Facebook";
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains(tit))
		{
			System.out.println("facebook is opened");
		}else
		{
			System.out.println("facebook is not opened");
		}
		String url = driver.getCurrentUrl();
		
		System.out.println("current url is " +url);
		driver.findElement(By.name("email")).sendKeys("pchadha79@gmail.com");
		
		
		String val = driver.findElement(By.name("email")).getAttribute("value");
		System.out.println("email enetred is "+val);
		if(val.isEmpty())
		{
			System.out.println("value is not entered");
		}else
		{
			System.out.println("value is entered");
		}
		String pass = driver.findElement(By.name("login")).getText();
		System.out.println(pass);
		 driver.findElement(By.linkText("Forgot password?")).click();
		if(pass.equalsIgnoreCase("Log In"))
			
		{
			System.out.println("login button is present");
		}else
		{
			System.out.println("login button is not present");
		}
		
		 driver.quit();
	}

}
