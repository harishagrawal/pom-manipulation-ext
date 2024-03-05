FUNCTIONAL TEST CASES:

1. REMINDER TEST
    - Input: Upcoming due date
    - Expected Output: Send reminder notification
    - Test Case:
      - Verify if the system sends a reminder to the cardholder reminding them of their upcoming payment due date.

2. OVERDUE ALERT TEST
    - Input: Missed due date
    - Expected Output: Send overdue balance alert
    - Test Case:
      - Verify if the system sends an alert to the cardholder notifying them of the overdue balance if they miss their payment due date.

3. COLLECTION NOTIFICATION TEST
    - Input: Significant delinquent
    - Expected Output: Send collection notification
    - Test Case:
      - Verify if the system escalates the process by sending formal collection notification to the cardholder detailing the amount owed if an account becomes significantly delinquent.

4. PAYMENT PLAN PROPOSAL TEST
    - Input: Non-payment of full overdue balance
    - Expected Output: Send payment plan proposal
    - Test Case:
      - Verify if the card issuer offers a payment plan proposal outlining a structured repayment schedule with reduced interest rates or fees if the cardholder is unable to pay the full overdue balance at once.

5. COLLECTION AGENCY INVOLVEMENT TEST
    - Input: Non-response to previous notifications 
    - Expected Output: Collection agency involvement
    - Test Case:
      - Verify if the issuer involves a collection agency to recover the overdue balance if the cardholder fails to respond to previous notifications and reminders.

6. LEGAL ACTION INITIATION TEST
    - Input: Extreme cases of non-payment
    - Expected Output: Initiation of legal action
    - Test Case:
      - Verify if the issuer takes legal action against the cardholder in extreme cases of non-payment or default.

NON-FUNCTIONAL TEST CASES:

1. PERFORMANCE TEST:
   - Test Case: 
     - Verify the response time of system in sending the notifications 
     - Verify if notifications can be sent to all cardholders simultaneously without any lag or slow down in the system.

2. USABILITY TEST:
   - Test Case:
     - Verify if the user interface is easy to navigate and understand
     - Verify if notifications are easily visible in user's dashboard or mobile app.

3. SECURITY TEST:
   - Test Case:
     - Verify if user's sensitive data is encrypted and secure while sending notifications
     - Verify if credit card system is secure against any potential attacks.

4. AVAILABILITY TEST:
   - Test Case:
     - Verify if the credit card system is available for use 24X7.

GHERKIN SCENARIO:

Feature: Credit Card Due Notifications

Scenario: Validating the sending of credit card due reminders and alerts

Given the credit card payment due date is approaching
When the system detects the upcoming due date
Then system should send a reminder notification to the respective cardholder

Given the cardholder has missed their payment due date
When the system detects the missed due date
Then an overdue balance alert should be sent to the respective cardholder

Examples:
  |due_date  |missed_date |
  |05-12-2022|06-12-2022  |
  |18-12-2022|19-12-2022  |
