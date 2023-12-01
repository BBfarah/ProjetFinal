@Add
Feature: As an administrator I want to add a user to the list of users

  Background: LogIn
    Given user on login page
    When user enters mouna.makni@talan.com and Admin09$
    Then user is connected

  @AddUser
  Scenario Outline: Add a new user to the list of users
    When Administrator clicks on userbutton
    And Administrator clicks on the Add User button
    And Enters <name> and <firstname> and <email>
    And Clicks Role and clicks Mentor and clicks Cursus and clicks cursustest
    And Clicks on Save
    Then User is added

    Examples: 
      | name   | firstname | email                  |
      | BESBES | Farah     | farah.besbes@talan.com |

  @AddUser2
  Scenario Outline: Verify adding a user with incorrect first and last names
    When Administrator clicks on userbutton
    And Administrator clicks on the Add User button
    And Enters <name> and <firstname> and <email>
    And Clicks Role and clicks Mentor and clicks Cursus and clicks cursustest
    And Clicks on Save
    Then Adding the user2 fails

    Examples: 
      | name | firstname | email                  |
      | 1258 |     52897 | farah.besbes@talan.com |

  @AddUser3
  Scenario Outline: Verify adding a user with an incorrect email format
    When Administrator clicks on userbutton
    And Administrator clicks on the Add User button
    And Enters <name> and <firstname> and <email>
    And Clicks Role and clicks Mentor and clicks Cursus and clicks cursustest
    And Clicks on Save
    Then Adding the user3 fails

    Examples: 
      | name   | firstname | email            |
      | BESBES | Farah     | farah.besbes.com |

  @AddAdmin
  Scenario Outline: Verify adding a new Admin user
    When Administrator clicks on userbutton
    And Administrator clicks on the Add User button
    And Enters <name> and <firstname> and <email>
    And Clicks RoleAdmin and clicks Admin
    And Clicks on Save
    Then Admin is added

    Examples: 
      | name      | firstname | email                  |
      | BARBOUCHE | Farah     | farah.besbes@talan.com |
