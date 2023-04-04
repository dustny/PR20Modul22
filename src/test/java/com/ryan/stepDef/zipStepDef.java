package com.ryan.stepDef;

import Test.baseTest;
import com.ryan.stepDef.page.OverviewPage;
import com.ryan.stepDef.page.YourInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class zipStepDef extends baseTest {
    YourInformationPage  yourInformationPage;
    OverviewPage overviewPage;

    @And("user input firstName with {string}")
    public void userInputFirstNameWith(String firstName) {
        yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.inputFirstName(firstName);
    }

    @And("user input lastName with {string}")
    public void userInputLastNameWith(String lastName) {
        yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.inputLastName(lastName);

    }

    @And("user input zipcode with {string}")
    public void userInputZipcodeWith(String zipCode) {
        yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.inputZipCode(zipCode);
    }

    @And("user click on continue")
    public void userClickOnContinue() {
        yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.continueButton();
    }

    @Then("user will be redirect to checkout overview page")
    public void userWillBeRedirectToCheckoutOverviewPage() {
        overviewPage = new OverviewPage(driver);
        overviewPage.validateOnOverviewPage();
    }

    @Then("user will get an error message {string}")
    public void userWillGetAnErrorMessage(String errorMessage) {
        yourInformationPage = new YourInformationPage(driver);
        assertTrue(driver.getPageSource().contains(errorMessage));
    }

}

