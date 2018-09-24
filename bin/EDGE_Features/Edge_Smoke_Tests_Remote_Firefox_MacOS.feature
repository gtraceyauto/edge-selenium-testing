Feature: Test Firefox browser on MacOS EDGE smoke login scenario

  Scenario: Test login and logout with valid credentials Firefox on MacOS
    
	Given Open Firefox on MacOS and start Edge application
    When a valid username and password
    Then user should be able to login
    Then user should be able to logout successfully
    Then remote browser will close
    
    
    