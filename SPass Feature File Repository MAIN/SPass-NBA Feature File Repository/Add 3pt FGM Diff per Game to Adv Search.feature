Feature: Add 3pt FGM Diff/game to Advanced Search (STATSPASS-305)

    Scenario: A new NBA stat 3pt FGM diff/game is available from advanced search to generate reports
    Given Start Statspass application and login
    And the NBA module is open
    When advanced search window is opened
    Then three pt FG Made/game can be selected as a statistic
    And All splits for Three pt FGM diff/game can be selected
    And All participant types for Three pt FGM diff/game can be selected
    And All time spans for Three pt FGM diff/game can be selected
    And Custom filters for Three pt FGM diff/game can be selected

   
     