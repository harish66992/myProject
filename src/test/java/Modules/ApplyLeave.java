package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.LoginPage;

public class ApplyLeave {
	
	public WebDriver driver;
	
	
	ApplyLeave()
	{
		LoginPage first = new LoginPage();
		driver=first.Login();
		
	}
	
	
	@Test
	public void applyleavemodule()
	{
		driver.findElement(By.xpath("//button[@title='Apply Leave']")).click();
	}

}
