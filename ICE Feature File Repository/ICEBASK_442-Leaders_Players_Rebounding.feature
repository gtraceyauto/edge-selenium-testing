Feature: ICEBASK-442 Reports/Leaders/Players/Rebounding

		Background:
		Given the ICE DEV site is open and logged in

 
   Scenario: Test the calendar functionality on players leaders rebounding reports
		Given the Report Leaders module is open
		And players rebounding reports are selected
		When a valid start date is added to the start date box
		And default splits are selected
		Then the report opens with the correct data populated