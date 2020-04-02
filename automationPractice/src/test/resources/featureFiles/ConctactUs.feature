@ContactUs
Feature: This is the contact us functionality

  @CompleteForm
  Scenario: User fills completely the contact us form and sends is
    Given User is on ContactUs page
    When User fills the entire form
    And User clicks on send button
    Then User should see confirmation message "Your message has been successfully sent to our team."

  @BlankForm
  Scenario: User tries to send a blank contact us form
    Given User is on ContactUs page
    When User clicks on send button
    Then User should see error message "Invalid email address."

    