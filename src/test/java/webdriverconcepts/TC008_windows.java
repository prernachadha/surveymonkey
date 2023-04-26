package webdriverconcepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC008_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
  // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.findElement(By.linkText("Create new account")).click();
   String title = driver.getTitle();
   System.out.println("title of first window is "+title);
   WebDriverWait wait = new WebDriverWait(driver, 20);
   wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Cookies Policy")));
   driver.findElement(By.linkText("Cookies Policy")).click();
   Set<String> itr =  driver.getWindowHandles();
   Iterator<String> itera = itr.iterator();
   String first = itera.next();
   String second = itera.next();
   System.out.println(first);
   System.out.println(second);
   
   driver.switchTo().window(second);
   String secondtit= driver.getTitle();
   System.out.println("second window title is "+secondtit);
   
	}

}
