@Testing
Feature: select different tags

  Background:
    Given user navigate to home page
    And user click on login
    When user enter valid Email and password
    And user click on login button
    Then user should login successfully and go to home page

  Scenario: user could select different tags
    Given user navigate to home page
    And user hover in categories
    And user hover in subcategories and click in one
    When user could select item with Tag
    Then user navigate to Tag page