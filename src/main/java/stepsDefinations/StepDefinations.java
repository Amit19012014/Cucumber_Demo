package stepsDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinations {



    @Given("the user is on the nopCommerce login page")
    public void the_user_is_on_the_nop_commerce_login_page() {

    }

    @When("the user enters valid credentials \\(username : {string} ,password: {string})")
    public void the_user_enters_valid_credentials_username_password(String username, String password) {

    }

    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {

    }

    @Then("the user should be redirected to the My Account Page")
    public void the_user_should_be_redirected_to_the_my_account_page() {

    }

    @Then("the user should see a welcome page.")
    public void the_user_should_see_a_welcome_page() {

    }
}
