package StepDefination;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javaFunctionality.Merchante_User_Functionality;

public class Merchante_User_StepDef {
	Merchante_User_Functionality MerchteUser;

	public Merchante_User_StepDef(TestContext context) {
		MerchteUser = new Merchante_User_Functionality(context);
	}

	@Given("user Lauch the application url {string} and verfiy page title")
	public void user_lauch_the_application_url_and_verfiy_page_title(String url) {
		MerchteUser.lauchURl(url);
		MerchteUser.landingpage();
	}

@And("user click on user button")
public void user_click_on_user_button() {
	MerchteUser.User_Menu_click();
}

@And("user click on new user button")
public void user_click_on_new_user_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter the details and click on create user button")
public void user_enter_the_details_and_click_on_create_user_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user see the success message and details on the page")
public void user_see_the_success_message_and_details_on_the_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
