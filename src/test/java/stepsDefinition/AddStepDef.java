package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddPage;

public class AddStepDef {
	 WebDriver driver = Hooks.driver ;
     AddPage addPage;
     
     @When("Administrator clicks on userbutton")
     public void administrator_clicks_on_userbutton() {
    	 addPage = new AddPage (driver);
    	 addPage.clickUsersButton();  
     }

     @And("Administrator clicks on the Add User button")
     public void administrator_clicks_on_the_add_user_button() {
    	 addPage.clickAddsButton();
         
     }
	@When("Enters BESBES and Farah and farah.besbes@talan.com")
	public void enters_besbes_and_farah_and_farah_besbes_talan_com() {
		addPage.enterUserDetails("BESBES", "Farah", "farah.besbes@talan.com");
	}
	@When("Clicks Role and clicks Mentor and clicks Cursus and clicks cursustest")
	public void clicks_role_and_clicks_mentor_and_clicks_cursus_and_clicks_cursustest() {
		addPage.selectRoleAndCursus();
	    
	}

	@And("Clicks on Save")
	public void clicks_on_save() {
	  addPage.clickSaveButton();
	}

	@Then("User is added")
	public void user_is_added() {
		String expectedText = "Au total, il y a 1222 utilisateurs.";
		String actualText = addPage.getTotalNbrUsers();
		assert actualText.contains(expectedText) : "the actual text does not contain the expected text";
	}

	@When("Enters {int} and {int} and farah.besbes@talan.com")
	public void enters_and_and_farah_besbes_talan_com(Integer int1, Integer int2) {
		addPage.enterUserDetails("1258", "52897", "farah.besbes@talan.com");
	}

	@Then("Adding the user2 fails")
	public void adding_the_user2_fails() {
		String expectedText2 = "Au total, il y a 1222 utilisateurs.";
		String actualText = addPage.getTotalNbrUsers();
		assert actualText.contains(expectedText2) : "the actual text does not contain the expected text";	
	}

	@When("Enters BESBES and Farah and farah.besbes.com")
	public void enters_besbes_and_farah_and_farah_besbes_com() {
		addPage.enterUserDetails("BESBES", "Farah", "farah.besbes.com");
	   
	}

	@Then("Adding the user3 fails")
	public void adding_the_user3_fails() {
		String expectedText3 = "Il faut saisir un email valide.";
		String actualText3 = addPage.getErreurMail();
		assert actualText3.contains(expectedText3) : "the actual text contain the expected text";
	}

	@When("Enters BARBOUCHE and Farah and farah.besbes@talan.com")
	public void enters_barbouche_and_farah_and_farah_besbes_talan_com() {
		addPage.enterUserDetails("BARBOUCHE", "Farah", "farah.besbes@talan.com");
	    
	}
	@And("Clicks RoleAdmin and clicks Admin")
	public void clicks_role_admin_and_clicks_admin() {
		addPage.selectRoleAdmin();
	    
	}

	@Then("Admin is added")
	public void admin_is_added() {
		String expectedText4 = "Au total, il y a 1222 utilisateurs.";
		String actualText = addPage.getTotalNbrUsers();
		assert actualText.contains(expectedText4) : "the actual text does not contain the expected text";
	   
	}


}
