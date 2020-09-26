package Srimathi_Interview.AfourTechInterview;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {
	WebDriver driver;
	WebDriver TestCase1() throws IOException
	{
		//Invoking driver from base class
		driver=InvokeDriver();
		return driver;
	}
	@Test(priority=1)
	public void LogintoAfour() throws IOException, InterruptedException
	{
		//Getting driver from constructor
		this.driver=TestCase1();
		//Go to URL
		driver.get("https://authorcafe.com/sign-in/");
		
		//Provide user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("aucsdet@yopmail.com");
		driver.findElement(By.xpath("//input[@id='signpassword']")).sendKeys("Authorcafe@123");
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		WebDriverWait wait=new WebDriverWait(driver,60);
		Thread.sleep(8000);
		WebElement editor=driver.findElement(By.id("abeditor"));
		wait.until(ExpectedConditions.visibilityOf(editor));
		driver.findElement(By.id("abeditor")).click();
		driver.findElement(By.id("abeditor")).sendKeys("Hello World!");

}
	@Test(priority=2)
	public void DetermineHypratio() throws IOException, InterruptedException
	{
		//Getting driver from constructor
		this.driver=TestCase1();
		//Go to URL
		driver.get(" https://www.pagecentralhub.com/ondemand/dashboard/output.html?accessCode=Jj2eSOUUDn");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("page1"));
		
		int count=0;
	      List<WebElement> lines = driver.findElements(By.xpath("//div[@class='p']"));
	      System.out.println("The number of lines is " + lines.size());
	      for(int i=0;i<lines.size();i++)
	      {
	    	  String getLine=lines.toString();
	    	  if(getLine.contains("_"))
	    	  {
	    		  count=count+1;
	    	  }
	      }
	      int ratio=lines.size()/count;
	      System.out.println(count);
	      System.out.println("Ratio:"+ratio);
	      
	}
}
