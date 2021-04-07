package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RegisterUnsuccessfulTest {

    @Test
    public void registerUnsuccessful() {
        given().
                header("Content-Type", "application/json").
                body("{\"email\": \"sydney@fife\"}").
        when().
                post("https://reqres.in/api/register").
        then().
                log().all().
                statusCode(400).
                body("error", equalTo("Missing password"));
    }
}
