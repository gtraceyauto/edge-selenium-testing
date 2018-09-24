Feature: ICEBASK-550:RB Generated Report- Include Team, Position

   Background:
   	Given the Report Builder module is opened
  
   Scenario: Test player team and position displayed on reports
		Given a report is created in Report Builder
		When a created report is opened
		Then the correct player position is displayed after the player name
		And the correct player team displayed after the player name