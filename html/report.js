$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/C D Lad/Desktop/Software Testing/BDD Framework/src/test/java/Feature/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Nopecommerce Register Functionality",
  "description": "",
  "id": "nopecommerce-register-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Simple Hard coded"
    }
  ],
  "line": 5,
  "name": "Nopecommerce Register Functionality Test",
  "description": "",
  "id": "nopecommerce-register-functionality;nopecommerce-register-functionality-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on register page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters register Details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is on register result page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the webbrowser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefinition.User_is_on_register_page()"
});
formatter.result({
  "duration": 14358208300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.title_of_register_page()"
});
formatter.result({
  "duration": 58172800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_enters_register_Details()"
});
formatter.result({
  "duration": 2201293500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_click_on_register_button()"
});
formatter.result({
  "duration": 1385681600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_is_on_register_result_page()"
});
formatter.result({
  "duration": 34849400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cnopCommerce [register result.]\u003e but was:\u003cnopCommerce [demo store. Register]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat StepDefinition.RegisterStepDefinition.user_is_on_register_result_page(RegisterStepDefinition.java:52)\r\n\tat ✽.Then User is on register result page(C:/Users/C D Lad/Desktop/Software Testing/BDD Framework/src/test/java/Feature/Register.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegisterStepDefinition.close_the_webbrowser()"
});
formatter.result({
  "status": "skipped"
});
});