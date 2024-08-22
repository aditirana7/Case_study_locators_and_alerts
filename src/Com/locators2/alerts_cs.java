package Com.locators2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class alerts_cs {
		WebDriver driver;
		@Test
	public void alerts_password() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 
		 
		 driver.findElement(By.name("passwd")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		 alert=driver.switchTo().alert();
		 System.out.println(alert.getText());
		 String text=alert.getText();
		 if(text.equals("Please enter your password"))
		 {
			 System.out.println("correct alert msg");
		 }
		 else
		 {
			 System.out.println("in-correct msg alert");
		 }
		 alert.accept();
	}
}
