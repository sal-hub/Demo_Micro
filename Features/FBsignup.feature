@fbsignuphappypath
Feature: Facebook sign up

In order to verify search
as a uger
i want to Facebook sign up

Scenario Outline:
Given user visiting facebook url
When user enter "<First name>" and"<Last name>" and valid "<Phone Number>" and "<new password>"
Then user select dropdown Month and dropdown Day and dropdown Year

Examples:
|First name| Last name| Phone Number |new password|Month  |Day|Year|
|Salma     | Hossain  | 1234567899   | Efgh123!   |6      |6  |1991|