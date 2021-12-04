@Login
Feature: Login functionalitiy
  as a user
  i want to login on orangeHRM
  so that i can see my account

  #TC_1 Login Success
  Scenario: login with my valid username and password
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am enter valid password "admin123"
    And I am click button Login
    Then I am redirected to dashboard

  #TC_2 Login Failed
  Scenario: login with invalid username and valid password
    Given I am open login page orangeHRM
    When I am enter invalid username "bukanusername"
    And I am enter valid password "admin123"
    And I am click button Login
    Then I am accept error message invalid credentials

  #TC_3 Login Failed
  Scenario: login with valid username and invalid password
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am enter invalid password "bukanpassword"
    And I am click button Login
    Then I am accept error message invalid credentials

  #TC_4 Login Failed with scenario outline
  @loginscenariooutline
  Scenario Outline: login with invalid username and invalid password
    Given I am open login page orangeHRM
    When I am enter invalid username "<username>"
    And I am enter invalid password "<password>"
    And I am click button Login
    Then I am accept error message invalid credentials
    Examples:
      | username | password |
      | iniadmin | inipass  |
      | bknadmin | bknpass  |

  #TC_5 Login Failed
  Scenario: login with empty username and valid password
    Given I am open login page orangeHRM
    When I am enter valid password "admin123"
    And I am click button Login
    Then I am accept error message username cannot be empty

  #TC_6 Login Failed
  Scenario: login with valid username and empty password
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am click button Login
    Then I am accept error message password cannot be empty

  #TC_7 Login Failed
  Scenario: login with empty username and password
    Given I am open login page orangeHRM
    When I am click button Login
    Then I am accept error message username cannot be empty