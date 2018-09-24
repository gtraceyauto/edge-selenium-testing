Feature: Update Career Player Stats Headers (STATSPASS-248)

  Scenario: Change the lables of the headers on soccer career player stats pages
    Given Start Statspass application and login
    And the soccer module is open
    When a player career page is opened
    Then first section is labeled "All Competitions"
    And the second section is labeled "All Competitions(Additional Stats)"
    And the third section is labeled "All Competitions (Free Kicks)"
    
