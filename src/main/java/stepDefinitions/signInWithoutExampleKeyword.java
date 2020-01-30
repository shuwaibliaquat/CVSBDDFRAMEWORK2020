package stepDefinitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signInWithoutExampleKeyword {
	
	WebDriver driver;
	
	@Given("^User is already on Home page without example keyword$")
	public void user_is_already_on_Home_page_without_example_keyword()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JavaLearner\\Desktop\\CvsPharmacyProject\\CvsBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cvs.com/");
	}
	

	@When("^title of  signin page1$")
	public void title_of_signin_page() {
	    String title = driver.getTitle();
	    System.out.println("Title Of the page is: " +title);
	    Assert.assertEquals("CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information", title);
	}

	@Then("^user click on signin link1$")
	public void user_click_on_signin_link()  {
		driver.findElement(By.xpath("//button[@id='signInBtn']")).click();	    
	}

	@Then("^user enters username and password1$")
	public void user_enters_username_and_password(DataTable credential)  {
	    
	    List<List<String>> data = credential.raw();
	    driver.findElement(By.xpath("//input[@id='clubLoginEmail']")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.xpath("//input[@id='clubLoginPwd']")).sendKeys(data.get(0).get(1));
	}

	@Then("^user click on signin button1$")
	public void user_click_on_signin_button() {
		driver.findElement(By.cssSelector("[form]")).click();	   
	}

	@Then("^user is successfully signed in1$")
	public void user_is_successfully_signed_in() throws Exception  {
		String title = driver.getTitle();
	    System.out.println("Title Of the page is: " +title);
	    Assert.assertEquals("CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information", title);
	    Thread.sleep(2000);
	    String username = driver.findElement(By.xpath("//li//p[text()=\"Welcome abdur!\"]")).getText();
	    System.out.println("Name of the user signed in: "+username);
	    Assert.assertEquals("Welcome abdur!", username);
	}
	
	@Then("^user search for items$")
	public void user_search_for_items(DataTable items) {
		
		List<List<String>> dataItem = items.raw();
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]")).sendKeys(dataItem.get(0).get(0));
		driver.findElement(By.xpath("//*[@id=\"flex-button-search\"]")).click();
		
	}
	
	@Then("^close the browser1$")
	public void close_the_browser() {
	  // driver.close();
	}

}
