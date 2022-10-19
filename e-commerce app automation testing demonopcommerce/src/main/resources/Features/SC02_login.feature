@Testing
Feature: user should be able to login to the system

  Scenario: user login with valid username and password
    Given user navigate to home page
    And user click on login
    When user enter valid Email and password
    And user click on login button
    Then user should login successfully and go to home page
