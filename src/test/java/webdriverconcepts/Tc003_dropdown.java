package webdriverconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc003_dropdown {
    public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common cm = new Common();
		driver = cm.open(driver,"Chromedriver");   
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   driver.findElement(By.linkText("Create new account")).click();
   
  /* Select day = new Select(driver.findElement(By.id("day")));
      day.selectByValue("26");*/
		Boolean status = true;
      Baseclass bc = new Baseclass();
      bc.selectfromdropdown((driver.findElement(By.id("day"))),"26");
      bc.selectfromdropdown((driver.findElement(By.id("month"))),"May");
	/*Select month = new Select(driver.findElement(By.id("month")));	
	    month.selectByVisibleText("May");
	*/  
      bc.selectfromdropdown((driver.findElement(By.id("year"))),3);
	   /* Select year = new Select(driver.findElement(By.id("year")));
	    year.selectByIndex(3);*/
     bc.checkvalue(driver.findElement(By.id("year")), "1979");
	    cm.close(driver
	    		);
	    
	}

}
