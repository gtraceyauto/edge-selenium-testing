Feature: This is a standard Oracle connection test  
  
  Scenario: Test a connection to an oracle DB
    Given Oracle database connection is made
    When proper setup and credetials are set
   	Then the database can be queried