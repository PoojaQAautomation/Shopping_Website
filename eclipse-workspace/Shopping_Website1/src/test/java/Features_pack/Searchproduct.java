package Features_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchproduct {

	WebDriver driver;
	
//	public static void main(String[] args) {
		
		@Given("I Visit the Website as a guest user")
		public void i_visit_the_website_as_a_guest_user() {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
		  System.out.println("hello passed");		    
		}

		@When("I enter product in search bar")
		public void i_enter_product_in_search_bar() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@When("I search the product")
		public void i_search_the_product() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("user should be able to see product")
		public void user_should_be_able_to_see_product() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

	

}
		


