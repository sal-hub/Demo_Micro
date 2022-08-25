Feature:  Review Validation

Scenario Outline: Review Validation
Given User goes to Google homepage.                               
When User writes in searchbar valid "<page name>" and presses enter key and scrolls down and clicks on the write a review button 
And User type valid "<email address>" and "<pw>" and click
Then  User clicks the rating star and writes "<Write a review>" and clicks on the post button to post a review successfully

Examples:
|Page name   |  email               | password|    Write a review                      |
|NextTech ITC|Shossain234@gmail.com |@abcd123 |It is an excellent training institute|
