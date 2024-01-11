package org.commonjava.maven.ext.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetAccountInfoPostTest {
  
    @Test  
    public void GetAccountInfo_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/org/commonjava/maven/ext/RoostTest/GetAccountInfoPostTest.csv"))) {  
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
                
                String BEARER_TOKEN = getBearerToken();
  
                Response response = given()
				.pathParam("koreUserId", map.get("koreUserId") != null ? map.get("koreUserId") : "")
				.pathParam("botId", map.get("botId") != null ? map.get("botId") : "")
				.pathParam("accountId", map.get("accountId") != null ? map.get("accountId") : "")
				.pathParam("Authorization", map.get("Authorization") != null ? map.get("Authorization") : "")
				.pathParam("X-Auth-token", map.get("X-Auth-token") != null ? map.get("X-Auth-token") : "")
				.pathParam("X-CORRELATION-ID", map.get("X-CORRELATION-ID") != null ? map.get("X-CORRELATION-ID") : "")
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"customerId\": \"" + (map.get("customerId") != null ? map.get("customerId") : "") + "\n" +
 				"}")
				.header("Authorization", "Bearer " + BEARER_TOKEN)
                .when()
                .post("/GetAccountInfo")  
                .then() 
                .extract().response();    
         
                // Rest of the code remains unchanged
    }

    private String getBearerToken() {
        // Code to get the Bearer Token
    }
}
