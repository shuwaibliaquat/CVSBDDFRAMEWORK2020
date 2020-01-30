package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTagging {
	WebDriver driver;
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JavaLearner\\Desktop\\CvsPharmacyProject\\CvsBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cvs.com/");
	}

	@After
	public void afterScenario() {
		driver.close();
		System.out.println("Testing Finished");
		System.out.println("This will run after the Scenario");
	}

	@Given("^user verifies homepage title$")
	public void user_verifies_homepage_title() {

		String homePagetitle = driver.getTitle();
		System.out.println(homePagetitle);

	}

	@Given("^clicked successfully on pharmacy link$")
	public void clicked_successfully_on_pharmacy_link() throws Exception {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Pharmacy']")).click();
		 String pharmacyPagetitle = driver.getTitle();
		 System.out.println(pharmacyPagetitle);
		driver.navigate().back();
	}

	@Then("^clicked successfully on minute clinic link$")
	public void clicked_successfully_on_minute_clinic_link() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='MinuteClinic']")).click();
		String minuteClinicPagetitle = driver.getTitle();
		System.out.println(minuteClinicPagetitle);
		driver.navigate().back();
	}

	@Given("^clicked successfully on shop link$")
	public void clicked_successfully_on_shop_link() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Shop']")).click();
		String shopPagetitle = driver.getTitle();
		System.out.println(shopPagetitle);
		driver.navigate().back();
	}

	@Given("^clicked successfully on extracare link$")
	public void clicked_successfully_on_extracare_link() {
		driver.findElement(By.xpath("//a[@title='ExtraCare']")).click();
		String extraCarePagetitle = driver.getTitle();
		System.out.println(extraCarePagetitle);
		driver.navigate().back();
	}

	@Given("^clicked successfully on contact lenses$")
	public void clicked_successfully_on_contact_lenses() {
		driver.findElement(By.xpath("//a[@title='Contact Lenses']")).click();
		String contactLensesPagetitle = driver.getTitle();
		System.out.println(contactLensesPagetitle);
		driver.navigate().back();
	}

	@Given("^clicked successfully on photo link$")
	public void clicked_successfully_on_photo_link() {
		driver.findElement(By.xpath("//a[@title='CVS Photo']")).click();
		String photoPagetitle = driver.getTitle();
		System.out.println(photoPagetitle);
		driver.navigate().back();
	}



}
