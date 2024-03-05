**Functional Test Cases**

1. Test credit card due date and balance fetch
   - **Input**: Provide valid credit card details
   - **Expected Output**: System should return the due date and balance for the given credit card
   - **Edge Cases**: Invalid credit card details, Empty credit card details

2. Test arrangement of call to the user if balance is unpaid and overdue
   - **Input**: Cross-check if the credit card balance is overdue and unpaid
   - **Expected Output**: System should arrange for a call to the user
   - **Edge Cases**: Zero balance, due date not yet passed, invalid contact details 

3. Test balance update once payments are collected
   - **Input**: Sequentially process of payment collection
   - **Expected Output**: System should update the card balance once the payment is received.
   - **Edge Cases**: Partial payment, no payment, late processing payment  

**Non-Functional Test Cases**

1. Test the performance of the system while fetching the credit card due date and balance
2. Assess the system stability while arranging for a call to the user
3. Analyze the capability of the system in updating the balance once the payments are done
4. Validate the security of the credit card details and the privacy of the user
5. Probe the system with high load to test its scalability

**Gherkin Scenarios**

Scenario 1: Fetch the credit card due date and balance for a given credit card

```Gherkin
Given a valid Credit Card details
When the user requests the due date and balance
Then the system should display the due date and balance
```

**Example**
| CreditCardDetails | 
| ----------------- | 
| ValidDetails      | 
| InValidDetails    | 
| EmptyDetails      | 

Scenario 2: Arrange for a call to the user if the balance is unpaid and overdue

```Gherkin
Given an Unpaid and Overdue Credit Card balance
When the system cross-checks the balance
Then a call should be arranged to the user
```

**Example**
| CreditCardBalance | DueDate | ContactDetails |
| ----------------- | ------- | -------------- |
| 100               | Past    | Valid          |
| 0                 | Past    | Valid          |
| 100               | Future  | Valid          |
| 100               | Past    | Invalid        |

Scenario 3: Update the card balance once payment is collected

```Gherkin
Given the system starts collecting payment
And the payment is successful
When the system processes the payment
The card balance should be updated
```

**Example**
| PaymentStatus |
| ------------- |
| Partial       |
| Unsuccessful  |
| Successful    |
| LateProcessed |