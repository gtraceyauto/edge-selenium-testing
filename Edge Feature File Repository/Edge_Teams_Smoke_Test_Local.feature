Feature: Test EDGE smoke login and select competitions and teams scenario

  Scenario: Test login with valid credentials  select competitions select teams  and logout 
    Given Open Chrome on Windows and start Edge application
    When a valid username and password
    When each team is selected from EPL
    When each team is selected from Bundesliga
    When each team is selected from England Championship
    When each team is selected from France LFP
    When each team is selected from UAE
    When each team is selected from Scotland
    When each team is selected from League Two
    When each team is selected from League One
    When each team is selected from PSL
    When each team is selected from QSL
    When each team is selected from Serie A
    When each team is selected from Spain LaLiga
    When each team is selected from Argentina
    When each team is selected from Dutch
    When each team is selected from Belgium
    When each team is selected from World Cup
    Then the default team for the selected competition will be displayed
    Then the selected team data will be displayed
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