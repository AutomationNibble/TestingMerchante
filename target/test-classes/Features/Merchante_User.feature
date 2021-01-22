#Author: Zulfikar Ayub
Feature: Merchante User Creation


@Sample123 
Scenario Outline: 
	To create User on merchante site

	Given user Lauch the application url "<URL>" and verfiy page title 
	And user click on user button 
	And user click on new user button 
	When user enter the details and click on create user button 
	Then user see the success message and details on the page
	
	Examples: 
	
		| URL  | 
		| BaseUrl  | 
		
