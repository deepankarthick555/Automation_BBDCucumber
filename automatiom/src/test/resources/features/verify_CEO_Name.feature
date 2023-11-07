@GetCEOName
Feature: This feature is to get the CEO name from the OrangeHRM app
Scenario Outline: This test is to verify the CEO name
	Given the user is logged in successfully and is on Home Page.
	When the user clicks on the directory option from the Menu bar
	And the user selects the job title as "Chief Executive Officer" from the Drop Down
	And clicks the search button
	Then the user should see the CEO name as "John Smith"
	
