Feature: Veevavault 

Scenario Outline: Login veeva vault
Given Open the chrome browser <URL>
When user login using <username> and <password>
And user click on login button
Then User validate its Prana-Quality Suite vault 
And user select More create option and select create Document
And user Select Placholder and Select Continue 
Then user verify its open Create placeholder page

Examples:
|URL|username|password|
|'https://login.veevavault.com/'|'prana.user2@partnersi-prana4life.com'|'Pr@n@_USER2!'|