package Com.locators2;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class Holland_barret_create_account {
	public class DDT1 {
		WebDriver driver;
		String CSV_path = ".\\CSV_files_folder\\CSV_FILES_FOR_PROJECT.csv";

		@BeforeTest
		public void Setup() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Chrome_driver_jars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.hollandandbarrett.com/auth/signup");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
			
		}

		@Test
		public void locatorsTestingBlog() throws Exception {
			CSVReader reader = new CSVReader(new FileReader(CSV_path));
			String[] csvCell;
			while ((csvCell = reader.readNext()) != null) {
				String FName = csvCell[0];
				String LName = csvCell[1];
				String Email = csvCell[2];
				String CEmail = csvCell[3];
				String Cpass = csvCell[4];

				driver.findElement(By.name("First name")).sendKeys(FName);
				driver.findElement(By.name("Last name")).sendKeys(LName);
				driver.findElement(By.name("Email address")).sendKeys(Email);
				driver.findElement(By.name("Confirm email address")).sendKeys(CEmail);
				driver.findElement(By.name("Create a password")).sendKeys(Cpass);

				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/main/article/section/form/button")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
			}
			reader.close();

		}
		public void tearDown() {
			driver.quit();
		}
	}

}
