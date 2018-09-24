Feature: SP-335_MLB Percent First Pitch Stikes


 Scenario: New percent first pitch strike stat added for players
    Given Start Statspass application and login
    And the MLB module is open
    When advanced search window is opened
    And Percent First Pitch is selected for pitchers
    Then the correct page is displayed with correct stat values
    
 Scenario: New percent first pitch strike stat added for teams
    Given Start Statspass application and login
    And the MLB module is open
    When advanced search window is opened
    And Percent First Pitch is selected for teams
    Then the correct page is displayed with correct stat values    