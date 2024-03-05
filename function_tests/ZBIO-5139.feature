Functional Test Cases:

**1) Credit Card Application Test**
- User fills out the online application form providing identification information, contact details, and income data.
  - Input: Pertinent information in all required fields
  - Expected Output: Form gets submitted successfully 
  - Edge Case: User leaves required fields blank
    - Expected Outcome: Show error and prohibit form submission

**2) Waiving Off Charges Test**
- A user complaint about a specific charge.
  - Input: Customer request to waive off charge
  - Expected Output: The bank reviews customer's history and respond to the request
  - Edge Case: Customer request to waive off legitimate charge
    - Expected Outcome: The bank refuses to waive off the charge

**3) Redeeming Points Test**
- A user initiates the collection of accumulated points
  - Input: Customer requests to redeem points
  - Expected Output: Points are deducted and corresponding reward is provided
  - Edge Case: Customer attempts to redeem more points than they have
    - Expected Outcome: Show error and deny redemption

**4) Credit Limit Extension Test**
- The bank increases a user's credit limit
  - Input: Bank’s decision to increase credit limit
  - Expected Output: Credit limit increased successfully
  - Edge case: Customer asks for an unreasonable increase
    - Expected Outcome: The bank refuses the request and maintains the existing limit

**5) Credit Limit Reduction Test**
- The bank reduces a user's credit limit
  - Input: Bank's decision to reduce credit limit
  - Expected Output: Credit limit reduced successfully
  - Edge Case: The bank reduces the limit below the current balance
    - Expected Outcome: The bank refuses the reduction and maintains a limit above the current balance

Non-functional Test Cases:

**1) Website Access Test**
- Customers should be able to access the website at all times
  - Input: User visits the website at any time
  - Expected Output: Website is accessible

Gherkin Scenario:

Scenario Outline: Credit card application
  Given I am on the "<Page>"
  When I provide "<Valid Information>" to apply for a new credit card
  Then my application should be "<Outcome>"
  Examples:
  | Page     | Valid Information                   | Outcome |
  | Apply Now| ID: "12345", Income: "50000"        | Success |
  | Apply Now| ID: "12345", Income: "Non Numeric"  | Failure |