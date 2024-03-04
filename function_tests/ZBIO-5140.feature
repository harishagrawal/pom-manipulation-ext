Functional Test cases:

1. Ability to Sign Up
   - Input: Sarah's personal details 
   - Expected Output: Successful registration and login to the app
   - Edge Case: Invalid details input/input error

2. Consent and Authorization
   - Input: Sarah's consent, her banking and credit card details
   - Expected Output: Access granted for the app to use her financial details
   - Edge Case: Sarah denies access/no consent given

3. Accessing Financial Details 
   - Input: API requests for Sarah's multiple banking and credit card details 
   - Expected Output: Acquisition of all the credit card details from multiple providers
   - Edge Case: Some of the banks do not provide open API services

4. Consolidated Dashboard 
    - Input: Information extracted from multiple banking and credit card API's
    - Expected Output: Successful consolidation credit card details on the dashboard
    - Edge Case: Some financial data is not available due to errors from the bank's side

5. Payment Scheduling and Automation 
   - Input: Sarah's preferences for payment
   - Expected Output: Successful scheduling of monthly auto-payments 
   - Edge Case: Insufficient funds or no available payment method

6. Payment Confirmation and Alerts
   - Input: Successful completion of auto-payment
   - Expected Output: Confirmation notification sent to Sarah and advance alert for next payment
   - Edge Case: Unable to send notifications due to network issues

Non-Functional Test cases:

1. Performance 
   - Input: API requests from multiple banking and credit card providers
   - Expected Output: The application should not slow down during the process and should be able to handle the load from multiple APIs.

2. Usability
   - Input: Use of application's features
   - Expected Output: Intuitive design and easy-to-navigate interface for Sarah

3. Security
   - Input: Personal, banking, and credit card details
   - Expected Output: Encrypted transmission of data, stored securely without vulnerabilities

4. Reliability 
   - Input: Continuous use of application over time
   - Expected Output: Consistent performance, without crashes, inaccurate information, or errors

Gherkin Format Scenario:

Feature: Automated Credit Card Payment Management

Scenario: A user is provided with a consolidated dashboard for managing credits and creating automated payments
   Given Sarah is a registered user of the financial app
   When Sarah grants necessary permissions to the app
   And the app uses Open Banking APIs to access her financial data
   Then all of Sarah's bank and credit card details are displayed on a consolidated dashboard of the app
   And Sarah is able to set up monthly auto-payments for her credit cards
   And Sarah receives a confirmation notification after each auto-payment
   And Sarah is alerted in advance about upcoming payments or potential issues