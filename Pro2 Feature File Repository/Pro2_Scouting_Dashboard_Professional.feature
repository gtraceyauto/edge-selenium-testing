Feature: Pro2 Scouting Dashboard Professional Tab Tests

 
  Scenario: Test all splits on Scouting Dashboard from Professional tab
    Given Start ProTwo application and login
    And the scouting dashboard module is open
    And the professional tab is open
    When a position split is selected
    And a bats split is selected
    And a throws split is selected
    And a org split is selected
    And a team split is selected
    And a level split is selected
    Then the correct results are displayed