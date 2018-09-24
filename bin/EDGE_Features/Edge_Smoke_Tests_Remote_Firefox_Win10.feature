Feature: Test Firefox browser on Win10 EDGE smoke login scenario

  Scenario: Test login and logout with valid credentials via Firefox on Win10
    Given Open Firefox on Windows and start Edge application
    When a valid username and password
    Then user should be able to login
    Then user should be able to logout successfully
    
    
    