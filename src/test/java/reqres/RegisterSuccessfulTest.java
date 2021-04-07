package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RegisterSuccessfulTest {

    @Test
    public void registerSuccessful() {
        given().
                header("Content-Type", "application/json").
                body("{\"email\": \"eve.holt@reqres.in\",\"password\": \"pistol\"}").
        when().
                post("https://reqres.in/api/register").
        then().
                log().all().
                statusCode(200).
                body("id", equalTo(4),
                        "token", equalTo("QpwL5tke4Pnpja7X4"));
    }
}
