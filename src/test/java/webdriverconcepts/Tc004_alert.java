package webdriverconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc004_alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baseclass bc = new Baseclass();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		bc.click(driver.findElement(By.linkText("Sign in")));
		bc.click(driver.findElement(By.name("proceed")));
		String txt = bc.getalert(driver);
		System.out.println(txt);
		bc.alertdismiss(driver);
		
		
		
		
		
		
	}

}
