package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {

	@Given("open the demo website")
	public void open_the_demo_website() {
	    System.out.println("Hi");
	}

	@Then("enter userid {string} and password {string}")
	public void enter_userid_and_password(String string, String string2) {
	    System.out.println("Login");
	}

	@Then("click on logout")
	public void click_on_logout() {
	   System.out.println("Logout");
	}
}
