Functional Test Cases:

## Use Case: Overdue Payment Notification:
1. **Test Case 1: Verify Overdue Payment Notification**
    - Input: John's account status - overdue.
    - Expected Output: Automated overdue payment notification system flags account and sends email/SMS notification.
    - Edge Case: If John did not receive the notification due to invalid contact information, make sure it doesn't impact the mechanics of the system.

2. **Test Case 2: Verify Follow-up Process**
    - Input: John's account status remains as overdue after initial notification.
    - Expected Output: System initiates a follow-up process, which includes personalized notifications or a phone call.

## Use Case: Late Payment Fee Waiver:
3. **Test Case 3: Verify Review Process of Customer Account**
    - Input: Mary's request for late fee waiver.
    - Expected Output: System allows customer service rep to review her account and payment history.

4. **Test Case 4: Verify Late Payment Fee Waiver**
    - Input: Mary's good payment history.
    - Expected Output: System allows waiver of late fee as a one-time goodwill gesture.

## Use Case: Late Payment Interest Charges:
5. **Test Case 5: Verify Late Payment Interest Charge**
    - Input: David's repeated late payments.
    - Expected Output: System charges late payment interest fee on David's account.

6. **Test Case 6: Verify Communication of Late Payment Interest Charges**
    - Input: Late payment interest fee charged on David's account.
    - Expected Output: System sends detailed communication about these charges to David.

## Use Case: Debt Collection & Recovery:
7. **Test Case 7: Move Account to Collection Department**
    - Input: Lisa's account unpaid for several months.
    - Expected Output: System changes Lisa's account status and moves it to the collection department.

8. **Test Case 8: Action from Collection Department**
    - Input: Lisa's account in collection department.
    - Expected Output: Collection department contacts Lisa and provides options to manage outstanding debt.

9. **Test Case 9: Involving Debt Collection Agency**
    - Input: Lisa fails to respond to collection department communication.
    - Expected Output: System processes for debt collection agency to recover the outstanding debt or, in severe cases, initiate legal action.

Non-Functional Test Cases:
1. **Test Case 10: Verify System Performance**
    - Input: High transaction loads.
    - Expected Output: System maintains performance under high transaction loads.

2. **Test Case 11: Verify System Security**
    - Input: Unauthorized access attempts.
    - Expected Output: System denies unauthorized access, maintains confidentiality, integrity, and availability.

3. **Test Case 12: Verify Usability of System**
    - Input: Interactions with the system.
    - Expected Output: System provides users with a seamless and understandable interface and workflows.