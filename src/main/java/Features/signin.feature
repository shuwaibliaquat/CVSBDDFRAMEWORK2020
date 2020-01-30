Feature: CVS Signin feature
Scenario: CVS signin test scenario

Given User is already on Home page
When title of  signin page
Then user click on signin link
Then user enters username and password
Then user click on signin button
Then user is successfully signed in
Then close the browser