@CreateAccount
Feature: Create New Account
  As a new user I should be able to create a new account

  @ValidCredentials
  Scenario: User should be able to create an account entering required fields
    Given User enters valid email "fermin_ride@hotmail.com" on login page and clicks on create account button
    When User enters firstName "Fermin"
    And User enters lastName "Mireles"
    And Email is filled with previous email "fermin_ride@hotmail.com" from login page
    And User enters a password "mypassw0rd"
    And nameAddress "Fermin" is filled with the name entered in previous textbox
    And lastNameAddress "Mireles" in addresses is filled with the last name entered in previous textbox
    And User enters address "2860 Landmark dr."
    And User enters city "Marietta"
    And User enters state "Georgia"
    And User enters zipCode "34132"
    And User enters country "United States"
    And User enters mobile "8114231254"
    And User enters addressAlias "Home"
    And User clicks on register button
    Then User should by redirected to my account page
    
    @BlankRequiredField
  Scenario: User should not be able to create an account if required fields are empty
    Given User enters valid email "fermi_ride@hotmail.com" on login page and clicks on create account button
    When User enters firstName ""
    And User enters lastName "Mireles"
    And Email is filled with previous email "fermin_ride@hotmail.com" from login page
    And User enters a password "mypassw0rd"
    And nameAddress "Fermin" is filled with the name entered in previous textbox
    And lastNameAddress "Mireles" in addresses is filled with the last name entered in previous textbox
    And User enters address "2860 Landmark dr."
    And User enters city "Marietta"
    And User enters state "Georgia"
    And User enters zipCode "34132"
    And User enters country "United States"
    And User enters mobile "8114231254"
    And User enters addressAlias "Home"
    And User clicks on register button
    Then User should not advance to my account page