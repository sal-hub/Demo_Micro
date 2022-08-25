Feature: Validate Homedepot search

Scenario Outline: Validate Homedepot search

Given user visit Homedepot homepage
When user types "<productname>" and click search icon
Then User should see expected product

Examples:
|productname          | 
|Duracell Optimum AAA |