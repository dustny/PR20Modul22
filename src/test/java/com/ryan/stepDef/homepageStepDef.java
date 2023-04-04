package com.ryan.stepDef;

import Test.baseTest;
import com.ryan.stepDef.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class homepageStepDef extends baseTest {
    HomePage homePage;
    @Then("user in on homepage")
    public void userInOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();

    }


}
