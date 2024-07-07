package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	    System.out.println(">> User navigates to register account page");
	}

	@When("User enters firstname {string} into the First name field")
	public void user_enters_firstname_into_the_first_name_field(String firstName) {
		System.out.println(">> User enters first name : " + firstName);
	}

	@When("Enters lastname {string} into the lastname field")
	public void enters_lastname_into_the_lastname_field(String lastName) {
		System.out.println(">> User enters last name : " + lastName);
	}

	@When("Enters email address {string} into the email field")
	public void enters_email_address_into_the_email_field(String emailText) {
		System.out.println(">> User enters email : " + emailText);
	}

	@When("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String telephoneNum) {
		System.out.println(">> User enters telephone : " + telephoneNum);
	}

	@When("Enters Password {string} into the password field")
	public void enters_password_into_the_password_field(String passwordText) {
		System.out.println(">> User enters password  : " + passwordText);
	}

	@When("Selects Provacy policy field")
	public void selects_provacy_policy_field() {
		System.out.println(">> User selects privacy policy");
	}

	@When("Clicks on continue button")
	public void clicks_on_continue_button() {
		System.out.println(">> User clicks on continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println(">> User successfully creates Account");
	}

	@When("Enters Password {string} into the password confirm field")
	public void enters_password_into_the_password_confirm_field(String confirmpasswordText) {
		System.out.println(">> User enters confirm password  : " + confirmpasswordText);
	}

	@When("Selects Yes for newsLetter")
	public void selects_yes_for_news_letter() {
		System.out.println(">> User selects yes for newsletter");
	}

	@When("User dont enter details to any fields")
	public void user_dont_enter_details_to_any_fields() {
		System.out.println(">> User dont enter any details to any fields");
	}

	@Then("Warning messages should be displayed under all the mandatory fields")
	public void warning_messages_should_be_displayed_under_all_the_mandatory_fields() {
		System.out.println(">> Warning messages displayed");
	}
}
