package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://the-internet.herokuapp.com/upload");
	driver.findElement(By.name("file")).sendKeys("C:\\Users\\pchad\\OneDrive\\Desktop\\sample.txt");	
	driver.findElement(By.id("file-submit")).click();	
		
	}

}
