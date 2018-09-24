Feature: s1032 Conversion MLB (STATSPASS-232)- ALL TESTS

   
   

    Scenario: Remove all references to 1032 IDs from MLB home run search
    Given the MLB module is open
    When players batting home run search is 
    Then
    
    Scenario: Remove all references to 1032 IDs from MLB historical standings
    Given Start Statspass application and login
    And the MLB module is open
    When MLB historical standings is selected
    Then the historical standings page will be populated
    
    Scenario: Remove all references to 1032 IDs from standings 
    Given the MLB module is open
    When 
    Then
    
    Scenario: Remove all references to 1032 IDs from scouting reports
    Given the MLB module is open
    When
    Then
    
    Scenario: Remove all references to 1032 IDs from MLB Advanced Searches
    Given the MLB module is open
    When advanced search window is opened
    Then All statistics can be selected
    And All splits can be selected
    And All participant types can be selected
    And All time spans can be selected
    And Custom filters can be selected
    
    