# Go to Campus
#  log in
# Enter username and password
# Click on Set up
# Click on Parameter
  #Click on  countries
  #Click on add button
  #fill the form
  #click on save button
  #assert that you see success message

  Feature: Country Functionality
    As a user I want to be able to create,delete and update countries
  so that I can update the country list

  Scenario:
    Given Navigate to Campus
    When Enter username and password
    And Click on login button
    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed