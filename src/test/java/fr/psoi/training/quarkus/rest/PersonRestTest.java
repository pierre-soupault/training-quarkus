package fr.psoi.training.quarkus.rest;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class PersonRestTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/")
          .then()
             .statusCode(200);
    }

}