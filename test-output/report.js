$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/E23300509/Cucumberframework/src/main/java/Feature/Eligible.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook sign up",
  "description": "",
  "id": "facebook-sign-up",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Facebook Test scenario",
  "description": "",
  "id": "facebook-sign-up;facebook-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of landing page is facebook",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters firsname and lastname and DOB",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Then enter phone and password"
    }
  ],
  "line": 7,
  "name": "click login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_landing_page()"
});
