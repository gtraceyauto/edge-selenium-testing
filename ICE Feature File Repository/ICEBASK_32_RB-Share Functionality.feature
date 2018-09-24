Feature: ICEBASK-32:RB Delete Functionality
  
  	
    Scenario: Test the report sharing functionality in Report Builder
		Given the Report Builder module is opened
    And a report is created in Report Builder
		And the report list page is open
		When share is selected from options list
		Then the correct list of users is displayed and can be selected
   
    Scenario: Test that shared user receives notifications
		Given a shared user logs into ICE
    When the notification icon is selected
    Then the shared report name link is displayed
    And the report opens when the link is selected
    
    Scenario: Test that shared user can view reports
		Given the colleague reports section is opened in Report Builder
		When the shared report is selected
		Then the shared report will be opened
		
		Scenario: Test that shared user can delete reports
		Given the colleague reports section is opened in Report Builder
		When the report is deleted by the shared user
		Then the report is deleted
		
		Then the shared user receives a notification
		And the shared user can view the report in the colleague report section
		And the shared report can be deleted
		
	
	
