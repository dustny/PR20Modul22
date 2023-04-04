package com.ryan.stepDef;

import Test.baseTest;
import com.ryan.stepDef.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class cartItem extends baseTest {
        protected HomePage homePage;


        @Then("user click add to cart an item")
        public void userClickAddToCartAnItem(){
            homePage = new HomePage(driver);
            homePage.addItemToChart();

        }
        @And("user click the shopping cart icon")
        public void userClickTheShoppingCartIcon() {
            homePage = new HomePage(driver);
            homePage.iconCart();
        }

    @And("user click on checkout")
    public void userClickOnCheckout() {
        homePage = new HomePage(driver);
        homePage.checkoutItem();

    }
}

