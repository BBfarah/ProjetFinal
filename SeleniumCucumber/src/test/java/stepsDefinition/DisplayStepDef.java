package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DisplayPage;

public class DisplayStepDef {
	WebDriver driver = Hooks.driver ;
	DisplayPage display;
	@When("Administrator on userPage")
	public void administrator_on_user_page() {
	   display = new DisplayPage (driver); 
	   display.ClickOnUser_Btn();
	}

	@Then("check that list of users displayed")
	public void check_that_list_of_users_displayed() {
	    display.CheckList();
	    display.CheckName();
	    display.CheckFirstname();
	    display.CheckMail();
	    display.CheckDate();
	    display.CheckRole();
	    display.CheckActif();
	    display.CheckActions();
	}


}
