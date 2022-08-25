Feature: Positive path Validation of NextTech ITC Google Review

Scenario Outline: Validation of NextTech ITC Google Review

Given user visits Google home page
When user types "<pagename>" and press enter key and scrolls down and clicks on write a review button 
When user enters "<email or phone>" and "<pw>"
Then user clicks on rating stars and types "<review>" and clicks on post button to post a review successfully

Examples:
|pagename |email or phone|pw|review |
|NextTech ITC|1234567899|Efgh123! | It is an outstanding training institute |
