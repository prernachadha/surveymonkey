package testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC001_annotation {
	@Test
	public void asseconcept()
	{
		String name="prerna";
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(name, "Prerna","name not matching");
		System.out.println("values are matching");
		sa.assertAll();
	}
	
	
    @Test(priority=2)
	public void display()
	{
		System.out.println("prerna talwar chadha");
	}
    @Test(priority=1)
	public void text()
	{
		System.out.println("this is testng concept");
	}
    
    //sa.assertAll();
}
