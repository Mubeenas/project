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
formatter.scenarioOutline({
  "name": "validate Login Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_01_crossword"
    }
  ]
});
formatter.step({
  "name": "I launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "name": "I enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mubeenas951@gmail.com",
        "mubeenask"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate Login Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@democrossword"
    },
    {
      "name": "@TC_01_crossword"
    }
  ]
});
formatter.step({
  "name": "I launch the browser and enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Login.i_launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login page is opened",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Login.login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the \"mubeenas951@gmail.com\" and \"mubeenask\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Login.i_enter_the__and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Login.i_click_on_the_signin_button()"
});
formatter.result({
  "status": "passed"
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
formatter.scenario({
  "name": "Login and Track Products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@democrossword"
    },
    {
      "name": "@TC_03_crossword"
    }
  ]
});
formatter.step({
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Track.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login homepage is opened",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Track.the_login_homepage_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user track the product",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Track.the_user_track_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Track.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "wishlist",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@democrossword"
    },
    {
      "name": "@TC_04_crossword"
    }
  ]
});
formatter.step({
  "name": "launching the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Seller.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "wishlist page is opened",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Seller.wishlist_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "continue shopping",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Seller.continue_shopping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "tell me available",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Seller.tell_me_available()"
});
formatter.result({
  "status": "passed"
});
});