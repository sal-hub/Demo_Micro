Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given user visits amazon homepage
When user writes "<productname>" and click search icon
Then User should able to the get  the expected results

Examples:
|productname| 
|Home & Kitchen |