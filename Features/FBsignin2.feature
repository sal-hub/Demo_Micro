Feature: FB Signin Validation
Scenario Outline: FB Signin 

Given User will go to Face Book Homepage
When User will write  "<Phone Number>" and "<Password>" and click login button
Then User should be able to sign in successfully
Examples:
|Phone Number|Password |
|1234567899 |Efgh123!|

