package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Registration {
	
	WebDriver driver;
	
	@Given("^user is already on homepage$")
	public void user_is_already_on_homepage()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JavaLearner\\Desktop\\CvsPharmacyProject\\CvsBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cvs.com/");
	    
	}

	@Then("^user clicks on create an account link for registration$")
	public void user_clicks_on_create_an_account_link_for_registration() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create an Account')]")).click();
	}

	@Then("^user verifies title of the registration page$")
	public void user_verifies_title_of_the_registration_page() throws Exception {
		Thread.sleep(2000);
		String registrationPageTitle = driver.getTitle();
		Assert.assertEquals("Create Your CVS Account", registrationPageTitle);
	}

	@Then("^user enters in first step of registration \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_in_first_step_of_registration(String FirstName, String LastName, String EmailAddress, String Pwd, String CPwd,String Name) throws Exception{
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(EmailAddress);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pwd);
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys(CPwd);
		
		
		Thread.sleep(2000);
		
		// Drop Down Menu
				WebElement element = driver.findElement(By.xpath("//*[@id='securityQuestion']"));
				Select sel = new Select(element);
				sel.selectByVisibleText("What was the name of my childhood pet?");
				driver.findElement(By.xpath("//input[@id='securityAns']")).sendKeys(Name);
		
	}

	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		if (driver.findElement(By.xpath("//*[@id=\"continueAccount\"]")).isEnabled()) {
			driver.findElement(By.xpath("//*[@id=\"continueAccount\"]")).click();
			Thread.sleep(2000);
		} else {
			driver.findElement(By.xpath("//*[@id=\"continueAccount\"]")).click();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_2nd_step_of_registration(String streetAddress, String city, String State, String zipCode, String phoneNumber, String Month, String Day, String Year) throws Exception  {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='street']")).sendKeys(streetAddress);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		
		
		Thread.sleep(2000);
		WebElement RegState = driver.findElement(By.xpath("//select[@id='state']"));
		Select sel1 = new Select(RegState);
		sel1.selectByValue(State);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipCode);
		driver.findElement(By.xpath("//input[@id='phoneNum']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys(Month);
		driver.findElement(By.xpath("//input[@id='day']")).sendKeys(Day);
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys(Year);
	
	}

	@Then("^user select gender from drop down menu$")
	public void user_select_gender_from_drop_down_menu() throws Throwable {
		Thread.sleep(2000);
		WebElement RegGender = driver.findElement(By.xpath("//select[@id='gender']"));
		Select sel2 = new Select(RegGender);
		sel2.selectByVisibleText("Male");
	}

	@Then("^user click create account button to complete registration$")
	public void user_click_create_account_button_to_complete_registration() throws Throwable {
		driver.findElement(By.xpath("//form[@id='profileForm']/div[11]/div[@class='col-xs-12']")).click();
	}
	
	@Then("^close the registration browser$")
	public void close_the_registration_browser() {
	  // driver.close();
	}

}
