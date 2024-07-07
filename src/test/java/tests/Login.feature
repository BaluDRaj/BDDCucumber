Feature: User Login
Registered user should be able to login to access account details 

Background:
Given User navigates to Login Page

Scenario Outline: Login with Valid Credentials
When User enters valid email address <email>
And enters valid password <password>
And clicks on Login button
Then User should login successfully
Examples:
|email                  | password |
|amotooricap9@gmail.com | 12345    |
|amotooricap91@gmail.com| 12345    |
@smoke
Scenario: Login with invalid Credentials
When User enters invalid email address "amotooricappp9@gmail.com"
And enters invalid password "123456789"
And clicks on Login button
Then User should get a proper warning message 

Scenario: Login with valid email address and invalid password
When User enters valid email address "amotooricap@gmail.com"
And enters invalid password "123456789"
And clicks on Login button
Then User should get a proper warning message 

Scenario: Login with invalid email address and valid password
When User enters invalid email address "amotooricappp9@gmail.com"
And enters valid password "12345"
And clicks on Login button
Then User should get a proper warning message 

Scenario: Login without provinding any Credentials
When User dont enter any credentials 
And clicks on Login button
Then User should get a proper warning message