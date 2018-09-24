Feature: Position Abbreviations for Spanish Users (STATSPASS-275)

  Scenario: Change soccer position abbreviations on the Spanish site 
    Given Start Statspass application and login using user with Spanish language setup
    And the soccer module is open
    When a final box score is viewed
    Then the goalkeeper position abbrev. is "Por"
    And the defender position abbrev. is "Def"
    And the forward position abrrev. is "Del"
    And the substitute postition abbrev. is "Sus"
    