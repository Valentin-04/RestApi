package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginUnsuccessfulTest {

    @Test
    public void loginUnsuccessful() {
        given().
                header("Content-Type", "application/json").
                body("{\"email\": \"peter@klaven\"}").
        when().
                post("https://reqres.in/api/login").
        then().
                log().all().
                statusCode(400).
                body("error", equalTo("Missing password"));
    }
}
