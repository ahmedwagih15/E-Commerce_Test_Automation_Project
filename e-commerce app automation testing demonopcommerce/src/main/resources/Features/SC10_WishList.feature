@Testing
Feature: add items to wishlist

  Background:
    Given user navigate to home page
    And user click on login
    When user enter valid Email and password
    And user click on login button
    Then user should login successfully and go to home page

  Scenario: user could add items to wishlist
    Given user click on wishlist button on specific item
    When user click on wishlist
    And user count numbers of quantities


