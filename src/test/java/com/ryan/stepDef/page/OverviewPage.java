package com.ryan.stepDef.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverviewPage {
    By overview = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    protected WebDriver driver;

    public OverviewPage(WebDriver driver){
        this.driver = driver;
    }
    public void validateOnOverviewPage() {
        WebElement productElement = driver.findElement(overview);
        assertTrue(productElement.isDisplayed());
        assertEquals("Checkout: Overview", productElement.getText());
    }

}
