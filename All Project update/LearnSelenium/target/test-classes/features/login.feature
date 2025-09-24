Feature: To validate Testcase

Scenario: 1.Home page with three slider only

Given Login in Shop page
When user navigate to shop page
And  user click on Home menu button
Then user validate home page has three Slider only

Scenario: 2.Add basket item coupon

Given Login in Shop page
When user navigate to shop page
And  user click on Home menu button
Then user validate home page has three Slider only 
When user click the image in the arrivals
Then user validate whether its navigating to next page 
When user click on add to basket
Then user validate the view the book in the menu item
And user click on the item link in menu item
Then user check it navigate to check out page       
When user enter Coupon code as ‘krishnasakinala’ to get 50rps
Then user validate the coupon amount is validate



