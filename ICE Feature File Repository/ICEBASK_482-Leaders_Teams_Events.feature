Feature: ICEBASK-482 Reports/Leaders/Teams/Events

		Background:
		Given the ICE DEV site is open and logged in

 
   Scenario: Test the calendar functionality on teams leaders events reports
		Given the Report Leaders module is open
		And teams events reports are selected
		When a valid start date is added to the start date box
		And default splits are selected
		Then the report opens with the correct data populated
		
		Given the Report Leaders module is open
		When a valid start date is added to the start date box
		Then the report opens with the correct data populated