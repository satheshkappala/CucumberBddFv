Feature: check login functionality

  Background: 
    Given user is logged in
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick lauch toolbar is present
    When user click on dashboard link
    Then quick launch toolbar is displayed
