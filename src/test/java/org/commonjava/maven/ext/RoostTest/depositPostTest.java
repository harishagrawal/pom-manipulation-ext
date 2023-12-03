// Test generated by RoostGPT for test restA-turbo-wo-asst-kore using AI Type Open AI and AI Model gpt-4-1106-preview

// Test generated for /deposit_post for http method type POST in rest-assured framework

// RoostTestHash=70db6d5eac

package org.commonjava.maven.ext.RoostTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.hamcrest.MatcherAssert;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DepositPostTest {
    
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = System.getenv("BASE_URL");
    }

    @Test  
    public void depositPostTest() {  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/org/commonjava/maven/ext/RoostTest/deposit_post.csv"))) {
            String headerLine = reader.readLine();
            String[] headers = headerLine.split(",");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                Map<String, String> map = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    map.put(headers[i], data[i]);
                }

                Response response = given()
                        .pathParam("koreUserId", map.get("koreUserId"))
                        .pathParam("botId", "\\1234567\\") // Using the user input priority
                        .pathParam("accountId", map.get("accountId"))
                        .header("Authorization", map.get("Authorization"))
                        .contentType(ContentType.JSON)
                        .body(createRequestBody(map))
                        .when()
                        .post("/deposit")
                        .then()
                        .extract().response();

                switch (response.statusCode()) {
                    case 200:
                        System.out.println("Description: Deposit success");
                        break;
                    case 400:
                        validateErrorResponse(response);
                        break;
                    case 404:
                        validateNotFoundResponse(response);
                        break;
                    case 422:
                        validateUnprocessableEntityResponse(response);
                        break;
                    default:
                        System.out.println("Unhandled status code received: " + response.statusCode());
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String createRequestBody(Map<String, String> map) {
        return "{\n" +
                "  \"customerId\": \"" + map.get("customerId") + "\",\n" +
                "  \"sourceAccountId\": \"" + map.get("sourceAccountId") + "\",\n" +
                "  \"amount\": \"" + map.get("amount") + "\",\n" +
                "  \"currency\": \"" + map.get("currency") + "\",\n" +
                "  \"image\": \"" + map.get("image") + "\"\n" +
                "}";
    }

    private void validateErrorResponse(Response response) {
        String errorMessage = response.jsonPath().get("err.message");
        MatcherAssert.assertThat("Error message should be a string", errorMessage, instanceOf(String.class));
        System.out.println("Description: Error: Bad Request - " + errorMessage);
    }

    private void validateNotFoundResponse(Response response) {
        String notFoundMessage = response.jsonPath().get("err.message");
        MatcherAssert.assertThat("Not Found message should be a string", notFoundMessage, instanceOf(String.class));
        System.out.println("Description: Error: Not Found - " + notFoundMessage);
    }

    private void validateUnprocessableEntityResponse(Response response) {
        String unprocessableEntityMessage = response.jsonPath().get("err.message");
        MatcherAssert.assertThat("Unprocessable Entity message should be a string", unprocessableEntityMessage, instanceOf(String.class));
        System.out.println("Description: Error: Unprocessable Entity - " + unprocessableEntityMessage);
    }
}
