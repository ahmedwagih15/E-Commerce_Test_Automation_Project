@Testing
Feature: filter with color

  Background:
    Given user navigate to home page
    And user click on login
    When user enter valid Email and password
    And user click on login button
    Then user should login successfully and go to home page

  Scenario: user could filter with color
    Given user navigate to home page
    And user hover in categories
    And user hover in subcategories and click in one
    And user navigate to subcategory page
    When user choose the filter color
    Then user found all items in the chosen color

