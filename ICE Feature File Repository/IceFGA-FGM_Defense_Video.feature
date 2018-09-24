Feature: Test FGA/FGM Defense Events are in Own Category (ICEBASK-53)

  Scenario: Test FGA/FGM Defense Events moved to premium category
    Given Ice video module is open
    When a team and player YTD is selected
   	 And premium>shot defense category is selected
    Then the FGA event should be available to select
    	And the FGM event should be available to select
    
  Scenario: Test FGA/FGM Defense Events contain video clips
    Given Ice video module is open
    When a team and player YTD is selected
    	And the FGA Defense events are selected
    	And the FGM Defense events are selected
    Then the video clips play
  
