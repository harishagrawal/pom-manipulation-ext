Functional Test Cases
-----------------------------

Use Case: Overdue Payment Notification
Test Scenarios 
1. Verify whether the system successfully flags an account with overdue payment:
   - Input: To simulate the scenario, we can make a scheduled payment date pass for a mock user account.
   - Expected Output: After the due date passed, the system should mark the mock account as overdue.

2. Verify the system automatically sends reminder messages to the customer:
   - Input: Trigger overdue status for the user account.
   - Expected Output: The system should send an email or SMS to the customer’s registered contact details.

Use Case: Late Payment Fee Waiver
1. Verify whether customer representative can waive off late fee charges if a customer with good history requests:
   - Input: Submit fee waiver request through the system for a mock user.
   - Expected Output: The system should allow the representative to waive the fee off and reflect it in the customer's account balance.

Use Case: Late Payment Interest Charges
1. Verify whether the system adds late payment interest fee to customer’s outstanding amount if customer frequently missed payments:
   - Input: Trigger a scenario where the mock user account misses payment repeatedly.
   - Expected Output: The system should levy a late payment interest on the outstanding amount.

Use Case: Debt Collection & Recovery
1. Verify whether the system flags an account for debt collection:
   - Input: Trigger a scenario where the mock user account remains unpaid for several months.
   - Expected Output: The system should flag the account for debt collection and move it under the collection department.

Non-Functional Test Cases
-----------------------------
1. System should be able to handle large volume of overdraft transactions concurrently without performance degradation
2. Comprehensive logs should be generated for each overdue process starting from simple reminders to debt collection
3. The notifications should be sent in real time to customers for efficient interaction
4. The system should maintain data integrity and security for the privacy and confidentiality of the customer data
5. The system should stay robust and operational during peak volumes and resilient to system failure

---

Gherkin Format and Scenario
-----------------------------
Feature: Overdue Payment Notification
Scenario: The customer forgets to pay the credit card bill on the due date.
   Given a customer “John” with a due date “01/01/2021”
   And the current date is ”01/04/2021”
   When the system recognizes the due date has passed
   Then the system should flag the account as overdue
   And send a reminder email to “John@email.com” or an SMS to “123-456-7890”

Example:
   | Customer | Due Date    | Current Date | Email            | Phone Number |
   | John     | 01/01/2021 | 01/04/2021  | John@email.com | 123-456-7890 |
