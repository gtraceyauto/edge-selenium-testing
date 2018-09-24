Feature: Test Pro2 smoke login scenario

  Scenario: Test login and logout with valid credentials
    Given Open Chrome and start ProTwo application
    When a valid username and password
    Then user should be able to login and logout successfully

  