# Functional Test Cases 

## 1. Verify User Signup

Gherkin Format:
```gherkin
Given Sarah has the app installed
When she opens the app and attempts to sign up
Then the app should successfully create her account and request for necessary permissions
```

Human Readable Format:
```plaintext
- Input: User signup details
- Expected Output: Successful account creation and request for necessary permissions
- Edge Case: Check responses when incorrect or missing signup details are entered
```

## 2. Access Financial Details

Gherkin Format:
```gherkin
Given Sarah has an account and granted necessary permissions
When the app uses the Open Banking APIs to retrieve her financial details
Then it should successfully gather and store her financial information
```

Human Readable Format:
```plaintext
- Input: User permissions
- Expected Output: Successful gathering and storage of financial data
- Edge Case: Check responses when no or limited permissions are granted
```

## 3. Verify Consolidated Dashboard

Gherkin Format:
```gherkin
Given Sarah's financial details are gathered
When she navigates to the dashboard
Then she should see a snapshot of all her bank and credit card accounts with up-to-date balance and due date info
```

Human Readable Format:
```plaintext
- Input: Dashboard navigation
- Expected Output: Successful display of consolidated financial details
- Edge Case: Check responses when no financial data exists for the user
```

## 4. Payment Scheduling and Automation

Gherkin Format:
```gherkin
Given Sarah's financial details are available
When she sets up monthly auto-payments for each card 
Then the app should successfully save her settings and automate the payments
```

Human Readable Format:
```plaintext
- Input: Auto-payment settings
- Expected Output: Successful setup and automation of payments
- Edge Case: Check responses when incorrect or missing payment details are entered
```

## 5. Payment Confirmation and Alerts

Gherkin Format:
```gherkin
Given Sarah's automated payments are set up
When a payment has been made
Then the app should send her a confirmation notification and alert her in case of insufficient funds
```

Human Readable Format:
```plaintext
- Input: Automated payment made
- Expected Output: Successful dispatch of payment confirmation and alert notifications
- Edge Case: Check responses when there are notification delivery issues
```  

# Non-functional Test Cases 

## 1. App Performance

Gherkin Format:
```gherkin
Given Sarah is using the app
When multiple operations are performed simultaneously
Then the app should handle the load and perform smoothly
```

Human Readable Format:
```plaintext
- Input: Multiple simultaneous operations
- Expected Output: Smooth app performance without crashes
- Edge Case: Check app behavior under high load conditions
```

## 2. Security 

Gherkin Format:
```gherkin
Given Sarah's financial details are stored in the app
When a security threat is posed
Then the app should ensure her data remains secure and confidential
```

Human Readable Format:
```plaintext
- Input: User financial data
- Expected Output: Data security and confidentiality maintained
- Edge Case: Check app’s data handling ability when faced with potential security threats
```

## 3. User Interface 

Gherkin Format:
```gherkin
Given Sarah is using the app
When she navigates through different screens
Then the app should provide a user-friendly interface with intuitive navigation
```

Human Readable Format:
```plaintext
- Input: Different app’s screens navigation
- Expected Output: User-friendly interface and intuitive navigation
- Edge Case: Check app's UI consistency across different screens/devices
```