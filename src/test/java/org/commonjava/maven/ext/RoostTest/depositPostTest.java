// Test generated by RoostGPT for test restA-gpt4-kore using AI Type Open AI and AI Model gpt-4

// Test generated for /deposit_post for http method type POST in rest-assured framework

// RoostTestHash=70db6d5eac

package org.commonjava.maven.ext.RoostTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class depositPostTest {
  
    @Test  
    public void depositPostTest() {
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/org/commonjava/maven/ext/RoostTest/deposit_post.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Map<String, String> map = parseLineToMap(line);
  
                Response response = given()
                    .pathParams(map)
                    .contentType(ContentType.JSON)
                    .body(map)
                    .when()
                    .post("/deposit")
                    .then()
                    .extract().response();
  
                validateResponse(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private Map<String, String> parseLineToMap(String line) {
        String[] headers = line.split(",");
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < headers.length; i++) {
            map.put(headers[i], headers[i+1]);
        }
        return map;
    }

    private void validateResponse(Response response) {
        int statusCode = response.statusCode();
        switch (statusCode) {
            case 200:
                System.out.println("Description: Deposit success");
                break;
            case 401:
                validateErrorResponse(response);
                break;
            case 404:
                validateNotFoundResponse(response);
                break;
            default:
                validateUnprocessableEntityResponse(response);
        }
    }

    private void validateErrorResponse(Response response) {
        System.out.println("Description: Error: Authorisation failed.");
        assertThat(response.jsonPath().getString("err.message"), is(notNullValue()));
    }

    private void validateNotFoundResponse(Response response) {
        System.out.println("Description: Error: Not Found");
        assertThat(response.jsonPath().getString("err.message"), is(notNullValue()));
    }

    private void validateUnprocessableEntityResponse(Response response) {
        System.out.println("Description: Error: Unprocessable Entity");
        assertThat(response.jsonPath().getString("err.message"), is(notNullValue()));
    }
}
