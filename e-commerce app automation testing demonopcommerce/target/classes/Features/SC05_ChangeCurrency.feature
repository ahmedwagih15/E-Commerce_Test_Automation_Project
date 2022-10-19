@Testing
Feature: switch between currencies US-Euro

  Background:
    Given user navigate to home page
    And user click on login
    When user enter valid Email and password
    And user click on login button
    Then user should login successfully and go to home page

  Scenario: User could switch between currencies US-Euro
    Given user navigate to home page
    When user click on the currency list
    And user change currency to Euro
    Then user found all prices in Euro
    When user click on the currency list
    And user change currency to dollar
    Then user found all prices in dollar