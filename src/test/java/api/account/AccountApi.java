package api.account;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

public class AccountApi {

    @Test
    void authorized() {
        String authData = "";

        given()
                .body(authData)
                .contentType(JSON)
                .log().uri()
                .log().body()
                .log().headers()

                .when()
                .post("https://")

                .then()
                .log().status()
                .log().body()
                .statusCode(200);
    }
}
