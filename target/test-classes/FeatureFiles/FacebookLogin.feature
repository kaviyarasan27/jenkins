Feature: To validate login functionality of facebook
Scenario: Validate with invalid username and invalid password
Given The user should launch the chrome browser
When The user should type the url
And The user should maxmize the window
And The user should type the invalid username and invalid password
And The user should click the login button
Then The user should navigate to incorrect credential page


Scenario Outline: Validate with invalid username and invalid password
Given The user should launch the chrome browser
When The user should type the url
And The user should maxmize the window
And The user should type the invalid username "<user>" and invalid password "<pass>"
And The user should click the login button
Then The user should navigate to incorrect credential page

Examples:
|user|pass|
|kavi|kavi@123|
|santhosh|santhosh@123|
|mani|mani@123|