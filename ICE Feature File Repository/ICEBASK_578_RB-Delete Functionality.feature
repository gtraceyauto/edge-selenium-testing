Feature: ICEBASK-578:RB Delete Functionality

   Background:
   Given the Report Builder module is opened
   And a report is created in Report Builder
  	
   Scenario: Test that created reports can be deleted from the All Reports section
		Given a report is displayed in the all reports section
		And a report is displayd in the favorites section
		When a user deletes the report from all reports section
		Then the report is removed from all report sections
		And the correct confirmation message is displayed
		
		Scenario: Test that created reports can be deleted from the Recent Reports section
		Given a report is displayed in the Recent reports section
		And a report is displayd in the favorites section
		When a user deletes the report from Recent reports section
		Then the report is removed from all report sections
		And the correct confirmation message is displayed
		
		