
Feature: Testing Zip Code feature

  Background: Checkout Your Information
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When user in on homepage
    Then user click add to cart an item
    And user click the shopping cart icon
    And user click on checkout
    Then user is on checkout your information page


  Scenario: Submit valid zipcode
    Given user is on checkout your information page
    And user input firstName with "sugus"
    And user input lastName with "dori"
    And user input zipcode with "51542"
    And user click on continue
    Then user will be redirect to checkout overview page


  Scenario: Submit valid zipcode
    Given user is on checkout your information page
    And user input firstName with "sugus"
    And user input lastName with "dori"
    And user input zipcode with "42587"
    And user click on continue
    Then user will be redirect to checkout overview page
