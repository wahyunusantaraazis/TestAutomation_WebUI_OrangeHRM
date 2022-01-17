package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class LoginSteps extends BaseTest {
    @Given("I am open login page orangeHRM")
    public void iAmOpenLoginPageOrangeHRM() {
        loginpage.open();
    }

    @When("I am enter valid username {string}")
    public void iAmEnterValidUsername(String username) {
        loginpage.inputusername(username);
    }

    @When("I am enter invalid username {string}")
    public void iAmEnterInvalidUsername(String username) {
        loginpage.inputusername(username);
    }

    @And("I am enter valid password {string}")
    public void iAmEnterValidPassword(String password) {
        loginpage.inputpassword(password);
    }

    @And("I am enter invalid password {string}")
    public void iAmEnterInvalidPassword(String password) {
        loginpage.inputpassword(password);
    }

    @And("I am click button Login")
    public void iAmClickButtonLogin() {
        loginpage.clickBtnLogin();
    }

    @Then("I am redirected to dashboard")
    public void iAmRedirectedToDashboard() {
        loginpage.validateDashboardName();
    }

    @Then("I am accept error message {string}")
    public void iAmAcceptErrorMessage(String message) {
        loginpage.validateErrorMessage(message);
    }

    @When("Should display the following fields and button links in the window")
    public void shouldDisplayTheFollowingFieldsAndButtonLinksInTheWindow() {
    }

    @Then("Verify username field is visible")
    public void verifyUsernameFieldIsVisible() {
        loginpage.verifyFieldUsername();
    }

    @And("Verify password field is visible")
    public void verifyPasswordFieldIsVisible() {
        loginpage.verifyFieldPassword();
    }

    @And("Verify login button is enable")
    public void verifyLoginButtonIsEnable() {
        loginpage.verifyButtonLogin();
    }

    @And("Verify Forgot your password? link is visible")
    public void verifyForgotYourPasswordLinkIsVisible() {
        loginpage.verifyLinkForgotPassword();
    }

}
