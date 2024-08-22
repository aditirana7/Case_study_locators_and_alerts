package Com.locators2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alerts_3 {
	WebDriver driver;
	@Test
public void chrome_driver() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	 Alert alert=driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert.accept();
	 String result=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result);
	 Assert.assertEquals("You successfully clicked an alert", result);
	 	
	
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	 Alert alert2=driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert.dismiss();
	 String result2=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result2);
	 Assert.assertEquals("You clicked: Cancel", result2);
	 
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	 Alert alert3=driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert.accept();
	 String result3=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result3);
	 Assert.assertEquals("You clicked: Ok" , result3);
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	 driver.switchTo().alert().sendKeys("Hello Aditi");
	 Thread.sleep(2000);
	 alert.accept();
	 String result4=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result4);
	 Assert.assertEquals("You entered: Hello Aditi" , result4);
	 driver.quit();
}
	//for edge driver
	 public void edge_driver() throws InterruptedException
	 {
	
	 System.setProperty("webdriver.edge.driver","./Edge_Driver_Jars/msedgedriver.exe");
	 driver=new EdgeDriver();
	 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	 Alert alert=driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert.accept();
	 String result=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result);
	 Assert.assertEquals("You successfully clicked an alert", result);
	 	
	
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	 Alert alert2=driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert.dismiss();
	 String result2=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result2);
	 Assert.assertEquals("You clicked: Cancel", result2);
	 
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	 Alert alert3=driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert.accept();
	 String result3=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result3);
	 Assert.assertEquals("You clicked: Ok" , result3);
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	 driver.switchTo().alert().sendKeys("Hello Aditi");
	 Thread.sleep(2000);
	 alert.accept();
	 String result4=driver.findElement(By.cssSelector("#result")).getText();
	 System.out.println(result4);
	 Assert.assertEquals("You entered: Hello Aditi" , result4);
	 driver.quit();
	 
	 
	 }
}

