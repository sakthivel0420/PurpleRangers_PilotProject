package com.StepDefinition;

import org.testng.Assert;

import com.actions.LoginActions;
import com.utility.Helper_Class;
import com.utility.properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	LoginActions LA = new LoginActions();
	properties pro = new properties();
	
	@Given("user is in the home page of sportsjam")
	public void user_is_in_the_home_page_of_sportsjam() {
	    Helper_Class.openPage(pro.url);
//	    HelperClass.log.info("User is in the home page.");

		
	}

	@Given("User clicks the log in button")
	public void user_clicks_the_log_in_button() {
		LA.clickSignIn();
	}

	@When("User gives valid email")
	public void user_gives_valid_email() {
		LA.setemail(pro.vaild_email);
	}

	@When("User gives valid password")
	public void user_gives_valid_password() {
		LA.setpass(pro.valid_pass);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		LA.signButton();
	}

	@Then("User is shown looged in to the website")
	public void user_is_shown_looged_in_to_the_website() {
		Assert.assertTrue(LA.getVerifyText2().contains("Logout"));
	}

	@When("User gives Invalid email")
	public void user_gives_invalid_email() {
		LA.setemail(pro.Invalid_email);
	}

	@When("User gives Invalid password")
	public void user_gives_invalid_password() {
		LA.setpass(pro.Invalid_pass);
	}

	@Then("User is shown No customer account found message")
	public void user_is_shown_no_customer_account_found_message() {
		Assert.assertTrue(LA.getVerifyText1().contains("There is no account existing with the details mentioned by you."));
	}

	@When("User clicks the forrgot password button")
	public void user_clicks_the_forrgot_password_button() {
		LA.ForgorPass();
	}@When("User gives valid emailid")
	public void user_gives_valid_emailid() {
		LA.username(pro.vaild_email);
	}

	@When("the user clicks submit")
	public void the_user_clicks_submit() {
		LA.submit();
	}

	@Then("a pop is shown with a message sucessfully sent recovery email")
	public void a_pop_is_shown_with_a_message_sucessfully_sent_recovery_email() {
		Assert.assertTrue(LA.getVerifyText().contains("Successfully sent the password reset link To the registered email."));
	}


}
