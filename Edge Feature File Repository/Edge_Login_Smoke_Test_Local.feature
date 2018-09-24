Feature: Test EDGE smoke login scenario

  Scenario: Test login and logout with valid credentials
    Given Open Chrome and start Edge application
    When a valid username and password
    Then user should be able to login
    Then user should be able to logout successfully

  