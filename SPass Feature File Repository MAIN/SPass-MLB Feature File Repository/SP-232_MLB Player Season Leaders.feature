Feature: SP-232_MLB Player Season Leaders

 
  Scenario: Remove all references to 1032 IDs from MLB player season leaders
    Given Start Statspass application and login
    Given the MLB module is open
    When a player batting leaders stat is selected
    And a player batting leaders split is selected
    And a player batting leaders league/team is selected     
    And a player pitching leaders stat is selected
    And a player pitching  leaders split is selected
    And a player pitching  leaders league/teams is selected
    And a player fielding leaders stat is selected
    And a player fielding  leaders split is selected
    And a player fielding  leaders league/teams is selected
    Then the correct player leaders pages will be populate