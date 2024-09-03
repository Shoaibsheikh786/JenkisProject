package socail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Dummy {

	//priority 1
	@Test
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
	//	Assert.assertEquals(title, "Facebook – log in or sign up");
		driver.close();
	}
	
	@Test
	public void test2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
	//	Assert.assertEquals(title, "Google");
		driver.close();
		
	}
	
	

}
