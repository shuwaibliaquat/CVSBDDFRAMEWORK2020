Feature: CVS Pharmacy Homepage Testing

Scenario: verify homepage title
Given user verifies homepage title

@SmokeTest
Scenario: Verify pharmacy link from home page
Given clicked successfully on pharmacy link

@SmokeTest @RegressionTest
Scenario: Verify minute clinic link from home page
Then clicked successfully on minute clinic link

@RegressionTest
Scenario: Verify shop link from home page
Given clicked successfully on shop link

@RegressionTest @End2End
Scenario: Verify extracare link from home page
Given clicked successfully on extracare link

@End2End
Scenario: Verify contact lenses link from home page
Given clicked successfully on contact lenses

@SmokeTest @RegressionTest @End2End
Scenario: Verify photo link from home page
Given clicked successfully on photo link



