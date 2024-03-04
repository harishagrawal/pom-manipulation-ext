# Functional Test Cases:
 
1. **Test Signing Up on the App**
   - Input: User enters details such as email, password, full name, and agree to the terms and conditions.
   - Expected Outcome: User credentials should be saved and user should be directed to the home page.
   
2. **Test Grant of Access to App for Multiple Bank Accounts**
   - Input: User enters authentication details of bank accounts.
   - Expected Outcome: The app retrieves and displays the details of the user's various bank accounts.

3. **Test Access of Financial Details**
   - Input: User consents for the app to retrieve financial details using Open Banking APIs.
   - Expected Outcome: The app is able to retrieve credit card data (credit limits, balances, due dates, minimum payment information) from the various bank accounts.

4. **Test Consolidation of Dashboard**
   - Input: No specific user input.
   - Expected Outcome: User can view all credit card details on a single dashboard. Details should be reflective of the current financial situation (balances, due dates, and other relevant info).
   
5. **Test Payment Scheduling**
   - Input: User sets up monthly payments for each credit card.
   - Expected Outcome: After setup, automated payments should be scheduled for the set date each month.

6. **Test Payment Alerts and Confirmation**
   - Input: No specific input from user.
   - Expected Outcome: The app should send alerts regarding upcoming payments and any potential issues, along with confirmation of successful payments.


# Non-Functional Test Cases:

1. **Test Load**
   - Aim of the test: To ensure the app can handle the maximum number of users it claims it can.
   - Expected Outcome: The app should be able to perform its key functions even under maximum load.

2. **Test Security and Data Privacy**
   - Aim of the test: Ensuring user's sensitive data (like bank credentials and transaction data) is stored securely.
   - Expected Outcome: Unauthorized access should be prevented. The data must be encrypted and impossible to intercept.

3. **Test Usability**
   - Aim of the test: Determine if the app is easy to use and intuitive.
   - Expected Outcome: Users are able to understand and use the app without difficulty. 

# Gherkin Format:

## Scenario: Successful retrieval and display of multiple bank accounts
   - Given: User is signed in and wants to grant access to according banks
   - When: User enters valid account details
   - Then: App should show accounts from associated banks
   
## Scenario Outline: Successful retrieval of financial information
   - Given: User has consented for the app to retrieve credit card information using Open Banking APIs
   - When: Open Banking APIs access the information
   - Then: The app shows up-to-date balance and due date info

## Scenario Outline: Successful scheduling of monthly payments
   - Given: User wants to set up monthly payments
   - When: User sets the data for automatic payments
   - Then: The app schedules monthly auto-payments 

## Example Table:
| Email           | Password     | Full Name | Bank Name | Account Details | Monthly Payment Date |
|-----------------|--------------|-----------|-----------|-----------------|----------------------|
| sarah@gmail.com | abc*123      | Sarah     | XYZ Bank  | ******          | 3rd of Every Month   |

Note: These are the kind of details to be used in the given tests. Actual user details must be securely provided by the user.