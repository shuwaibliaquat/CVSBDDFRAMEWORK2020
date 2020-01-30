package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class SignInStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on Home page$")
	public void user_is_already_on_Home_page()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JavaLearner\\Desktop\\CvsPharmacyProject\\CvsBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cvs.com/");
	    
	}

	
	@When("^title of  signin page$")
	public void title_of_signin_page() {
	    String title = driver.getTitle();
	    System.out.println("Title Of the page is: " +title);
	    Assert.assertEquals("CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information", title);
	}

	@Then("^user click on signin link$")
	public void user_click_on_signin_link()  {
		driver.findElement(By.xpath("//button[@id='signInBtn']")).click();	    
	}

	//Providing username and password here
	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
		driver.findElement(By.xpath("//input[@id='clubLoginEmail']")).sendKeys("abdurrahman@gmail.com");
		driver.findElement(By.xpath("//input[@id='clubLoginPwd']")).sendKeys("hhb12345");
	    
	}
	
	//Provided username and password in feature file
	//Scenario Outline with Example Keyword  
	/*@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password)  {
		driver.findElement(By.xpath("//input[@id='clubLoginEmail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='clubLoginPwd']")).sendKeys(password);
	    
	}*/
	@Then("^user click on signin button$")
	public void user_click_on_signin_button() {
		driver.findElement(By.cssSelector("[form]")).click();	   
	}

	@Then("^user is successfully signed in$")
	public void user_is_successfully_signed_in() throws Exception  {
		String title = driver.getTitle();
	    System.out.println("Title Of the page is: " +title);
	    Assert.assertEquals("CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information", title);
	    Thread.sleep(2000);
	    String username = driver.findElement(By.xpath("//li//p[text()=\"Welcome abdur!\"]")).getText();
	    System.out.println("Name of the user signed in: "+username);
	    Assert.assertEquals("Welcome abdur!", username);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
	   driver.close();
	}

}
