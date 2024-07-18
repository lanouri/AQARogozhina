import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void testPostmanEchoEndpoint() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .headers("x-forwarded-proto", "https",
                        "host", "postman-echo.com",
                        "accept", "*/*",
                        "accept-encoding", "gzip, deflate",
                        "cache-control", "no-cache",
                        "postman-token", "5c27cd7d-6b16-4e5a-a0ef-191c9a3a275f",
                        "user-agent", "PostmanRuntime/7.6.1",
                        "x-forwarded-port", "443")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.'x-forwarded-proto'", equalTo("https"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.accept", equalTo("*/*"))
                .extract().response();

        System.out.println(response.getBody().asString());
    }
}
