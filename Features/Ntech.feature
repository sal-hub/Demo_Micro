Feature:  Validation: NextTechITC Review 

Scenario Outline: Validate NextTechITC Review
Given  User goes to  Google homepage.                               
When   User writes valid "<Webpage name>" and presses enter key and scrolls down and User clicks on the write a review button. and user clicks the rating star and writes "<review>" and clicks on the post button.
Then  User will be able to post reviews successfully

Examples:
|padouct name| 
|NextTechITC|
