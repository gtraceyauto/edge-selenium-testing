Feature: Display Game Type (STATSPASS-276)

  Scenario: Display the game type on soccer final box scores
    Given Start Statspass application and login
    And the soccer module is open
    When a final box score is viewed
    Then the game type will be displayed
