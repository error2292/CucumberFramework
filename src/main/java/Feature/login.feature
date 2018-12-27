Feature: Free CRM login feature
#Scenario: Free CRM login Test scenario
#Given User is on login page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button 
#Then user is on home page
# diff between Scenario and Scenario outline 
#when using data driven approach with "Example" keyword need to use "Scenario Outline" and when using without "Example" keyword need to use "Scenario"

Scenario Outline: Free CRM login Test scenario
Given User is on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button 
Then user is on home page
Then close the browser
Examples:
  | username | password  |
  | naveenk  | test@123  |
  | tom      | test@3454 |