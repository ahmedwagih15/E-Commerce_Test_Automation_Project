@Testing
Feature: registration user should be able to sign up with new accounts

  Scenario: user sign up with valid data
    Given user navigate to home page
    And user click on registration link
    When user fill Personal info with valid data and password
    And user click on on register button
    Then user register successfully