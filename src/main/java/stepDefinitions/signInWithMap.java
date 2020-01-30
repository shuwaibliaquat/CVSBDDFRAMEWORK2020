package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class signInWithMap {
	WebDriver driver;

	@Given("^User is already on Home page3$")
	public void user_is_already_on_Home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JavaLearner\\Desktop\\CvsPharmacyProject\\CvsBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cvs.com/");

	}

	@Then("^user enter username and password$")
	public void user_enters_username_and_password(DataTable credential) throws Exception {

		

		for (Map<String, String> data : credential.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//button[@id='signInBtn']")).click();
			driver.findElement(By.xpath("//input[@id='clubLoginEmail']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@id='clubLoginPwd']")).sendKeys(data.get("password"));
			driver.findElement(By.cssSelector("[form]")).click();

			Thread.sleep(2000);
			String title = driver.getTitle();
			System.out.println(title);
			/*
			 * String username =
			 * driver.findElement(By.xpath("//li//p[text()=\"Welcome abdur!\"]")).getText();
			 * System.out.println("Name of the user signed in: "+username);
			 * Assert.assertEquals("Welcome abdur!", username);
			 */
			driver.findElement(By.xpath("//button[@value='custom:home:header:sign out link']")).click();
			driver.findElement(
					By.xpath("//div[@id='head1']/div[@class='head-c2']//a[@href='/?icid=cvsheader:cvslogo']")).click();
			driver.manage().deleteAllCookies();
		}
	}
}
