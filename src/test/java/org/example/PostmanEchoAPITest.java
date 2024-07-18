import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanEchoAPITest {

    @Test
    public void testPostRawText() {
        String requestBody = "This is a sample raw text";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }
}