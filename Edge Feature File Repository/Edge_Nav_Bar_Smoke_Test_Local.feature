Feature: Edge smoke test to select and verify each module scenario

  Scenario: Test that each module can be selected and the pages populate 
    Given Open Chrome on Windows and start Edge application
    When a valid username and password
    #When match viewer is clicked
    When set play analysis is clicked
    When find videos is clicked
    When playlists is clicked
    When downloads is clicked
    When my account is clicked
    #When team summary is clicked
    #When logout is clicked
    Then each page will be displayed with data
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