package com.ryan.stepDef.page;
import Test.baseTest;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class YourInformationPageStepDef extends baseTest {
    YourInformationPage yourInformationPage;
    @Then("user is on checkout your information page")
    public void userIsOnCheckoutYourInformationPage() {
        yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.validateOnYourInformation();

    }
}
