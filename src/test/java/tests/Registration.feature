Feature: User Registration

Scenario: Register with mandatory fields
	Given User navigates to Register Account page 
	When User enters firstname "balu" into the First name field
	And Enters lastname "raj" into the lastname field 
	And Enters email address "baludraj@gmail.com" into the email field 
	And Enters telephone "123456789" into the Telephone field
	And Enters Password "12345" into the password field 
	And Selects Provacy policy field 
	And Clicks on continue button
	Then Account should get successfully created 
	@smoke
Scenario: Register with all fields
	Given User navigates to Register Account page 
	When User enters firstname "balu" into the First name field
	And Enters lastname "raj" into the lastname field 
	And Enters email address "baludraj@gmail.com" into the email field 
	And Enters telephone "123456789" into the Telephone field
	And Enters Password "12345" into the password field 
	And Enters Password "12345" into the password confirm field 
	And Selects Yes for newsLetter 
	And Selects Provacy policy field
	And Clicks on continue button
	Then Account should get successfully created  
	
Scenario: Register without providing any fields
	Given User navigates to Register Account page 
	When User dont enter details to any fields
	And Clicks on continue button
	Then Warning messages should be displayed under all the mandatory fields 
	