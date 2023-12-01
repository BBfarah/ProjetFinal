@Display
Feature: displaying the users page

  Background: LogIn
    Given user on login page
    When user enters mouna.makni@talan.com and Admin09$
    Then user is connected

  Scenario: Verify that list of user display
    When Administrator on userPage
    Then check that list of users displayed
