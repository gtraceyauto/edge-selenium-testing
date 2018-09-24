Feature: Add Three-pt FG Attempt Diff/game to Advanced Search (STATSPASS-261)

    Scenario: A new NBA stat Threept FGA diff/game is available from advanced search to generate reports
    Given Start Statspass application and login
    And the NBA module is open
    When advanced search window is opened
    Then Three pt FGA diff/game can be selected as a statistic
    And All splits for Three pt FGA diff/game can be selected
    And All participant types for Three pt FGA diff/game can be selected
    And All time spans for Three pt FGA diff/game can be selected
    And Custom filters for Three pt FGA diff/game can be selected

   
     