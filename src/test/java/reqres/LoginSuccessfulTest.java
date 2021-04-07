package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginSuccessfulTest {

    @Test
    public void loginSuccessful() {
        given().
                header("Content-Type", "application/json").
                body("{\"email\": \"eve.holt@reqres.in\",\"password\": \"cityslicka\"}").
        when().
                post("https://reqres.in/api/login").
        then().
                log().all().
                statusCode(200).
                body("token", equalTo("QpwL5tke4Pnpja7X4"));
    }
}
