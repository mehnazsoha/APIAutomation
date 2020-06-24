package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

// There should be one mapping implementation for each Gherkin line
// If the tidy gherkin plugin not available in future 
// Then we can generate the step definition file by run the testRunner file 
// And it will gave all the step definition code as output

@RunWith(Cucumber.class)
public class stepDefinition {
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		// write code here
		System.out.println("navigated to login url");
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		// write code here
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		// write code here
		System.out.println("validated home page");
	}

	@And("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are_something(String strArg1) throws Throwable {
		// write code here
		System.out.println(strArg1);
	}
}