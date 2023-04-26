package webdriverconcepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
   Boolean status=true;
   public String getalert(WebDriver driver)
   {
	   Alert al = driver.switchTo().alert();
		String text = al.getText();
		return(text);
   }
   
   public void alertdismiss(WebDriver driver)
   {
	   Alert al = driver.switchTo().alert();
	   al.dismiss();
   }
   public void click(WebElement ele)
   {
	   ele.click();
   }
	public void selectfromdropdown(WebElement ele, String st) {
		 Select day = new Select(ele);
	      day.selectByVisibleText(st);
	}
	
	public void selectfromdropdown(WebElement ele, int te) {
		  Select year = new Select(ele);
		    year.selectByIndex(te);
	}

	public void checkvalue(WebElement ele, String st) {
		 Select year = new Select(ele);
	      List<WebElement> lst = year.getOptions();
	      for(int i=0;i<lst.size();i++)
	      {
	    	  String txt = lst.get(i).getText();
	    	  System.out.println(txt);
	    	  if(txt.equals(st))
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
	    	  System.out.println("value is present");
	      }else
	      {
	    	  System.out.println("value not present");  
	      }
	      
		
	}
	
}
