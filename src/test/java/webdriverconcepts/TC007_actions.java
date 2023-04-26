package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC007_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://jqueryui.com/droppable/");
   
   driver.switchTo().frame(0);
   Actions action = new Actions(driver);
   action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
   driver.switchTo().defaultContent();
   action.moveToElement(driver.findElement(By.linkText("JS Foundation"))).build().perform();
   driver.findElement(By.linkText("Members")).click();
   //driver.quit();
	}

}
