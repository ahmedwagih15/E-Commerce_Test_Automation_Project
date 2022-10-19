@Testing
Feature: search for any item by name

  Background:
    Given user navigate to home page
    And user click on login
    When user enter valid Email and password
    And user click on login button
    Then user should login successfully and go to home page

  Scenario: user can search for any item by name
    Given user navigate to home page
    When user click on search field
    And user search with Item name"book"
    And user click on search button
    Then user should find relative result

