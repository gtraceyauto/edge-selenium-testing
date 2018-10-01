Feature: Test Chrome browser on Win10 EDGE smoke login scenario

  Scenario: Test login and logout with valid credentials via Chrome on Win10
    Given Open Chrome on Windows and start Edge application
    When a valid username and password
    When each competition is selected
    Then user should be able to login
    Then the default team for the selected competition will be displayed
    Then user should be able to logout successfully
 
   
    