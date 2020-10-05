Feature: Login into Application

Scenario Outline: positive test validating login
Given initialize the browser with chrome
And Navigate to "https://www.salesforce.com/" site
And click on login link in home page to load on secure sign in page
When User enters <username> and <password> and log in
Then Verify that user is successfully logged in
And close all the browsers

Examples:
|username		|password		|
|xyz			|1234			|
|abcd			|3435			|

