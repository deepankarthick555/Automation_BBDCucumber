@timesheets
Feature: This feature is to get pending timesheet.
Scenario Outline: This test is to verify the pending time sheet
	Given the user is on the home page
	When the user clicks on the time option from the menu
	And the user enters the name as "John Smith"
	And clicks on the view button
	Then the user should see the message as "<Message>"
Examples:
|message|
|No Timesheet Found|