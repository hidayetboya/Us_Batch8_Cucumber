Feature: Login Functionality
  As a user I want to bi able to login with my valid credentials
  so I can reach my info
  Scenario: Login with valid username and password
    Given Navigate to Campus
    And Enter username and password
    When Click on login button
    Then User should login succesfully
