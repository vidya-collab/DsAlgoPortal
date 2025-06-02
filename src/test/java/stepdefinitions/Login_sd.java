package stepdefinitions;

import pagefactory.Login_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.LoggerLoad;

public class Login_sd {
	Login_pf login =new  Login_pf(); 
	
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		LoggerLoad.info("User in on home page");
	    //System.out.println("User is on home page");
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	    login.GetStarted();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    LoggerLoad.info("User in on login page");
	}




}
