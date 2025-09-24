Feature: To validate the login page

#Scenario: Verfiy user is able to verify the slide size
#Given user navigate to the given URL
#When user click on the Shop and Home tab
#Then user check the size of the slider
#And validate on the size of the slider

Scenario: Verify the salesforce login 
Given user navigate to the given salesforce URL
When user click on the "<Username>" and "<Password>"
Then Click on the Login button
And Verify the user is able to login to application
Examples:
|Username|Password|
|awhris@salesforce.com.uat|RIS@2025|