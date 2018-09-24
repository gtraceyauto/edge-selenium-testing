Feature: SP232_s1032 MLB Team Season Leaders

 
  Scenario: Test all MLB team season leaders stats and splits
    Given Start Statspass application and login
    Given the MLB module is open
    When a team batting leaders stat is selected
    And a team batting leaders split is selected
    And a team batting leaders league/team is selected     
    And a team pitching leaders stat is selected
    And a team pitching  leaders split is selected
    And a team pitching  leaders league/teams is selected
    And a team fielding leaders stat is selected
    And a team fielding  leaders split is selected
    And a team fielding  leaders league/teams is selected
    Then the correct team leaders pages will be populate