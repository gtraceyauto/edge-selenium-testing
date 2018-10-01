Feature: Test EDGE smoke login and select competitions scenario

  Scenario: Test login with valid credentials  select competitions  and logout 
    Given Open Chrome on Windows and start Edge application
    When a valid username and password
    When each competition is selected
    Then the default team for the selected competition will be displayed
  	Then user should be able to login and logout successfully
 
# Order of competitions must be in this order in Auth0
#	201839
#	201849
#	201850
#   201868  
#   2018583 
#   2018108  
#   201872  
#   201888  
#   201895  
#   201898  
#   2018100  
#   201851  
#   201854  
#   201856   
#   201870 
#   201874   
#   201862