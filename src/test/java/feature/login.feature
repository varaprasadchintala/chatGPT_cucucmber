#Feature: Login with Valid Credentials
#
#  @sanity @regression
#  Scenario: Successful Login with Valid Credentials
#    Given the user navigates to login page
#    When user enters email as "pavanoltraining@gmail.com" and password as "test@123"
#    And the user clicks on the Login button
#    Then the user should be redirected to the MyAccount Page
#
#  @regression
#  Scenario Outline: Login Data Driven
#    Given the user navigates to login page
#    When user enters email as "<email>" and password as "<password>"
#    And the user clicks on the Login button
#    Then the user should be redirected to the MyAccount Page
@smoke
Feature: Login Functionality

  Scenario Outline: Successful Login
    Given I open the login page
    When I enter username "<username>" and password "<password>"
    And I click on the login button
    Then I should see the login result as "<result>"
    And I should be redirected to the user account page if login is successful

    Examples:
      | username         | password | result           |
      | user1@example.com | password1 | Login successful |
      | user2@example.com | password2 | Login successful |
      | user3@example.com | password3 | Login failed     |

  @sanity
  Scenario: Login with Specific User Credentials
    Given I open the login page
    When I enter username "pavanol@gmail.com" and password "test123"
    And I click on the login button
    Then I should see the login result as "Login successful"
    And I should be redirected to the user account page if login is successful

    #Feature: Login Functionality
#
#  Scenario: Successful login with valid credentials
#    Given user is on login page
#    When user enters valid email "test@example.com"
#    When user enters valid password "password123"
#    When user clicks on login button
#    Then user is navigated to the account page