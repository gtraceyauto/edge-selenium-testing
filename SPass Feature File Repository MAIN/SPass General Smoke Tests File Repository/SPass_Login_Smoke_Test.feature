Feature: Test Statspass smoke login scenario

  Scenario: Test login and logout with valid credentials
    Given Open Chrome and start Statspass application
    When a valid username and password
    Then user should be able to login and logout successfully

  Scenario: Test Admin login and logout with valid credentials
    Given Statspass application is open
    When a user signs in with admin ID
    Then user should be able to login successfully
