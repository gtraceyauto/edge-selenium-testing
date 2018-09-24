Feature: Test Safari browser on MacOS EDGE smoke login scenario

  Scenario: Test login and logout with valid credentials via Safari on MacOS
    Given Open Safari on MacOS and start Edge application
    When a valid username and password
    Then user should be able to login
    Then user should be able to logout successfully
    
    
    