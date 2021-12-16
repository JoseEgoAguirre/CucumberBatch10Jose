package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {


    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        LoginPage login = new LoginPage();
        sendText(login.usernameBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordBox, ConfigReader.getPropertyValue("password"));
        click(login.loginBtn);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        LoginPage login = new LoginPage();
        click(login.loginBtn);
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        DashboardPage dash=new DashboardPage();
        Assert.assertTrue(dash.welcomeMessage.isDisplayed());

    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        LoginPage login = new LoginPage();
        sendText(login.usernameBox, "johnny1234560000");
        sendText(login.passwordBox, "Syntax1253!!!!");

    }

    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
        DashboardPage dash=new DashboardPage();
        Assert.assertTrue(dash.welcomeMessage.isDisplayed());

    }

    @When("user enters valid username and invalid password")
    public void user_enters_valid_username_and_invalid_password() {
        LoginPage login = new LoginPage();
        sendText(login.usernameBox, "Admin");
        sendText(login.passwordBox, "Syntax1253!!!!");
    }

    @Then("user see invalid credentials message on login page")
    public void user_see_invalid_credentials_message_on_login_page() {
        LoginPage login=new LoginPage();
        Assert.assertTrue(login.errorMessage.isDisplayed());
    }


}
