Feature: ICEBASK-548:RB Generated Reports

   Background:
   		Given the Report Builder module is opened
   		And a report is created in Report Builder
  
   Scenario: Test option to not allow report name or report description change
			Given a created report is opened
			When the user attempts to change report name or report description	
			And the report information is displayed in the first gray bar of the table			
			And the report is populated with data
			Then report name or report description cannot be changed
			And the 'Seasons' format should be displayed as YYYY
			And report name should be the only description displayed
