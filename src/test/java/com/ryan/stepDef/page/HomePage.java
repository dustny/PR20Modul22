package com.ryan.stepDef.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class HomePage{
    WebDriver driver;
    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By addToCart = By.cssSelector("button#add-to-cart-sauce-labs-backpack");
    By cartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    By checkout = By.id("checkout");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
    public void addItemToChart(){
        driver.findElement(addToCart).click();
    }
    public void iconCart(){
        driver.findElement(cartIcon).click();
    }
    public void checkoutItem(){
        driver.findElement(checkout).click();
    }
}
