# Functional Tests
Functional test cases ensure that the system is working as expected. It involves testing the application from the user's perspective.

Test case 1: User Registration
  - Scenario: Sarah successfully signs up on the mobile app
  - Given that Sarah is not a registered user
  - When she signs up using her valid personal details
  - Then she should get a confirmation message saying registration was successful

Test case 2: Consent and Authorization
  - Scenario: Sarah grants necessary permissions to the mobile app
  - Given that Sarah is a registered user
  - When she logs in
  - And gives consent for the app to access her banking and credit card information.
  - Then the app should confirm that it has the permissions needed to access financial data.

Test case 3: Accessing Financial Details
  - Scenario: The app successfully pulls all necessary credit card and bank data from third-party APIs
  - Given that the necessary permissions have been granted by Sarah
  - When the app attempts to access her financial data using Open Banking APIs
  - Then it should retrieve complete data including: credit limit, balances, due dates and minimum payment details

Test case 4: Consolidated Dashboard
  - Scenario: The app correctly displays consolidated credit card and bank data
  - Given that the app has retrieved all necessary data
  - When Sarah views her dashboard
  - Then she should see a snapshot of all her credit card and bank accounts

Test case 5: Payment Scheduling and Automation
  - Scenario: Sarah can setup monthly auto-payments for her credit cards
  - Given that Sarah is viewing her dashboard
  - When she chooses to set up monthly auto-payments for her credit cards
  - Then the app should confirm successful scheduling of payments.

Test case 6: Payment Confirmation and Alerts
  - Scenario: Sarah receives alerts and confirmation notifications regarding her payments
  - Given that Sarah has successfully scheduled payments
  - When an automatic payment occurs or if there are any potential issues like insufficient funds
  - Then Sarah should receive a notification or alert from the app.

# Non-Functional Tests
Non-functional tests verify the performance and usability aspects of the system.

Performance Test:
  - Scenario: The app performs well under load
  - Given that the app has been granted necessary permissions
  - When 1000 users attempt to access their financial data simultaneously
  - Then the system should still operate within acceptable performance parameters.

Usability Test:
  - Scenario: The app has an accessible and user-friendly interface
  - Given that Sarah is a user
  - When she interacts with the app to manage her credit cards
  - Then no features should be difficult to understand or reach.

Security Test:
  - Scenario: The app stores sensitive user data securely
  - Given that Sarah has registered and granted the app necessary permissions
  - When her data is stored in the mobile app's database
  - Then it should be stored securely with encryption according to industry standards.