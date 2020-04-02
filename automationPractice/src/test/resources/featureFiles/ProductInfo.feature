@ProductInfo
Feature: Product Info Page
  As a user I should be able to interact with the different elements of the page

  @PRODUCT01
  Scenario: User fills the form correctly
    Given User clicks on Send to a page link
    When User enters a name of a friend "Salomon" and a email of a friend "sfernando98@hotmail.com"
    And User clicks on send to friend button
    Then User should see email sent confirmation

	 @PRODUCT02
  Scenario: User leaves blank the form
    Given User clicks on Send to a page link
    And User clicks on send button with fields in blank
    Then Page should ask user to fill all required fields