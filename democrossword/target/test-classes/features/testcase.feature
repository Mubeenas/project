@democrossword
Feature: crossword website


@TC_01_crossword
 Scenario Outline: validate Login Functionality
Given I launch the browser and enter the url
When login page is opened
Then I enter the <username> and <password>
And I click on the signin button
 
Examples: 
           |username                   	| password         |
           |mubeenas951@gmail.com	      | mubeenask        |
         
  
@TC_02_crossword
Scenario: Login and search products
Given user launch the chrome application
When the user loggedin to the home page
Then the user search the product
Then click enter to get result


@TC_03_crossword
Scenario: Login and Track Products
Given launch the browser
When the login homepage is opened
Then the user track the product
Then click on submit button

@TC_04_crossword
Scenario: wishlist
Given launching the browser
When wishlist page is opened
Then continue shopping
Then tell me available

@TC_05_crossword
Scenario: Logout
Given launched the browser
When login is opened
Then logout the page









