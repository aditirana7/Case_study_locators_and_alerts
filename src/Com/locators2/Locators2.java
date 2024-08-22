package Com.locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Locators2 {
	WebDriver driver;
	@Test
	public void ChromeExId() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		//locators-ID,Name and Xpath-XML Path
		
		Boolean Enabled = driver.findElement(By.id("Email")).isEnabled();
		System.out.println(Enabled);
		Boolean Selected= driver.findElement(By.name("Password")).isSelected();
		System.out.println(Selected);
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
	}
	@Test
	public void EdgeExId() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./Edge_Driver_Jars/msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		Boolean Enabled = driver.findElement(By.id("Email")).isEnabled();
		System.out.println(Enabled);
		Boolean Selected= driver.findElement(By.name("Password")).isSelected();
		System.out.println(Selected);
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	}
}
