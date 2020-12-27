package io.kornys.kmcli;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;

@QuarkusTest
public class AmqpCliTest {

    @Test
    public void testLastMessage() {
        given()
                .when().get("/consumer/last")
                .then()
                .statusCode(200)
                .body(not(nullValue()));
    }

    @Test
    public void testAllMessage() {
        given()
                .when().get("/consumer/all")
                .then()
                .statusCode(200)
                .body(not(nullValue()));
    }

}