@Login
Feature: Login functionality
  as a user
  i want to login on orangeHRM
  so that i can see my account

  #TC_1
  Scenario: Check for the fields/buttons displayed in Sign In Page
    Given I am open login page orangeHRM
    When Should display the following fields and button links in the window
    Then Verify username field is visible
    And Verify password field is visible
    And Verify login button is enable
    And Verify Forgot your password? link is visible

  #TC_2
  Scenario: User enter valid username and password
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am enter valid password "admin123"
    And I am click button Login
    Then I am redirected to dashboard

  #TC_3
  Scenario: User enter invalid Username and valid Password
    Given I am open login page orangeHRM
    When I am enter invalid username "bukanusername"
    And I am enter valid password "admin123"
    And I am click button Login
    Then I am accept error message "Invalid credentials"

  #TC_4
  Scenario: User enter valid Username and invalid Password
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am enter invalid password "bukanpassword"
    And I am click button Login
    Then I am accept error message "Invalid credentials"

  #TC_5
  Scenario Outline: User enter invalid Username and invalid Password
    Given I am open login page orangeHRM
    When I am enter invalid username "<username>"
    And I am enter invalid password "<password>"
    And I am click button Login
    Then I am accept error message "Invalid credentials"
    Examples:
      | username | password |
      | iniadmin | inipass  |
      | bknadmin | bknpass  |

  #TC_6
  Scenario: User blank Username and Password field
    Given I am open login page orangeHRM
    When I am click button Login
    Then I am accept error message "Username cannot be empty"

  #TC_7
  Scenario: User enter valid Username and blank Password field
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am click button Login
    Then I am accept error message "Password cannot be empty"

  #TC_8
  Scenario: User blank Username field and enter valid Password
    Given I am open login page orangeHRM
    When I am enter valid password "admin123"
    And I am click button Login
    Then I am accept error message "Username cannot be empty"