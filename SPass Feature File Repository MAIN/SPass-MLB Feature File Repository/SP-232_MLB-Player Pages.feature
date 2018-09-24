Feature: s1032 Conversion MLB (STATSPASS-232)- Player Pages

    Scenario: Remove all references to 1032 IDs from MLB players pages (Current/Historical/HOF/Awards)
    Given Start Statspass application and login
    And the MLB module is open
    When a current player is selected with all links
    And a historical player is selected
    And a hall of fame player is selected
    And a player from the awards page is selected
    Then the correct player report pages will be populated
    
  