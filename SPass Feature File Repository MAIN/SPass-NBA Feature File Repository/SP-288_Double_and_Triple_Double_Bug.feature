Feature: Double and Triple Double Stat Errors (STATSPASS-288)

  Scenario: Test bug fix so all splits for double-doubles work
    Given Start Statspass application and login
    And the NBA module is open
    When advanced search window is opened
    And Double-Doubles is selected as a statistic
    Then All splits for Double-Doubles can be selected
    And All participant types for Double-Doubles can be selected
    And All time spans for Double-Doubles can be selected
    And Custom filters for Double-Doubles can be selected

  Scenario: Test bug fix so all splits for triple-doubles work
    Given Start Statspass application and login
    And advanced search window is opened
    When Triple-Doubles is selected as a statistic
    Then All splits for Triple-Doubles can be selected
    And All participant types for Triple-Doubles can be selected
    And All time spans for Triple-Doubles can be selected
    And Custom filters for Triple-Doubles can be selected