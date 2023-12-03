// Test generated by RoostGPT for test restA-turbo-wo-asst-kore using AI Type Open AI and AI Model gpt-4-1106-preview

// Test generated for /deposit_post for http method type POST in rest-assured framework

// RoostTestHash=70db6d5eac

package org.commonjava.maven.ext.RoostTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DepositPostTest {

    private static final String BOT_ID = "1234567";

    @Before
    public void setup() {
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
                        .pathParam("botId", BOT_ID)
                        .pathParam("accountId", map.get("accountId"))
                        .header("Authorization", map.get("Authorization"))
                        .contentType(ContentType.JSON)
                        .body(createRequestBody(map))
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

    private void validateResponse(Response response) {
        switch (response.statusCode()) {
            case 200:
                System.out.println("Description: Deposit success");
                break;
            case 400:
                validateErrorResponse(response, "Bad Request");
                break;
            case 401:
                validateErrorResponse(response, "Authorization failed");
                break;
            case 404:
                validateNotFoundResponse(response);
                break;
            case 422:
                validateUnprocessableEntityResponse(response);
                break;
            default:
                throw new IllegalStateException("Unexpected response status: " + response.statusCode());
        }
    }

    private void validateErrorResponse(Response response, String message) {
        response.then().assertThat()
                .statusCode(400)
                .body("err.message", equalTo(message));
    }

    private void validateNotFoundResponse(Response response) {
        response.then().assertThat()
                .statusCode(404)
                .body("err.message", equalTo("Not Found"));
    }

    private void validateUnprocessableEntityResponse(Response response) {
        response.then().assertThat()
                .statusCode(422)
                .body("err.message", equalTo("Unprocessable Entity"));
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
}
