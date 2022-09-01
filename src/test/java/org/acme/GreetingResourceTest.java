package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        RestAssured.given().contentType("application/json")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-type", "hello")
                .log().all().filter(new ResponseLoggingFilter())
                .post("/")
                .then().statusCode(200)
                .body(Matchers.containsString("Hello RESTEasy"));;
    }

}