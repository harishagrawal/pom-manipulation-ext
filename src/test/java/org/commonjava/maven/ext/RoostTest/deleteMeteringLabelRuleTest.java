/*
Test generated by RoostGPT for test metering-integration-rest using AI Type Vertex AI and AI Model code-bison-32k

{
  background: 'Given the API is available',
  rule: null,
  scenario: 'Delete Metering Label Rule\n' +
    '    When I send a DELETE request to "/v2.0/metering/metering-label-rules/9536641a-7d14-4dc5-afaf-93a973ce0eb8"\n' +
    '    Then the response status code should be 204',
  title: 'Delete Metering Label Rule'
}

*/
package org.commonjava.maven.ext.RoostTest;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class deleteMeteringLabelRuleTest {

    private static Map<String, String> headers = new HashMap<>();
    private static RequestSpecification requestSpec;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = System.getenv("{{ROOST_SERVER_URL}}");
        headers.put("Content-Type", "application/json");

        requestSpec = given()
                .headers(headers);
    }

    @Test
    public void deleteMeteringLabelRule() {
        // GIVEN:
        // The API is available

        // WHEN:
        // I send a DELETE request to "/v2.0/metering/metering-label-rules/9536641a-7d14-4dc5-afaf-93a973ce0eb8"

        given()
                .spec(requestSpec)
                .delete("/v2.0/metering/metering-label-rules/9536641a-7d14-4dc5-afaf-93a973ce0eb8")

        // THEN:
        // The response status code should be 204

        .then()
                .statusCode(204);
    }
}
