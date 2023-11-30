# Test generated by RoostGPT for test bankAssist-api using AI Type Open AI and AI Model gpt-4-1106-preview

// RoostTestHash=d94103a8c3

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

public class UpdateRecurringTransfersPutTest {
  
    @Test  
    public void UpdateRecurringTransfers_put_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/org/commonjava/maven/ext/RoostTest/UpdateRecurringTransfers_put.csv"))) {  
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
				.pathParam("userCode", map.get("userCode"))
				.pathParam("accountId", map.get("accountId"))
				.pathParam("Authorization", map.get("Authorization"))
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"paymentId\": \"" + map.get("paymentId") + "\",\n" +
					"  \"customerId\": \"" + map.get("customerId") + "\",\n" +
					"  \"amount\": \"" + map.get("amount") + "\",\n" +
					"  \"scheduledDate\": \"" + map.get("scheduledDate") + "\",\n" +
					"  \"sourceAccountId\": \"" + map.get("sourceAccountId") + "\",\n" +
					"  \"targetAccountId\": \"" + map.get("targetAccountId") + "\",\n" +
					"  \"recurringOptions\": \"" + map.get("recurringOptions") + "\n" +
 				"}")
                .when()
                .put("/UpdateRecurringTransfers")  
                .then() 
                .extract().response();    
         
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
