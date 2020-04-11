$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/testcase.feature");
formatter.feature({
  "name": "crossword website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@democrossword"
    }
  ]
});
formatter.scenario({
  "name": "Login and search products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@democrossword"
    },
    {
      "name": "@TC_02_crossword"
    }
  ]
});
formatter.step({
  "name": "user launch the chrome application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Search.user_launch_the_chrome_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user loggedin to the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Search.the_user_loggedin_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Search.the_user_search_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click enter to get result",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Search.search_result_are_displayed()"
});
formatter.result({
  "status": "passed"
});
});