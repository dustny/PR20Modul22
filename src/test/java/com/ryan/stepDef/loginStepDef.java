package com.ryan.stepDef;

import Test.baseTest;
import com.ryan.stepDef.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class loginStepDef extends baseTest {
    LoginPage loginPage;




    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage = new LoginPage(driver);
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage = new LoginPage(driver);
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }



    @Then("user get an error message {string}")
    public void userGetAnErrorMessage(String errorMessage) {
        loginPage = new LoginPage(driver);
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
