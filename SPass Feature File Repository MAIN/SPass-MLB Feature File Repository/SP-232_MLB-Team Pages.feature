Feature: s1032 Conversion MLB (STATSPASS-232) MLB Team Pages 
 
 Scenario:  MLB teams pages (Stats/Logs/Splits/Roster/Trans/Inj)
    Given Start Statspass application and login
    And the MLB module is open
    When a current team stats page is selected
    And a current team games log is selected 
    And a current team splits is selected 
    And a current team roster is selected 
    And a current team trans/inj is selected
    And a current team historical info is selected
    And a current team pitching trends is selected
    Then the correct team report pages will be populated
