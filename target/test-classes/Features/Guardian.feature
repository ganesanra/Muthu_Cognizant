#Author:Muthu#
Feature: Validating The Guardian Article 
@News 
Scenario: Launching  the Guardian website 
	Given user launches  Guardian website 
	When user launched the website successfully 
	Then user should be able to Validate the title "The Guardian" 
@News 
Scenario Outline:Validation of the First article from Guardian against other source 
	Given user launches  Guardian website 
	And user reads the First Article on the page 
	When user navigates to "<url>"
	Then the user validates the article in other source
	
Examples:
|url |
|https:www.google.com |