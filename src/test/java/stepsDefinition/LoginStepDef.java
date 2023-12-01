package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {
	WebDriver driver = Hooks.driver ;
	LoginPage login ;
	@Given("user on login page")
	public void user_on_login_page() {
	    login = new LoginPage(driver);
	    driver.get("http://10.4.1.137/frontend");
	    login.clickConnexion();
	    
	}
 
	@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String email, String password) {
		login.credentials(email, password);
		login.Clicklogin();
	}
 
	@Then("user is connected")
	public void user_is_connected() {
	   
	}

}
