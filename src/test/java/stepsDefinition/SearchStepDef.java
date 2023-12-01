package stepsDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchStepDef {
	WebDriver driver = Hooks.driver ;
	SearchPage search = new SearchPage (driver);
 
	
	@When("Administrator clicks on users button")
	public void administrator_clicks_on_users_button() {
		search.clickOnUsersButton();

	}

	@And("Administrator enters the name AYARI in the search field")
	public void administrator_enters_the_name_ayari_in_the_search_field() {
	        search.enterNameInSearchField("AYARI");
	
	}

	@Then("display the user list filtered by name")
	public void display_the_user_list_filtered_by_name() {
		String userListText = search.getUserListText();
		assertTrue("The name should be displayed in the user list", userListText.contains("AYARI"));
	}

	@When("Administrator enters the firtname Asma in the search field")
	public void administrator_enters_the_firtname_asma_in_the_search_field() {
	 search.enterNameInSearchField("Asma");
	}

	@Then("display the user list filtered by firstname")
	public void display_the_user_list_filtered_by_firstname() {
		String userListText = search.getUserListText2("Asma");
        assertTrue("The firstname should be displayed in the user list", userListText.contains("Asma"));

	}

	@When("Administrator enters the mail asmaayari@gmail.com in the search field")
	public void administrator_enters_the_mail_asmaayari_gmail_com_in_the_search_field() {
		 search.enterEmailInSearchField("asmaayari@gmail.com");
	}

	@Then("display the user list filtered by mail")
	public void display_the_user_list_filtered_by_mail() {
		 String userListText = search.getUserListText3("asmaayari@gmail.com");
	        assertTrue("The email should be displayed in the user list", userListText.contains("asmaayari@gmail.com"));
	}

	@When("Administrator enters the letter Z in the search field")
	public void administrator_enters_the_letter_z_in_the_search_field() {
		 search.enterLetterInSearchField("Z");
	}

	@Then("display the user list filtered by letter")
	public void display_the_user_list_filtered_by_letter() {
		String userListText = search.getUserListText4("Z");
        assertTrue("The letter should be displayed in the user list", userListText.contains("Z"));
	}

	@When("Administrator moves to another page")
	public void administrator_moves_to_another_page() {
		search.clickOnLASTPageButton();
	}
	
	@Then("display the user list filtered by username")
	public void display_the_user_list_filtered_by_username() {
		String PredictedTxt = "AYARI";
		String currentTxt = search.getUserListText5();
		assert currentTxt.contains(PredictedTxt) : "the current text  contain the predicted text";
	    
	}

}
