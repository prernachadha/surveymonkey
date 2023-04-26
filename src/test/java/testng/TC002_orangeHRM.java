package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_orangeHRM {
public static WebDriver driver;
   @BeforeMethod
	public void start() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Selenium\\Sellenium Programs\\Seleniumpractice\\name.properties");
		pro.load(fis);
		String url1 = pro.getProperty("url");
		
		
		
		
		driver.get(url1);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
   @AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@Test
	public void title()
	{
		String tit = driver.getTitle();
		System.out.println("The title is "+tit);
	}
	@Test
	public void forgotpass()
	{
		String pass = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).getText();
		Assert.assertEquals(pass, "Forgot your password?","forgot password link is not present");
		System.out.println("forgot password link is present");
	}
	
}
