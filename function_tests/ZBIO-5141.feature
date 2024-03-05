Functional Test Scenarios:

1. **Test Case -** Overdue Payment Notification
   - *Input:* An account marked overdue
   - *Expected Output:* The system should send an automated email or SMS to the account owner  
   - *Edge Case:* If the contact information is incorrect or not updated, the email or SMS notification will not reach the account holder.

2. **Test Case -** Follow Up Process Initiation
   - *Input:* Payment still not received after initial overdue notification 
   - *Expected Output:* The system should initiate a personalized notification process or a phone call from a customer service representative 
   - *Edge Cases:* If the notify attempt fails due to wrong contact info, the incident should be escalated to the next level.

3. **Test Case -** Late Payment Fee Waiver
   - *Input:* A late fee waiver request from an account holder
   - *Expected Output:* After reviewing account and payment history, the system/representative should waive the late payment fee if there are no repetitive late payments
   - *Edge Cases:* If the payment history shows repetitive late payments, the fee waiver should be rejected.
 
4. **Test Case -** Late Payment Interest Charges
   - *Input:* Repeated late payments by an account holder
   - *Expected Output:* Late payment interest fee should be applied to the account; The system should send a notification to the account holder about the charges
   - *Edge Cases:* If the account holder ignores or doesn't respond to the notifications, further actions should be considered.

5. **Test Case -** Debt Collection & Recovery
   - *Input:* An account holder has stopped making payments for several months
   - *Expected Output:* The system should move the account to the collection department, which should initiate contact and offer payment options to the account holder. In case of no response, a debt collection agency should be involved or legal action should be taken.
   - *Edge Cases:* If the system fails to move the account to the collection department, it will result in a delay in collection process.

Non-Functional Test Scenarios:

1. **Test Scenario -** System Response Time
   - *Expected Result:* The system should generate and send notifications within a set time limit.

2. **Test Scenario -** Data Security
   - *Expected Result:* The customer's confidential information must remain safe and secure.

3. **Test Scenario -** System Availability
   - *Expected Result:* The system should be available 24/7 to track payments and send notifications.


Gherkin Scenarios:

1. **Scenario -** Send overdue payment notification.
    - *Given:* The account is marked overdue
    - *When:* The system checks the overdue accounts
    - *Then:* The system should send an email or SMS notification to the account holder
    - *Example:* | overdue_account |

2. **Scenario -** Initiate follow-up process.
    - *Given:* The initial overdue notification was sent and payment not received
    - *When:* The system checks the overdue accounts again
    - *Then:* The system should initiate a personalized follow-up
    - *Example:* | overdue_account |

3. **Scenario -** Waive off late payment fee.
    - *Given:* The account holder requests a late fee waiver
    - *When:* The Representative reviews account and payment history
    - *Then:* The system/representative should waive off the late payment fee
    - *Example:* | account_holder |

4. **Scenario -** Apply late payment interest charges.
    - *Given:* The account holder repeats late payments
    - *When:* The system checks for repeated late payments
    - *Then:* The system should apply a late payment interest fee
    - *Example:* | account_holder |

5. **Scenario -** Initiate debt collection & recovery.
    - *Given:* The account holder stopped making payments for several months
    - *When:* The system checks for accounts with stopped payments
    - *Then:* The system should move the account to the collection department
    - *Example:* | account_holder |
