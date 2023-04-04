package com.ryan.stepDef.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YourInformationPage {
    WebDriver driver;
    By YourInfo = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By FirstName = By.xpath("//*[@id=\"first-name\"]");
    By LastName = By.xpath("//*[@id=\"last-name\"]");
    By ZipCode = By.xpath("//*[@id=\"postal-code\"]");
    By Continue = By.xpath("//*[@id=\"continue\"]");


    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void inputFirstName(String firstName){
        driver.findElement(FirstName).sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        driver.findElement(LastName).sendKeys(lastName);
    }
    public void inputZipCode(String zipCode){
        driver.findElement(ZipCode).sendKeys(zipCode);
    }
    public void continueButton(){
        driver.findElement(Continue).click();
    }
    public void validateOnYourInformation() {
        WebElement productElement = driver.findElement(YourInfo);
        assertTrue(productElement.isDisplayed());
        assertEquals("Checkout: Your Information", productElement.getText());
    }
    public void ValidateError(String errorMessage){
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
