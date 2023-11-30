# Test generated by RoostGPT for test bankAssist-api using AI Type Open AI and AI Model gpt-4-1106-preview

// RoostTestHash=8a95fbc531

package org.commonjava.maven.ext.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;

public class GetAccountInfoPostTest {
  
    @Test  
    public void GetAccountInfo_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/org/commonjava/maven/ext/RoostTest/GetAccountInfo_post.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data  
                Map<String, String> map = new HashMap<>();  
                for (int i = 0; i < headers.length; i++) {  
                    map.put(headers[i], data[i]);  
                }  
                
  
                Response response = given()
				.pathParam("koreUserId", map.get("koreUserId"))
				.pathParam("botId", map.get("botId"))
				.pathParam("accountId", map.get("accountId"))
				.pathParam("Authorization", map.get("Authorization"))
				.pathParam("X-Auth-token", map.get("X-Auth-token"))
				.pathParam("X-CORRELATION-ID", map.get("X-CORRELATION-ID"))
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"customerId\": \"" + map.get("customerId") + "\n" +
 				"}")
                .when()
                .post("/GetAccountInfo")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {

            if (response.jsonPath().get("customerId") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("customerId"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts") != null) {
              for (int i = 0; i < response.jsonPath().getList("accounts").size(); i++) {
            if (response.jsonPath().get("accounts[`"+ i +"`].customerId") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].customerId"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].accountName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].accountName"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].accountNickname") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].accountNickname"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].accountNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].accountNumber"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].accountType") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].accountType"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].activatedDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].activatedDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].availableBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].availableBalance"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].availableCash") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].availableCash"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].availableCashLimit") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].availableCashLimit"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].availableCredit") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].availableCredit"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].bankName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].bankName"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].branchName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].branchName"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].cardName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].cardName"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].cardNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].cardNumber"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].cardStatus") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].cardStatus"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].cardType") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].cardType"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].creditLimit") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].creditLimit"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].currency") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].currency"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].currentBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].currentBalance"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].deactivatedDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].deactivatedDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].dueAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].dueAmount"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].dueDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].dueDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].earlyWithdrawalPenalty") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].earlyWithdrawalPenalty"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].email") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].email"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].expiryDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].expiryDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].expDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].expDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].fdType") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].fdType"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].image") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].image"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].interestRate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].interestRate"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].internalTransferFromEnabled") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].internalTransferFromEnabled"), instanceOf(Boolean.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].internalTransferToEnabled") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].internalTransferToEnabled"), instanceOf(Boolean.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].isPrimaryMobile") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].isPrimaryMobile"), instanceOf(Boolean.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].isAlternateMobileNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].isAlternateMobileNumber"), instanceOf(Boolean.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].isStatement") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].isStatement"), instanceOf(Boolean.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].lastDrawDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].lastDrawDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].loanMaturityDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].loanMaturityDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].loanOriginationDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].loanOriginationDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].location") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].location"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].lastUpdated") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].lastUpdated"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].maxTransactionLimit") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].maxTransactionLimit"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].maturityDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].maturityDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].minimumPaymentDue") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].minimumPaymentDue"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].minimumBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].minimumBalance"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].monthlyPayment") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].monthlyPayment"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].openingBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].openingBalance"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].originalLoanAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].originalLoanAmount"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].P2PLimit") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].P2PLimit"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].p2pEnabled") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].p2pEnabled"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].paybillEnabled") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].paybillEnabled"), instanceOf(Boolean.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].payoffAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].payoffAmount"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].personalBankerName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].personalBankerName"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].personalBankerContact") != null) {
            if (response.jsonPath().get("accounts[`"+ i +"`].personalBankerContact.email") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].personalBankerContact.email"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].personalBankerContact.mobileNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].personalBankerContact.mobileNumber"), instanceOf(String.class));
          }

          }

            if (response.jsonPath().get("accounts[`"+ i +"`].phone") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].phone"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].postedBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].postedBalance"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].principalBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].principalBalance"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].productCode") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].productCode"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].productName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].productName"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].propertyAddress") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].propertyAddress"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].rewardPoints") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].rewardPoints"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].routingNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].routingNumber"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].statementDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].statementDate"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].status") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].status"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].swiftCode") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].swiftCode"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].totalBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].totalBalance"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].unbilledAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].unbilledAmount"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].userId") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].userId"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].valueAtMaturity") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].valueAtMaturity"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].holdAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].holdAmount"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].unclearFundsAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].unclearFundsAmount"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].averageMonthlyBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].averageMonthlyBalance"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].netWithdrawableBalance") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].netWithdrawableBalance"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].totalTenure") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].totalTenure"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].remainingTenure") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].remainingTenure"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].debitAccountNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].debitAccountNumber"), instanceOf(String.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].lateFee") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].lateFee"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].bounceCharge") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].bounceCharge"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].totalCharges") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].totalCharges"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].overDueAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].overDueAmount"), instanceOf(number.class));
          }

            if (response.jsonPath().get("accounts[`"+ i +"`].id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("accounts[`"+ i +"`].id"), instanceOf(String.class));
          }

                }
                MatcherAssert.assertThat(response.jsonPath().getList("accounts"), instanceOf(List.class));

          }
}
if (response.statusCode() == 401) {

            if (response.jsonPath().get("err") != null) {
            if (response.jsonPath().get("err.message") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("err.message"), instanceOf(String.class));
          }

          }
}
if (response.statusCode() == 404) {

            if (response.jsonPath().get("err") != null) {
            if (response.jsonPath().get("err.message") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("err.message"), instanceOf(String.class));
          }

          }
}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
