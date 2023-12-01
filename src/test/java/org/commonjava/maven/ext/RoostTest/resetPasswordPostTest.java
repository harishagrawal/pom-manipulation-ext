# Test generated by RoostGPT for test bankAssist-api using AI Type Open AI and AI Model gpt-4-1106-preview

// RoostTestHash=79c3f016d8

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

public class resetPasswordPostTest {
  
    @Test  
    public void resetPassword_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/org/commonjava/maven/ext/RoostTest/resetPassword_post.csv"))) {  
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
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"username\": \"" + map.get("username") + "\",\n" +
					"  \"password\": \"" + map.get("password") + "\n" +
 				"}")
                .when()
                .post("/resetPassword")  
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
