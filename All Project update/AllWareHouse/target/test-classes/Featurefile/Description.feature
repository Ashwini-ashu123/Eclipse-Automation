Feature: Login to the all warehouse website with valid creds

@FunctionalTesting
Scenario: Navigate to salesforce URL

Given User navigate to salesforce URL
Then Add the "<Username>" and the "<Password>"
And Click on the Login button
And Verify that user land on the "All Warehouses" page
Examples:
|Username|Password|
|awhris@salesforce.com.uat|RIS@2025|



Scenario: User navigate to the Enquires tab

Given User navigate to salesforce URL
Then Add the "<Username>" and the "<Password>"
And Click on the Login button
And Verify that user land on the "All Warehouses" page
Then click on the Enquiries tab and verify the user navigate to Enquiry page
Examples:
|Username|Password|
|awhris@salesforce.com.uat|RIS@2025|