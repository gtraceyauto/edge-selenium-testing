Feature: Add FT Made Diff/game to Advanced Search (STATSPASS-305)

    Scenario: A new NBA stat Free Throws Made diff/game is available from advanced search to generate reports
    Given Start Statspass application and login
    And the NBA module is open
    When advanced search window is opened
    Then FT Made diff/game can be selected as a statistic
    And All splits for FT Made diff/game can be selected
    And All participant types for FT Made diff/game can be selected
    And All time spans for FT Made diff/game can be selected
    And Custom filters for FT Made diff/game can be selected

   
     