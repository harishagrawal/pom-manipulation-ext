/*
Test generated by RoostGPT for test metering-integration-rest using AI Type Vertex AI and AI Model code-bison-32k

{
  background: 'Given the API is available',
  rule: null,
  scenario: 'List Metering Labels\n' +
    '    When I send a GET request to "/v2.0/metering/metering-labels"\n' +
    '    Then the response status code should be 200\n' +
    '    And the response should be in JSON\n' +
    '    And the response should contain the following metering labels:\n' +
    '      | id                                   | tenant_id                           | description            | name   |\n' +
    '      | a6700594-5b7a-4105-8bfe-723b346ce866 | 45345b0ee1ea477fac0f541b2cb79cd4   | label1 description     | label1 |\n' +
    '      | e131d186-b02d-4c0b-83d5-0c0725c4f812 | 45345b0ee1ea477fac0f541b2cb79cd4   | label2 description     | label2 |',
  title: 'List Metering Labels'
}

*/
package org.commonjava.maven.ext.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "List Metering Labels" )
public class listMeteringLabelsTest
{
    @Test
    public void listMeteringLabels()
    {
        //Setting up the baseURI and basePath
        RestAssured.baseURI = System.getenv( "ROOST_SERVER_URL" );
        RestAssured.basePath = "/v2.0/metering";

        //Preparing the request payload
        Map<String, Object> payload = new HashMap<>();

        //Preparing the request headers
        Map<String, String> headers = new HashMap<>();
        headers.put( "Content-Type", "application/json" );

        //Sending a GET request to the "/metering-labels" endpoint
        Response response = given()
                .headers( headers )
                .body( payload )
                .when()
                .get( "/metering-labels" );

        //Validating the response status code
        assertEquals( 200, response.getStatusCode(), "The response status code should be 200." );

        //Validating the response content type
        assertEquals( "application/json", response.getContentType(), "The response should be in JSON." );

        //Extracting the response body as a List of Maps
        List<Map<String, Object>> meteringLabels = response.getBody().as( List.class );

        //Validating the number of metering labels in the response
        assertEquals( 2, meteringLabels.size(), "The response should contain 2 metering labels." );

        //Validating the details of the first metering label
        Map<String, Object> firstMeteringLabel = meteringLabels.get( 0 );
        assertEquals( "a6700594-5b7a-4105-8bfe-723b346ce866", firstMeteringLabel.get( "id" ), "The ID of the first metering label should be 'a6700594-5b7a-4105-8bfe-723b346ce866'." );
        assertEquals( "45345b0ee1ea477fac0f541b2cb79cd4", firstMeteringLabel.get( "tenant_id" ), "The Tenant ID of the first metering label should be '45345b0ee1ea477fac0f541b2cb79cd4'." );
        assertEquals( "label1 description", firstMeteringLabel.get( "description" ), "The Description of the first metering label should be 'label1 description'." );
        assertEquals( "label1", firstMeteringLabel.get( "name" ), "The Name of the first metering label should be 'label1'." );

        //Validating the details of the second metering label
        Map<String, Object> secondMeteringLabel = meteringLabels.get( 1 );
        assertEquals( "e131d186-b02d-4c0b-83d5-0c0725c4f812", secondMeteringLabel.get( "id" ), "The ID of the second metering label should be 'e131d186-b02d-4c0b-83d5-0c0725c4f812'." );
        assertEquals( "45345b0ee1ea477fac0f541b2cb79cd4", secondMeteringLabel.get( "tenant_id" ), "The Tenant ID of the second metering label should be '45345b0ee1ea477fac0f541b2cb79cd4'." );
        assertEquals( "label2 description", secondMeteringLabel.get( "description" ), "The Description of the second metering label should be 'label2 description'." );
        assertEquals( "label2", secondMeteringLabel.get( "name" ), "The Name of the second metering label should be 'label2'." );
    }
}
