Feature: User Login
Registered user should be able to login to access account details 

Scenario: Login with Valid Credentials
Given User navigates to Login Page
When User enters valid email address "amotooricap9@gmail.com"
And enters valid password "12345"
And clicks on Login button
Then User should login successfully

Scenario: Login with invalid Credentials
Given User navigates to Login Page
When User enters invalid email address "amotooricappp9@gmail.com"
And enters invalid password "123456789"
And clicks on Login button
Then User should get a proper warning message 

Scenario: Login with valid email address and invalid password
Given User navigates to Login Page
When User enters valid email address "amotooricap@gmail.com"
And enters invalid password "123456789"
And clicks on Login button
Then User should get a proper warning message 

Scenario: Login with invalid email address and valid password
Given User navigates to Login Page
When User enters invalid email address "amotooricappp9@gmail.com"
And enters valid password "12345"
And clicks on Login button
Then User should get a proper warning message 

Scenario: Login without provinding any Credentials
Given User navigates to Login Page
When User dont enter any credentials 
And clicks on Login button
Then User should get a proper warning message