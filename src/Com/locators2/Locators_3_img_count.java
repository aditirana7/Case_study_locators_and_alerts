package Com.locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_3_img_count {
	WebDriver driver;
	@Test
public void Tag_name_with_attribute() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://auth.hollandandbarrett.com/u/login");
	 driver.manage().window().maximize();
	 
	 //tagname=img we need to get the link src
	 String t=driver.findElement(By.tagName("img")).getAttribute("src");
	 System.out.println(t);
	 driver.quit();
}
	public static void main(String[] args) {
	}
}
