$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/JavaLearner/Desktop/CvsPharmacyProject/CvsBDDFramework/src/main/java/Features/signin.feature");
formatter.feature({
  "line": 1,
  "name": "CVS Signin feature",
  "description": "",
  "id": "cvs-signin-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "CVS signin test scenario",
  "description": "",
  "id": "cvs-signin-feature;cvs-signin-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of  signin page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on signin link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is successfully signed in",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDefinition.user_is_already_on_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStepDefinition.title_of_signin_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStepDefinition.user_click_on_signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStepDefinition.user_click_on_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStepDefinition.user_is_successfully_signed_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});