$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DELL/eclipse-workspace/democrossword/src/test/resources/features/testcase.feature");
formatter.feature({
  "line": 2,
  "name": "crossword website",
  "description": "",
  "id": "crossword-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@democrossword"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "validate Login Functionality",
  "description": "",
  "id": "crossword-website;validate-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC_01_crossword"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "crossword-website;validate-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "crossword-website;validate-login-functionality;;1"
    },
    {
      "cells": [
        "mubeenas951@gmail.com",
        "mubeenask"
      ],
      "line": 14,
      "id": "crossword-website;validate-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "validate Login Functionality",
  "description": "",
  "id": "crossword-website;validate-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC_01_crossword"
    },
    {
      "line": 1,
      "name": "@democrossword"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the mubeenas951@gmail.com and mubeenask",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.i_launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 21284390400,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_page_is_opened()"
});
formatter.result({
  "duration": 1329726000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mubeenas951@gmail.com",
      "offset": 12
    },
    {
      "val": "mubeenask",
      "offset": 38
    }
  ],
  "location": "Login.i_enter_the__and(String,String)"
});
formatter.result({
  "duration": 417702500,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_the_signin_button()"
});
formatter.result({
  "duration": 740613200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Login and search products",
  "description": "",
  "id": "crossword-website;login-and-search-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@TC_02_crossword"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the user loggedin to the home page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click enter to get result",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 14587708800,
  "status": "passed"
});
formatter.match({
  "location": "Search.the_user_loggedin_to_the_home_page()"
});
formatter.result({
  "duration": 5157155900,
  "status": "passed"
});
formatter.match({
  "location": "Search.the_user_search_the_product()"
});
formatter.result({
  "duration": 3089802700,
  "status": "passed"
});
formatter.match({
  "location": "Search.search_result_are_displayed()"
});
formatter.result({
  "duration": 526458900,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Login and Track Products",
  "description": "",
  "id": "crossword-website;login-and-track-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC_03_crossword"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the login homepage is opened",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "the user track the product",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Track.launch_the_browser()"
});
formatter.result({
  "duration": 18853780900,
  "status": "passed"
});
formatter.match({
  "location": "Track.the_login_homepage_is_opened()"
});
formatter.result({
  "duration": 5973929300,
  "status": "passed"
});
formatter.match({
  "location": "Track.the_user_track_the_product()"
});
formatter.result({
  "duration": 2244870100,
  "status": "passed"
});
formatter.match({
  "location": "Track.click_on_submit_button()"
});
formatter.result({
  "duration": 2233396400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "wishlist",
  "description": "",
  "id": "crossword-website;wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TC_04_crossword"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "launching the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "wishlist page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "continue shopping",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "tell me available",
  "keyword": "Then "
});
formatter.match({
  "location": "Seller.launch_the_browser()"
});
formatter.result({
  "duration": 83614980400,
  "status": "passed"
});
formatter.match({
  "location": "Seller.wishlist_page_is_opened()"
});
formatter.result({
  "duration": 9224158400,
  "status": "passed"
});
formatter.match({
  "location": "Seller.continue_shopping()"
});
formatter.result({
  "duration": 22400015600,
  "status": "passed"
});
formatter.match({
  "location": "Seller.tell_me_available()"
});
formatter.result({
  "duration": 9450386600,
  "status": "passed"
});
});