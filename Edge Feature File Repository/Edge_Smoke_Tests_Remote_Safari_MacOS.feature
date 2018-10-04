Feature: Test Safari browser on MacOS EDGE smoke test scenarios

  Scenario: Test login, competitions, modules, and logout with valid credentials via Safari on MacOS
    Given Open Safari on MacOS and start Edge application
    When a valid username and password
    When each competition is selected
    When each module is selected
    Then user should be able to login
    Then each module page opens
    Then user should be able to logout successfully
    
    