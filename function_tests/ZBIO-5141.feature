# Functional Tests:

**Test Case 1: Overdue Payment Notification**

Given the bank's system identifies a customer's account for non-payment,
When the payment has been overdue for a few days,
Then the system sends an email or SMS to the customer indicating the outstanding payment request.

Examples:

| Input value (Days overdue) | Expected outcome |
| ------ | ------ |
| 5 days | Send an email/SMS |
| 10 days | Initiate follow-up process |

**Test Case 2: Late Payment Fee Waiver**

Given a customer with an excellent payment history calls and requests a fee waiver,
When the Customer Service Representative reviews the account,
Then the late payment fee is waived off as a one-time goodwill gesture.

Examples:

| Input value (Payment History) | Expected outcome |
| ------ | ------ |
| Excellent | Waive off the fee |
| Poor | Do not waive off the fee |

**Test Case 3: Late Payment Interest Charges**

Given the bank identifies a customer repeatedly making late payments,
When once again a late payment is recorded,
Then the bank charges the late payment interest fee and communicates it to the customer.

Examples:

| Input value (Number of late payments) | Expected outcome |
| ------ | ------ |
| 3 | Charge interest fee |
| 1 | Do not charge interest fee |

**Test Case 4: Debt Collection & Recovery**

Given a customer has stopped making payments for several months and ignores all communications,
When the bank attempts to contact,
Then the account is moved to the collection department and a debt collection process is initiated.

Examples:

| Input value (Months without payment) | Expected outcome |
| ------ | ------ |
| 3 months | Move to collection department |
| 1 month | Do not move to collection department |

# Non-Functional Tests:

**Test Case 1: Notification Performance**

Given the bank's system has been developed to send notifications,
When a payment is overdue,
Then the system should take less than 5 seconds to send the overdue payment notification to the customer.

**Test Case 2: Server Load Capacity**

Given the bank's server is designed to handle a certain load,
When the load exceeds its capacity due to various factors like overdue payment follow-ups,
Then the server should manage the load effectively without crashing.

**Test Case 3: Security**

Given the bank's system communicates with customers,
When sending out notifications or sensitive data,
Then it should adhere to all necessary security protocols and encryptions to protect customer data.

**Test Case 4: Usability**

Given the bank's communication process is set in place,
When the customer receives a notification about overdue payment,
Then the message should be easily understandable and instructions must be clear.