package tests;

import io.cucumber.java.en.*;

public class Login {
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
		System.out.println(">>User got navigated to login Page");
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String emailAddressText) {
		System.out.println(">>User enters valid email address" + emailAddressText);
	}

	@When("enters valid password {string}")
	public void enters_valid_password(String passwordText) {
		System.out.println(">>User enters valid password" + passwordText);
	}

	@When("clicks on Login button")
	public void clicls_on_login_button() {
		System.out.println(">>User clicks on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println(">>User logins successfully");
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidemailAddressText) {
		System.out.println(">>User enters invalid email address" + invalidemailAddressText);
	}

	@When("enters invalid password {string}")
	public void enters_invalid_password(String invalidpasswordText) {
		System.out.println(">>User enters invalid password" + invalidpasswordText);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println(">>User gets warning message");
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
		System.out.println(">>User dont enter any credentials");
	}

}
