Feature: Check login funtionality

  @smoke
  Scenario: 
    Given user is on login page
    When user enters valid sername ans password
    And cliks on login button
    Then user is navigatod to home page

  Scenario: 
    Given user is on login page
    When user enters valid sername ans password
    And cliks on login button
    Then user is navigatod to home page
