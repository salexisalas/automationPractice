
@ShoppingCart
Feature: Shopping cart functionalities.
  As a user I should be able to add items to the shopping cart
  So I can buy Products
  
  @ORD7
	Scenario: User does not agree with Terms of service during the checkout
		Given User is on the Home Page
    When User adds an item to the shopping cart
    And User proceeds to checkout
    And User signs in with email "test800@hotmail.com" and password "test123"
    And User forgets to agree with the terms and services
    Then User should see the following error : "You must agree to the terms of service before continuing."

  @ORD1
  Scenario: User trying to checkout without logging in previously the page
    Given User is on the Home Page 
    When User adds an item to the shopping cart
    And User proceeds to checkout
    And User signs in with email "test800@hotmail.com" and password "test123"
    And User completes checkout
    Then User should recieve an order confirmation


