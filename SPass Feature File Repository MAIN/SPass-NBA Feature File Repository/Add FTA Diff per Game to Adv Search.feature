Feature: Add FTA Diff/game to Advanced Search (STATSPASS-260)

  Scenario: A new NBA stat FTA Diff/Game is available from advanced search to generate reports
    Given Start Statspass application and login
    And the NBA module is open
    When advanced search window is opened
    Then FTA diff/game can be selected as a statistic
    And All splits for FTA diff/game can be selected
    And All participant types for FTA diff/game can be selected
    And All time spans for FTA diff/game can be selected
    And Custom filters for FTA diff/game can be selected

   
     