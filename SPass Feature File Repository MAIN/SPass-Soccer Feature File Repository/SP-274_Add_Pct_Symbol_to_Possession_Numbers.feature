Feature: Add % Symbol to Possession Numbers (STATSPASS-274)

  Scenario: Percentage symbol is included with possession percentage values on soccer final box scores
    Given Start Statspass application and login
    And the soccer module is open
    When a final box score is viewed
    Then both possession% values contain % symbol
   
